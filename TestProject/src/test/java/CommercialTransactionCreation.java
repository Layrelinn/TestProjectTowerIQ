import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SignInPage;

public class CommercialTransactionCreation extends BaseTest {

    @Test
    public void newCommercialTransactionCreating() {
        SignInPage signInPage = new SignInPage();

        String validTransactionName = "TS test"+randomNumber;

        String actualTransactionName =
                signInPage.enterValidEmailAddress(validEmailAddress)
                        .enterValidPassword(validPassword)
                        .clickOnSignInButton()
                        .clickOnTransactionSideMenuItem()
                        .clickOnCreateNewTransactionButton()
                        .clickOnCommercialClientCheckbox()
                        .clickOnNextButton()
                        .enterTransactionName(validTransactionName)
                        .selectClientName()
                        .selectTransactionType()
                        .clickOnFinishButton()
                        .getTransactionNameFromHeader();

        Assert.assertEquals(actualTransactionName, validTransactionName);

    }

}
