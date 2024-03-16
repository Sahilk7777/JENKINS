package objectReposetory_pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Organizationspage {
	// identify create organization--(+)
	@FindBy(css = "img[src='themes/softed/images/btnL3Add.gif']")
	WebElement createorganization;

	public WebElement getCreateorganization() {
		return createorganization;
	}

}
