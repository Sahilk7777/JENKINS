package vtigerCRM_2;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import commanUtils.WebdriverUtils;
import commonutils_2.Excelutils;
import commonutils_2.Propertyfileutils;
public class Contacts {
	public static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		Propertyfileutils putil=new Propertyfileutils();
		Excelutils eutils=new Excelutils();
		WebdriverUtils wutil=new WebdriverUtils ();
		String Browser	=putil.getDataFromPropertyFile("Browser");
		String URL=	putil.getDataFromPropertyFile("URL");
		String USER=putil.getDataFromPropertyFile("Username");
		String PASS=putil.getDataFromPropertyFile("Password");	
		String Firstname = eutils.getDataFromExcelFile("Contacts", 0, 1);
		String Lastname = eutils.getDataFromExcelFile("Contacts", 1, 1);
		String ORGNAME = eutils.getDataFromExcelFile("Contacts", 2, 1);
		if(Browser.equals("Chrome"))
		{
	          driver=new ChromeDriver();
		}
		else if(Browser.equals("Firefox"))
		{
			 driver =new FirefoxDriver();
		}
		else
		{
			 driver=new EdgeDriver();
		}
		//to launch the application
		driver.get(URL);
		driver.manage().window().maximize();
		//login to application
		driver.findElement(By.name("user_name")).sendKeys(USER);
		driver.findElement(By.name("user_password")).sendKeys(PASS);
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.cssSelector("img[alt='Create Contact...']")).click();
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys(Firstname);
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys(Lastname);
		WebElement drop = driver.findElement(By.name("assigned_group_id"));
		driver.findElement(By.xpath("//input[@name='assigntype'][2]")).click();
		//WebElement drop = driver.findElement(By.xpath("//option[text()='Team Selling']"));
	   wutil.handeldropdown(drop, ORGNAME);
	   driver.findElement(By.xpath("(//img[@alt='Select'])[1]")).click();
	   wutil.switchtowindow(driver,"http://localhost:8888/index.php?module=Accounts&action=Popup&popuptype=specific_contact_account_address&form=TasksEditView&form_submit=false&fromlink=&recordid=");
	   driver.findElement(By.id("search_txt")).sendKeys("HP");
	   driver.findElement(By.name("search")).click();
	   driver.findElement(By.xpath("//a[text()='HP']")).click();
	   wutil.switchtowindow(driver,"http://localhost:8888/index.php?module=Contacts&action=EditView&return_action=DetailView&parenttab=Marketing");
	   Thread.sleep(2000);
	  WebElement HOver = driver.findElement(By.cssSelector("img[src='themes/softed/images/user.PNG']"));
	  Thread.sleep(2000);
	   wutil.mousehover(driver,HOver);
	   driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	 //  driver.findElement(By.xpath("(//input[@name='button'])[1]")).click();
		
		
	}
}
