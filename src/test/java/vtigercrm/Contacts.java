package vtigercrm;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import commanUtils.ExcelUtils;
import commanUtils.JavaUtils;
import commanUtils.ListnerImplimentation;
import commanUtils.PropertyFileUtil;
import commanUtils.WebdriverUtils;
@Listeners(ListnerImplimentation.class)
public class Contacts {
	@Test
	public void Contactstest() throws IOException, InterruptedException
	{
	PropertyFileUtil putil=new PropertyFileUtil();
	WebdriverUtils wutil=new WebdriverUtils();
	ExcelUtils eutil=new ExcelUtils();
	JavaUtils jutil=new JavaUtils();
	WebDriver driver=new ChromeDriver();
	String Firstname = eutil.getDataFromExcel("Contacts", 0, 1);
	String Lastname = eutil.getDataFromExcel("Contacts", 1, 1);
	String ORGNAME = eutil.getDataFromExcel("Contacts", 3, 1);
	String URL=putil.getDataFromPropertyFile("Url");
	String USERNAME=putil.getDataFromPropertyFile("Username");
	String PASSWORD=putil.getDataFromPropertyFile("Password");
	//to launch the web application
	driver.get(URL);
	//to maximize the window
	wutil.maximize(driver);
	//to apply wait
	wutil.implicitwait(driver);
	driver.findElement(By.name("user_name")).sendKeys(USERNAME);
	driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
	driver.findElement(By.id("submitButton")).click();
	driver.findElement(By.xpath("(//td[@class='tabUnSelected'])[4]")).click();
	driver.findElement(By.cssSelector("img[alt='Create Contact...']")).click();
	driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys(Firstname);
	driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys(Lastname);
	
	//to fail test script intentionally
	WebElement chk = driver.findElement(By.name("notify_owner"));
	Assert.assertTrue(chk.isSelected());
	
	driver.findElement(By.xpath("//input[@name='assigntype'][2]")).click();
	WebElement drop = driver.findElement(By.name("assigned_group_id"));
	//WebElement drop = driver.findElement(By.xpath("//option[text()='Team Selling']"));
	Select s=new Select(drop);
	//s.selectByVisibleText("Team Selling");
	wutil.handeldropdown(drop,"Team Selling");
	driver.findElement(By.xpath("(//img[@alt='Select'])[1]")).click();
	//transfer the driver controll from p win to c win
	wutil.switchtowindow(driver,"http://localhost:8888/index.php.pune?module=Accounts&action=Popup&popuptype=specific_contact_account_address&form=TasksEditView&form_submit=false&fromlink=&recordid=");
	driver.findElement(By.id("search_txt")).sendKeys(ORGNAME);
	driver.findElement(By.cssSelector("input[name='search']")).click();
	driver.findElement(By.xpath("//a[text()='HP']")).click();
	
	//transfer the controll from child window to perent window....
	wutil.switchtowindow(driver,"http://localhost:8888/index.php?module=Contacts&action=EditView&return_action=DetailView&parenttab=Marketing");
//	Assert.assertEquals(driver, "pune");
	driver.findElement(By.xpath("(//input[@name='button'])[1]")).click();
	Thread.sleep(2000);
	WebElement img = driver.findElement(By.cssSelector("img[src='themes/softed/images/user.PNG']"));
	wutil.mousehover(driver, img);
	driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	//to take Screenshot of contact
	//wutil.SC(driver,"Contacts");
	
	
	
	
	}
	

}
