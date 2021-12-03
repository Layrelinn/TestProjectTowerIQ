package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class TransactionsPage extends BasePage {
    @FindBy(id = "transactionsCreate")
    private WebElement createNewTransactionButton;

    @FindBy(id = "commercial_client,")
    private WebElement commercialClientCheckbox;

    @FindBy(id = "createTSNext")
    private WebElement nextButton;

    @FindBy(id = "transactionName")
    private WebElement transactionNameInput;

    @FindBy(id = "client")
    private WebElement clientDropdown;

    @FindBy(xpath = "//div[@id='client']//*[text()='Second Agent company']")
    private WebElement clientNameFromDropdown;

    @FindBy(id = "transactionType")
    private WebElement transactionTypeDropdown;

    @FindBy(xpath = "//div[@id='transactionType']//*[text()='New business']")
    private WebElement transactionTypeFromDropdown;

    @FindBy(xpath = "//button[@id='createTSFinish']")
    private WebElement finishCreatingTransactionButton;

    public TransactionsPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public TransactionsPage clickOnCreateNewTransactionButton() {
        createNewTransactionButton.click();
        return this;
    }

    public TransactionsPage clickOnCommercialClientCheckbox() {
        commercialClientCheckbox.click();
        return this;
    }

    public TransactionsPage clickOnNextButton() {
        nextButton.click();
        return this;
    }

    public TransactionsPage enterTransactionName(String validTransactionName) {
        transactionNameInput.click();
        transactionNameInput.sendKeys(validTransactionName);
        return this;
    }

    public TransactionsPage selectClientName() {
        clientDropdown.click();
        clientNameFromDropdown.click();
        return this;
    }

    public TransactionsPage selectTransactionType() {
        transactionTypeDropdown.click();
        transactionTypeFromDropdown.click();
        return this;
    }

    public TransactionLandingPage clickOnFinishButton() {
        finishCreatingTransactionButton.click();
        return new TransactionLandingPage();
    }

}