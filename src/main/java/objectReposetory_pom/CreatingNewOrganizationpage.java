package objectReposetory_pom;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import commonutils_2.WebDriverUtils;
public class CreatingNewOrganizationpage {
	
	WebDriverUtils wutil=new WebDriverUtils();
	@FindBy(name = "accountname")
	private WebElement OrganizationNameTF;
	@FindBy(xpath = "(//input[@name='assigntype'])[2]")
	private WebElement groupbutton;
	//identify dropdown
	@FindBy(name = "assigned_group_id")
	private WebElement dropdown;
	@FindBy(xpath = "//input[@name='button'][1]")
	private WebElement Savebtn;
	//create method
	
	public void orginfo(String Orgnamedata)
	{
		OrganizationNameTF.sendKeys(Orgnamedata);
		groupbutton.click();
	}
	public WebElement getOrganizationNameTF() {
		return OrganizationNameTF;
	}

	public void setOrganizationNameTF(WebElement organizationNameTF) {
		OrganizationNameTF = organizationNameTF;
	}

	public WebElement getGroupbutton() {
		return groupbutton;
	}

	public void setGroupbutton(WebElement groupbutton) {
		this.groupbutton = groupbutton;
	}

	public WebElement getDropdown() {
		return dropdown;
	}

	public void setDropdown(WebElement dropdown) {
		this.dropdown = dropdown;
	}

	public WebElement getSavebtn() {
		return Savebtn;
	}

	public void setSavebtn(WebElement savebtn) {
		Savebtn = savebtn;
	}




	
	

}
