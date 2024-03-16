package objectReposetory_pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Contactspage {
	@FindBy(css = "img[alt='Create Contact...']")
	WebElement AddContactButton;

	public WebElement getAddContactButton() {
		return AddContactButton;
	}

	public void setAddContactButton(WebElement addContactButton) {
		AddContactButton = addContactButton;
	}

}
