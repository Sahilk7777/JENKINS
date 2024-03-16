package vtigerCRM_2;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import commonutils_2.Excelutils;
import commonutils_2.Propertyfileutils;
public  class Organizations 
{
public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Propertyfileutils putil=new Propertyfileutils();
		Excelutils eutils=new Excelutils();
		String Browser	=putil.getDataFromPropertyFile("Browser");
		String URL=	putil.getDataFromPropertyFile("URL");
		String USER=putil.getDataFromPropertyFile("Username");
		String PASS=putil.getDataFromPropertyFile("Password");	
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
		driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
		driver.findElement(By.cssSelector("img[src='themes/softed/images/btnL3Add.gif']")).click();
		
		String ORGNAME = eutils.getDataFromExcelFile("Organizations", 0, 1);
		String grd = eutils.getDataFromExcelFile("Organizations", 1, 1);
		driver.findElement(By.name("accountname")).sendKeys(ORGNAME );
	}

}
