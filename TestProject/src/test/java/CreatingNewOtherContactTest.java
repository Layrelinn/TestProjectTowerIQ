import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SignInPage;

public class CreatingNewOtherContactTest extends BaseTest {

    @Test
    public void newOtherContactCreating() {
        SignInPage signInPage = new SignInPage();

        String validContactEmailAddress = "test+"+randomNumber+"@gmail.com";
        String validContactFirstName = "Test";
        String validContactLastName = "Contact";
        String expectedContactPersonaType = "Other";

        String actualContactPersonaType = signInPage.enterValidEmailAddress(validEmailAddress)
                .enterValidPassword(validPassword)
                .clickOnSignInButton()
                .clickOnContactsMenuItem()
                .clickOnCreateNewContactButton()
                .enterValidContactEmailAddress(validContactEmailAddress)
                .enterValidContactFirstName(validContactFirstName)
                .enterValidContactLastName(validContactLastName)
                .clickOnFinishContactCreatingButton()
                .getPersonaTypeFromContactInformation();

        Assert.assertEquals(actualContactPersonaType, expectedContactPersonaType);
    }

}
