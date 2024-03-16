package objectReposetory_pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewContactpage {
	@FindBy(css = "input[name='firstname']")
	WebElement FIRSTNAME;
	
	@FindBy(name = "lastname")
	WebElement LASTNAME;
	
	@FindBy(xpath = "//input[@name='assigntype'][2]")
	WebElement Redio;
	
	@FindBy(name = "assigned_group_id")
	WebElement Drop;
	
	@FindBy(xpath = "//input[@name='button'][1]")
	WebElement savebtn;
	
	@FindBy(css = "img[src='themes/softed/images/user.PNG']")
	WebElement GetIMG;
	
	@FindBy(xpath = "//a[text()='Sign Out']")
	WebElement signout;

	public WebElement getSignout() {
		return signout;
	}

	public void setSignout(WebElement signout) {
		this.signout = signout;
	}

	public WebElement getGetIMG() {
		return GetIMG;
	}

	public void setGetIMG(WebElement getIMG) {
		GetIMG = getIMG;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}

	public void setSavebtn(WebElement savebtn) {
		this.savebtn = savebtn;
	}

	public WebElement getDrop() {
		return Drop;
	}

	public void setDrop(WebElement drop) {
		Drop = drop;
	}

	public WebElement getRedio() {
		return Redio;
	}

	public void setRedio(WebElement redio) {
		Redio = redio;
	}

	public void setLASTNAME(WebElement lASTNAME) {
		LASTNAME = lASTNAME;
	}

	public WebElement getLASTNAME() {
		return LASTNAME;
	}

	public WebElement getFIRSTNAME() {
		return FIRSTNAME;
	}

	public void setFIRSTNAME(WebElement fIRSTNAME) {
		FIRSTNAME = fIRSTNAME;
	}

}
