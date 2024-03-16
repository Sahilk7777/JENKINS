package vtigercrm;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import commanUtils.Propp_1;

public class Pract {
	@Test
public void practtest() throws IOException
{
	Propp_1 p1= new Propp_1();
	WebDriver driver=new ChromeDriver();
	String NAME = p1.getDataFromPropertyFile("Myname");
	String LNAME = p1.getDataFromPropertyFile("Lastname");
	String CON = p1.getDataFromPropertyFile("contact");
	driver.get(NAME);
	
}
}
