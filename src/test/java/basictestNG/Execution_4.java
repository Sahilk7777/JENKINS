package basictestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
//import com.beust.jcommander.Parameters;
import org.testng.annotations.Test;
@Parameters ("Browser")
public class Execution_4 {
	public WebDriver driver;
	// FOR CROSS-BROWSER EXECUTION in more then pne browser
	@Test
	public void MyntraTest(String Browser)
	{
		driver.get("https://www.myntra.com/");
		if(Browser.equals("Edge"))
		{
			 driver=new EdgeDriver();
		}
		else if(Browser.endsWith("Firefox"))
		{
			driver=new FirefoxDriver();
		
		}
		else if(Browser.equals("Chrome"))
		{
			driver=new ChromeDriver();
		}
		else
		{
			System.out.println("No browser available");
		}
	}
}
	


