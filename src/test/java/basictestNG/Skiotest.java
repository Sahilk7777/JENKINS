package basictestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Skiotest {

	@Test
	public void facebook()
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String actual =driver.getCurrentUrl();
		String expectedurl = "https://www.faceboook.com";
		Assert.assertEquals(actual,expectedurl);
	}
	@Test(dependsOnMethods = "facebook")
	public void swiggy()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
	}
	@Test(dependsOnMethods = "facebook")
	public void myntra()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
	}

}
