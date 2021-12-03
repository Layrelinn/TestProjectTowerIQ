package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransactionLandingPage extends BasePage {

    @FindBy(xpath = "//div[contains(text(),'TS')]")
    private WebElement transactionNameHeader;

    public TransactionLandingPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public String getTransactionNameFromHeader() {
        return transactionNameHeader.getText();
    }

}
