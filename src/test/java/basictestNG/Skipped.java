package basictestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Skipped {

	public static void main(String[] args) {
		/*// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		String Actualtitle = driver.getTitle();
		String Expectedtitle = "Onlines Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra";
		Assert.assertEquals(Actualtitle, Expectedtitle);
		//System.out.println(Actualtitle);*/
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		WebElement stf = driver.findElement(By.className("desktop-searchBar"));
		//Assert.assertTrue(stf.isDisplayed());
	//	Assert.assertTrue(stf.isSelected());
		//Assert.assertTrue(stf.isEnabled());
		//Assert.assertFalse();
		System.out.println("hello");
		

	}

}
