package besicTestNG_2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test7 {

	@Test
	public void vtiger()
	{
		/*WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888");*/
		System.out.println("vtiger1");
		
	}
	@BeforeClass public void BC()
	{
		System.out.println("BeforeClass");
	}
	@AfterClass public void AC()
	{
		System.out.println("AfterClass");
		
	}
	@BeforeMethod public void BM()
	{
		System.out.println("BeforeMethod");
	}
	@AfterMethod public void AM ()
	{
		System.out.println("AfterMethod");
	}
	@BeforeSuite public void BS ()
	{
		System.out.println("BeforeSuite");
	}
	@AfterSuite public void AS()
	{
		System.out.println("AfterSuite");
	}

}
