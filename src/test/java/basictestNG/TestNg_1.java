package basictestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNg_1 {
	 
		// TODO Auto-generated method stub
		@Test(invocationCount = 2)
		public void Facebook()
		{
			//System.out.println("facebook");
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
		}
		@Test(invocationCount = 2,priority=1)
		public void Ajio()
		{
		//	System.out.println("ajio");
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in/");
		}
		@Test(priority=0)
		public void Myntra()
		{
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.myntra.com/watch?f=Gender%3Amen%2Cmen%20women&rawQuery=watch");
		}
	}

