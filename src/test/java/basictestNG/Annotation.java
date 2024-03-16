package basictestNG;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Annotation {
@BeforeTest
public void BM()
{
	System.out.println("Before");
	}
	@Test
	public void Myntra()
	{
		System.out.println("myntra");
		//ChromeDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("https://www.myntra.com/watch?f=Gender%3Amen%2Cmen%20women&rawQuery=watch");
	}
	@AfterMethod
	public void AM()
	{
		System.out.println("After method");
	}
	@BeforeClass
	public void BC()
	{
		System.out.println("BC");
	}
	@AfterClass
	public void AC()
	{
		System.out.println("AC");
	}
	@BeforeTest
	public void BT()
	{
		System.out.println("BT");
	}
	@AfterTest
	public void AT()
	{
		System.out.println("AT");
	}
	@BeforeSuite
	public void BS()
	{
		System.out.println("BS");
	}
	@AfterSuite
	public void AS()
	{
		System.out.println("AS");
	}
}
