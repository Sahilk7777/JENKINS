package basicPOM;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import commanUtils.ExcelUtils;
import commanUtils.JavaUtils;
import commanUtils.PropertyFileUtil;
import commanUtils.WebdriverUtils;
import objectReposetory_pom.Contactspage;
import objectReposetory_pom.CreateNewContactpage;
import objectReposetory_pom.HomePage;
import objectReposetory_pom.LoginPage;

public class ContactBasicpage {
	public static WebDriver driver;
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		
		//for imoprting from commonutils
		PropertyFileUtil putil=new PropertyFileUtil();
		ExcelUtils eutil=new ExcelUtils();
		WebdriverUtils wutil=new WebdriverUtils();
		JavaUtils jutil=new JavaUtils();
		
		//Read data from propertyfiles
		String USERNAME=putil.getDataFromPropertyFile("Username");
		String PASS=putil.getDataFromPropertyFile("Password");
		String URL = putil.getDataFromPropertyFile("Url");
		String BROWSER = putil.getDataFromPropertyFile("Browser");
		
		//Read data from ExcelFile
		String Fname = eutil.getDataFromExcel("Contacts", 0, 1);
		String Lname = eutil.getDataFromExcel("Contacts", 1, 1);
		String SELECT = eutil.getDataFromExcel("Contacts", 2, 1);
		
		
		driver=new ChromeDriver();
		driver.get(URL);
		wutil.maximize(driver);
		
		
		LoginPage LP=new LoginPage();
		PageFactory.initElements(driver, LP);
		LP.getUsernametf().sendKeys(USERNAME);
		LP.getPasswordtf().sendKeys(PASS);
		LP.getLogin().click();
		
		
		
		HomePage HP=new HomePage();
		PageFactory.initElements(driver, HP);
		HP.getContacts().click();
		
		
		Contactspage CP=new Contactspage();
		PageFactory.initElements(driver, CP);
		CP.getAddContactButton().click();
		
		
		CreateNewContactpage CNCP=new CreateNewContactpage ();
		PageFactory.initElements(driver, CNCP);
		CNCP.getFIRSTNAME().sendKeys(Fname);;
		CNCP.getLASTNAME().sendKeys(Lname);
		CNCP.getRedio().click();
		wutil.handeldropdown(CNCP.getDrop(), SELECT);
		CNCP.getSavebtn().click();
		Thread.sleep(2000);
		wutil.mousehover(driver,CNCP.getGetIMG());
		CNCP.getSignout().click();
}
	}