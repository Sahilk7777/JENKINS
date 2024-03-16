package basictestNG;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Practies {

	@Test
	public void zomato()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/india");
	}
	@Test
	public void swiggy()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		String actualtitle = driver.getTitle();
		String expectedtitle = "Order is Food Online from India's Best Food Delivery Service | Swiggy";
		Assert.assertEquals(actualtitle,expectedtitle);
		System.out.println("match");
	}
	@Test
	public void ajio()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/?gad_source=1&gclid=Cj0KCQiA84CvBhCaARIsAMkAvkJ9I7_QPtTe4R4xXtACcJG16dtWb5_yGp0HVaOtX5r2pTzQAmjk840aAptmEALw_wcB");
		
	}
	@Test(dependsOnMethods = "swiggy")
	public void myntra()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
	}
}
