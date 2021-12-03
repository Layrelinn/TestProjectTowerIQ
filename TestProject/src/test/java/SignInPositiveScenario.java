import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SignInPage;

public class SignInPositiveScenario extends BaseTest {

    @Test
    public void positiveSignIn() {
        SignInPage signInPage = new SignInPage();

        String expectedUrl = "https://qa.toweriq.io/broker-dashboard";

        String actualUrl =
                signInPage.enterValidEmailAddress(validEmailAddress)
                        .enterValidPassword(validPassword)
                        .clickOnSignInButton()
                        .currentUrl();

        Assert.assertEquals(actualUrl, expectedUrl);

    }

}
