package basictestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Execution_1 {
	
	//for group execution BY GROPUS
	@Test(groups="Shoping")
	public void MyntraTest()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
	}
	@Test(groups="Shoping")
	public void AjioTest()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/?gad_source=1&gclid=CjwKCAiAxaCvBhBaEiwAvsLmWFUFT4sRJpCw5QNrJFnTxoVx4t8R0uLBzzKwnhddnSesNxClWy6tcBoCWnYQAvD_BwE");
		
	}
	@Test(groups="Food")
	public void ZomatoTest()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/pune");
		
	}
	@Test(groups="Food")
	public void SwiggyTest()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
	}

}
