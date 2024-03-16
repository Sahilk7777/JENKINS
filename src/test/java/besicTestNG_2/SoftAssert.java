package besicTestNG_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert {
	public class Softassert {

		@Test
		public void Myntra()
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.myntra.com/");
			String actual = driver.getCurrentUrl();
			String Expected = "https://www.myntra.com/";
			SoftAssert sa=new SoftAssert();
			sa.assertEquals(actual, Expected);
			System.out.println("hellloooo");
			sa.assertAll();
			
		
		}}	

}
