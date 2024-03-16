package besicTestNG_2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Test_3 {
	@Test
	public void Myntra()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
	//	String RealTitle = driver.getTitle();
		//String FakeTitle = "Onlines Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra";
		//Assert.assertEquals(RealTitle, FakeTitle);
		WebElement STF = driver.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']"));
		//Assert.assertTrue(STF.isSelected());
		Assert.assertFalse(STF.isEnabled());
	}

}
