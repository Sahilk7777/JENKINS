package objectReposetory_pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
		// TODO Auto-generated method stub
		//identify userame
		@FindBy(name="user_name")
		private WebElement usernametf;
		//identify pasword tf
		@FindBy(name="user_password")
		private WebElement passwordtf;
		//click on login
		@FindBy(id="submitButton")
		private WebElement login;
		
		public void Login(String usernamedata,String passworddata)
		{
			usernametf.sendKeys(usernamedata);
			passwordtf.sendKeys(passworddata);
			login.click();
		}
		
		//create a const
		public LoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		public WebElement getUsernametf() {
			return usernametf;
		}
		public void setUsernametf(WebElement usernametf) {
			this.usernametf = usernametf;
		}
		public WebElement getPasswordtf() {
			return passwordtf;
		}
		public void setPasswordtf(WebElement passwordtf) {
			this.passwordtf = passwordtf;
		}
		public WebElement getLogin() {
			return login;
		}
		public void setLogin(WebElement login) {
			this.login = login;
		}

}

