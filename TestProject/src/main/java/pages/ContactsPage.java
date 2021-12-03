package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage extends BasePage {
    @FindBy(id = "create-contact-button")
    private WebElement createNewContactButton;

    @FindBy(id = "email")
    private WebElement emailAddressInputField;

    @FindBy(id = "firstName")
    private WebElement firstNameInputField;

    @FindBy(id = "lastName")
    private WebElement lastNameInputField;

    @FindBy(id = "createCompanyFinish")
    private WebElement finishContactCreatingButton;

    public ContactsPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public ContactsPage clickOnCreateNewContactButton() {
        createNewContactButton.click();
        return this;
    }

    public ContactsPage enterValidContactEmailAddress(String validContactEmailAddress) {
        emailAddressInputField.click();
        emailAddressInputField.sendKeys(validContactEmailAddress);
        return this;
    }

    public ContactsPage enterValidContactFirstName(String validContactFirstName) {
        firstNameInputField.click();
        firstNameInputField.sendKeys(validContactFirstName);
        return this;
    }

    public ContactsPage enterValidContactLastName(String validContactLastName) {
        lastNameInputField.click();
        lastNameInputField.sendKeys(validContactLastName);
        return this;
    }

    public ContactOtherLandingPage clickOnFinishContactCreatingButton() {
        finishContactCreatingButton.click();
        return new ContactOtherLandingPage();
    }

}
