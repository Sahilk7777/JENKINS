package basicPOM;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import commanUtils.ExcelUtils;
import commanUtils.JavaUtils;
import commanUtils.PropertyFileUtil;
import commanUtils.WebdriverUtils;
import objectReposetory_pom.CreatingNewOrganizationpage;
import objectReposetory_pom.HomePage;
import objectReposetory_pom.LoginPage;
import objectReposetory_pom.Organizationspage;
public class BasePage{
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		//for imoprting from commonutils
		PropertyFileUtil putil=new PropertyFileUtil();
		ExcelUtils eutil=new ExcelUtils();
		WebdriverUtils wutil=new WebdriverUtils();
		JavaUtils jutil=new JavaUtils();
		
		
		String USERNAME=putil.getDataFromPropertyFile("Username");
		String PASS=putil.getDataFromPropertyFile("Password");
		String URL = putil.getDataFromPropertyFile("Url");
		String BROWSER = putil.getDataFromPropertyFile("Browser");
		
		String ORGNAME = eutil.getDataFromExcel("Organizations", 0, 1);
		String GROUP = eutil.getDataFromExcel("Organizations", 1, 1);
		
		
		//WebDriver driver=new ChromeDriver();	
		if(BROWSER.equals("Chrome"))
		{
			driver=new ChromeDriver();
		}else if(BROWSER.equals("Edge"))
		{
			driver=new EdgeDriver();
		}else
		{
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(URL);
		//create object of login page
		LoginPage lp=new LoginPage(driver);
		lp.Login(USERNAME, PASS);
		PageFactory.initElements(driver, lp);
		
		//lp.getLogin().click();
		//create object of home page
		HomePage hp=new HomePage();
		PageFactory.initElements(driver, hp);
		//hp.getOrganization().click();
		hp.Home();
				
		Organizationspage op=new Organizationspage();
		PageFactory.initElements(driver, op);
		op.getCreateorganization().click();
		
		CreatingNewOrganizationpage cnop=new CreatingNewOrganizationpage();
		//PageFactory.initElements(driver, cnop);
	//	cnop.getOrganizationNameTF().sendKeys(ORGNAME+jutil.getRandomNumber());
		
	//	cnop.getGroupbutton().click();
		cnop.orginfo(ORGNAME+jutil.getRandomNumber());
		
		//select support grp in dropdown
		
		wutil.handeldropdown(cnop.getDropdown(),GROUP);
		//click on save buttton
		
		cnop.getSavebtn().click();
		Thread.sleep(2000);
		//mousehover on img
		wutil.mousehover(driver, hp.getImg());
		
		//click on sign out button
		hp.getSignout().click();	
	
	}
}
