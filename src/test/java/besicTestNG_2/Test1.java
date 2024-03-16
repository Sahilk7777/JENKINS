package besicTestNG_2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;
public class Test1 {
WebDriver driver;
	
		@Test(invocationCount = 2)
		public void Flipcart()
		{
			 driver=new ChromeDriver();
			 driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
		}
		@Test (invocationCount = 2)
		public void Amazon()
		{
			 driver=new ChromeDriver();
			 driver.manage().window().maximize();
			driver.get("https://www.amazon.com/");
		}

	}


