package facebook;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import commanUtils.ExcelUtils;
import commanUtils.JavaUtils;
import commanUtils.WebdriverUtils;
import fbUtils.FBExecel;

public class Facebook {
	@Test
	public void Facebooktest() throws IOException,InterruptedException
	{

		//PropertyFileUtil putil=new PropertyFileUtil();
		FBExecel putil=new FBExecel();
		WebdriverUtils wutil=new WebdriverUtils();
		ExcelUtils eutil=new ExcelUtils();
		JavaUtils jutil=new JavaUtils();
		WebDriver driver=new ChromeDriver();
		
		 String Url = putil.getDataFromPropertyFile("URL");
		 driver.get(Url);
		
	}
	

}
