package vtigercrm;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import commanUtils.ExcelUtils;
import commanUtils.JavaUtils;
import commanUtils.PropertyFileUtil;
import commanUtils.WebdriverUtils;

public class Leads {
	@Test
	public void LeadsTest() throws IOException,InterruptedException
	{
		PropertyFileUtil putils=new PropertyFileUtil();
		WebdriverUtils wutils=new WebdriverUtils();
		ExcelUtils eutil=new ExcelUtils();
		JavaUtils jutils=new JavaUtils();
		WebDriver driver=new ChromeDriver();
	wutils.maximize(driver);
	wutils.implicitwait(driver);
	String Last = eutil.getDataFromExcel("Leads", 1, 1);
	String First = eutil.getDataFromExcel("Leads", 0, 1);
	String COMP = eutil.getDataFromExcel("Leads",2 , 1);
	String URL = putils.getDataFromPropertyFile("Url");
	String USER = putils.getDataFromPropertyFile("Username");
	String PASS = putils.getDataFromPropertyFile("Password");
	String grp = eutil.getDataFromExcel("Leads", 3, 1);
	//String FN = eutils.getDataFromExcel("Leads", 1, 1);
	driver.get(URL);
	driver.findElement(By.cssSelector("input[name='user_name']")).sendKeys(USER);
	driver.findElement(By.cssSelector("input[name='user_password']")).sendKeys(PASS);
	driver.findElement(By.id("submitButton")).click();
	driver.findElement(By.xpath("(//a[text()='Leads'])[1]")).click();
	driver.findElement(By.cssSelector("img[src='themes/softed/images/btnL3Add.gif']")).click();
	driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys(First);
	driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys(Last);
	driver.findElement(By.cssSelector("input[name='company']")).sendKeys(COMP);
	driver.findElement(By.xpath("//input[@name='assigntype'][2]")).click();
	WebElement drop = driver.findElement(By.cssSelector("select[name='assigned_group_id']"));
	wutils.handeldropdown(drop, grp);
	
		
	}

}
