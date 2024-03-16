package objectReposetory_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import commanUtils.WebdriverUtils;
public class HomePage extends WebdriverUtils{
	//Identify organization
	@FindBy(xpath = "(//a[text()='Organizations'])[1]")
	private WebElement Organization;
	//identify contact
	@FindBy(xpath  ="//a[text()='Contacts']")
	private WebElement Contacts;
	//identify img
	@FindBy(css = "img[src='themes/softed/images/user.PNG']")
	private WebElement img;
	//identify logout
	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signout;
	public WebElement getOrganization() {
		return Organization;
	}
	public WebElement getContacts() {
		return Contacts;
	}
	public WebElement getImg() {
		return img;
	}
	public WebElement getSignout() {
		return signout;
	}

	public void Home()
	{
		Organization.click();
	}
	@Override
	public void mousehover(WebDriver driver, WebElement element) {
		// TODO Auto-generated method stub
		super.mousehover(driver, img);
	}
	

}
