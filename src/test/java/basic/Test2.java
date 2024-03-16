package basic;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test2 {
public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		//To read data from property file
		FileInputStream fis=new FileInputStream("src\\test\\resources\\LoginC_2.properties");
		Properties p=new Properties();
		p.load(fis);
		String Browser=p.getProperty("Browser");
		String URL=p.getProperty("URL");
		String USER=p.getProperty("Username");
		String PASS=p.getProperty("Password");
		
		if(Browser.equals("Chrome"))
		{
	          driver=new ChromeDriver();
		}
		else if(Browser.equals("Firefox"))
		{
			 driver =new FirefoxDriver();
		}
		else
		{
			 driver=new EdgeDriver();
		}
		//to launch the application
		driver.get(URL);
		driver.manage().window().maximize();
		//login to application
		driver.findElement(By.name("user_name")).sendKeys(USER);
		driver.findElement(By.name("user_password")).sendKeys(PASS);
		driver.findElement(By.id("submitButton")).click();
	}
}
