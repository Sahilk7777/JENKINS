package basictestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertfalse {

	@Test
	public void myntra()
	{
	
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		WebElement stf = driver.findElement(By.className("desktop-searchBar"));
		Assert.assertFalse(stf.isSelected());
		System.out.println("hellooooooooo");
	}
}
