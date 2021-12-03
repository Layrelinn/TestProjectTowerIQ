package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CompanyClientLandingPage extends BasePage {
    @FindBy(xpath = "//p[text()='Prospect']")
    private WebElement currentLifecycleStageOnClientLanding;

    @FindBy(xpath = "//h1[contains(@class,'MuiTypography-root')]")
    private WebElement currentCompanyNameFromHeader;

    @FindBy(xpath = "//h1[contains(@class,'MuiTypography-root')]//span[2]")
    private WebElement companyTypeLabel;

    @FindBy(id = "transactionTabClientInformation")
    private WebElement clientInformationTab;

    @FindBy(id = "tabDropDown")
    private WebElement schedulesDropdown;

    @FindBy(id = "transactionTab")
    private WebElement scheduleOptionFromDropdown;

    @FindBy(id = "clientActionsButton")
    private WebElement actionsDropdown;

    @FindBy(xpath = "//p[text()='Add schedule']")
    private WebElement addNewScheduleOption;

    @FindBy(id = "type0")
    private WebElement blankScheduleOption;

    @FindBy(id = "create-schedule-button-next")
    private WebElement createScheduleNextButton;

    @FindBy(id = "1114355413540479651366877899")
    private WebElement specificScheduleTemplate;

    @FindBy(id = "schedule-name")
    private WebElement newScheduleNameInput;

    @FindBy(id = "create-schedule-button-confirm")
    private WebElement finishScheduleCreationButton;

    @FindBy(xpath = "//p[contains(text(),'Automation')]")
    private WebElement scheduleName;

    public CompanyClientLandingPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public String getCompanyTypeFromLabel() {
        WebDriverWait waitForOne = new WebDriverWait(getDriver(), 10);
        waitForOne.until(ExpectedConditions.presenceOfElementLocated
                (By.xpath("//h1[contains(@class,'MuiTypography-root')]//span[2]")));
        return companyTypeLabel.getText();
    }

    public CompanyClientLandingPage clickOnClientInformationTab() {
        clientInformationTab.click();
        return this;
    }

    public CompanyClientLandingPage clickOnSchedulesDropdown() {
        schedulesDropdown.click();
        return this;
    }

    public CompanyClientLandingPage clickOnScheduleOptionFromDropdown() {
        scheduleOptionFromDropdown.click();
        return this;
    }

    public CompanyClientLandingPage clickOnActionsDropdown() {
        actionsDropdown.click();
        return this;
    }

    public CompanyClientLandingPage clickOnAddScheduleOption() {
        addNewScheduleOption.click();
        return this;
    }

    public CompanyClientLandingPage clickOnBlankScheduleOption() {
        blankScheduleOption.click();
        return this;
    }

    public CompanyClientLandingPage clickOnNextButtonInCreateScheduleModal() {
        createScheduleNextButton.click();
        return this;
    }

    public CompanyClientLandingPage clickOnSpecificScheduleTemplateFromList() {
        specificScheduleTemplate.click();
        return this;
    }

    public CompanyClientLandingPage enterScheduleName(String validScheduleName) {
        newScheduleNameInput.click();
        newScheduleNameInput.sendKeys(validScheduleName);
        return this;
    }

    public CompanyClientLandingPage clickOnFinishCreateNewScheduleButton() {
        finishScheduleCreationButton.click();
        return this;
    }

    public String getScheduleName() {
        return scheduleName.getText();
    }

}
