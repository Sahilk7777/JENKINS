package besicTestNG_2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Test_2 {
@Test
public void Ajio()
{
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.ajio.com/?gad_source=1&gclid=CjwKCAjw48-vBhBbEiwAzqrZVMKxe2F-xQI-b75JvfwmH0kN3HQcb_af7PVRNPgqTYVVgwMcdcTt_hoCvqgQAvD_BwE");
	String Actualurl = driver.getCurrentUrl();
	System.out.println(Actualurl);
	String ExpectedURL = "https://www.ajio.com/?gad_source/pune/mumbai";
	Assert.assertEquals(Actualurl, ExpectedURL);	
	}
}
