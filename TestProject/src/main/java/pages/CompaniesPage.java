package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompaniesPage extends BasePage {
    @FindBy(id = "clientCreate")
    private WebElement createNewCompanyButton;

    @FindBy(id = "Client")
    private WebElement clientCompanyTypeCheckbox;

    @FindBy(id = "createCompanyNext")
    private WebElement createCompanyNextButton;

    @FindBy(id = "clientName")
    private WebElement clientNameInput;

    @FindBy(id = "lifecycleStage")
    private WebElement lifecycleStageDropdown;

    @FindBy(xpath = "//div[@id='lifecycleStage']//*[text()='Prospect']")
    private WebElement selectProspectLifecycleStage;

    @FindBy(id = "createCompanyFinish")
    private WebElement createNewCompanyFinishButton;

    @FindBy(id = "avatarCellWarren-0")
    private WebElement warrenClientCompanyLink;

    public CompaniesPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public CompaniesPage clickOnCreateCompanyButton() {
        createNewCompanyButton.click();
        return this;
    }

    public CompaniesPage clickOnClientTypeCheckbox() {
        clientCompanyTypeCheckbox.click();
        return this;
    }

    public CompaniesPage clickOnCreateCompanyNextButton() {
        createCompanyNextButton.click();
        return this;
    }

    public CompaniesPage enterClientName(String validClientName) {
        clientNameInput.click();
        clientNameInput.sendKeys(validClientName);
        return this;
    }

    public CompaniesPage setLifecycleStage() {
        lifecycleStageDropdown.click();
        selectProspectLifecycleStage.click();
        return this;
    }

    public CompanyClientLandingPage clickOnFinishButton() {
        createNewCompanyFinishButton.click();
        return new CompanyClientLandingPage();
    }

    public CompanyClientLandingPage clickOnWarrenCompanyLink() {
        warrenClientCompanyLink.click();
        return new CompanyClientLandingPage();
    }

}
