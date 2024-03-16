package commonutils_2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	@BeforeSuite public void BS ()
	{
		System.out.println("BeforeSuite");
	}
	@BeforeClass public void BC()
	{
		System.out.println("BeforeClass");
	}
	@BeforeMethod public void BM()
	{
		System.out.println("BeforeMethod");
	}
	@AfterMethod public void AM ()
	{
		System.out.println("AfterMethod");
	}
	@AfterClass public void AC()
	{
		System.out.println("AfterClass");
		
	}
	@AfterSuite public void AS()
	{
		System.out.println("AfterSuite");
	}


}
