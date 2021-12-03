package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends BasePage {
    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailAddressInputField;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordInputField;

    @FindBy(xpath = "//button[@id='signInBtn']")
    private WebElement signInButton;

    public SignInPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public SignInPage enterValidEmailAddress(String validEmailAddress) {
        emailAddressInputField.click();
        emailAddressInputField.sendKeys(validEmailAddress);
        return this;
    }

    public SignInPage enterValidPassword(String validPassword) {
        passwordInputField.click();
        passwordInputField.sendKeys(validPassword);
        return this;
    }

    public HomePage clickOnSignInButton() {
        signInButton.click();
        return new HomePage();
    }

}
