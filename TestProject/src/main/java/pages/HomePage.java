package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {
    @FindBy(id = "sidebarMenuItemTransactions")
    private WebElement transactionSideMenuItem;

    @FindBy(id = "sidebarMenuItemCompanies")
    private WebElement companiesSideMenuItem;

    @FindBy(id = "sidebarMenuItemContacts")
    private WebElement contactsSideMenuItem;


    public HomePage() {
        PageFactory.initElements(getDriver(), this);
    }

    public String currentUrl() {
        WebDriverWait waitForOne = new WebDriverWait(getDriver(), 10);
        waitForOne.until(ExpectedConditions.presenceOfElementLocated(By.id("tiq-header-input")));
        return getDriver().getCurrentUrl();
    }

    public TransactionsPage clickOnTransactionSideMenuItem() {
        transactionSideMenuItem.click();
        return new TransactionsPage();
    }

    public CompaniesPage clickOnCompaniesSideMenuItem() {
        companiesSideMenuItem.click();
        return new CompaniesPage();
    }

    public ContactsPage clickOnContactsMenuItem() {
        contactsSideMenuItem.click();
        return new ContactsPage();
    }

}
