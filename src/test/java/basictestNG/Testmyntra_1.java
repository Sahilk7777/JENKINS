package basictestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testmyntra_1 {

	
	@Test
	public void Myntra()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		String actualurl = (driver.getCurrentUrl());
		String expectedurl = "https://www.myntra.com/pune";
		Assert.assertEquals(actualurl,expectedurl);
		System.out.println(actualurl);
		//System.out.println(driver.getTitle());
		if(expectedurl.equals("https://www.myntra.com/"))
		{
			System.out.println("match");
		}
		else
		{
			System.out.println("unmatch");
		}
	

	}}
