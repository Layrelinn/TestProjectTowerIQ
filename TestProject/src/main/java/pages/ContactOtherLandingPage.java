package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactOtherLandingPage extends BasePage {

    @FindBy(xpath = "//p[contains(text(),'Other')]")
    private WebElement personaTypeField;


    public ContactOtherLandingPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public String getPersonaTypeFromContactInformation() {
        return personaTypeField.getText();
    }

}
