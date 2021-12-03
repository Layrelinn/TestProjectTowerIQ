import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SignInPage;

public class NewScheduleForCompanyTest extends BaseTest {

    @Test
    public void NewScheduleForCompanyTest() {
        SignInPage signInPage = new SignInPage();
        String validScheduleName = "Automation " + randomNumber;
        String test = "test";

        String actualScheduleName = signInPage.enterValidEmailAddress(validEmailAddress)
                .enterValidPassword(validPassword)
                .clickOnSignInButton()
                .clickOnCompaniesSideMenuItem()
                .clickOnWarrenCompanyLink()
                .clickOnClientInformationTab()
                .clickOnSchedulesDropdown()
                .clickOnScheduleOptionFromDropdown()
                .clickOnActionsDropdown()
                .clickOnAddScheduleOption()
                .clickOnBlankScheduleOption()
                .clickOnNextButtonInCreateScheduleModal()
                .clickOnSpecificScheduleTemplateFromList()
                .enterScheduleName(validScheduleName)
                .clickOnFinishCreateNewScheduleButton()
                .getScheduleName();

        Assert.assertEquals(actualScheduleName, test);

    }

}
