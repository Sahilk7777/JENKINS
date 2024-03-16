package commonutils_2;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class WebDriverUtils {
//public static WebDriver driver;
public void Switchwindow(WebDriver driver,String Expectedurl)
{
	Set<String> ids = driver.getWindowHandles();
	for(String w:ids)
	{
		String aurl = driver.switchTo().window(w).getCurrentUrl();
		System.out.println(aurl);
		String Expectedurl = "http://localhost:8888/index.php?module=Accounts&action=Popup&popuptype=specific_contact_account_address&form=TasksEditView&form_submit=false&fromlink=&recordid=";
		if(aurl.contains(Expectedurl))
		{
			break;
		}
	}

	}

}
