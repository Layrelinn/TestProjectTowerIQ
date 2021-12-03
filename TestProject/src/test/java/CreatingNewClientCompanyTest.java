import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SignInPage;

public class CreatingNewClientCompanyTest extends BaseTest {

    @Test
    public void newClientCompanyCreating() {

        SignInPage signInPage = new SignInPage();
        String validClientName = "Client Company" + randomNumber;
        String expectedCompanyLabel = "Client";

        String actualCompanyLabel = signInPage.enterValidEmailAddress(validEmailAddress)
                .enterValidPassword(validPassword)
                .clickOnSignInButton()
                .clickOnCompaniesSideMenuItem()
                .clickOnCreateCompanyButton()
                .clickOnClientTypeCheckbox()
                .clickOnCreateCompanyNextButton()
                .enterClientName(validClientName)
                .setLifecycleStage()
                .clickOnFinishButton()
                .getCompanyTypeFromLabel();

        Assert.assertEquals(actualCompanyLabel, expectedCompanyLabel);
    }

}
