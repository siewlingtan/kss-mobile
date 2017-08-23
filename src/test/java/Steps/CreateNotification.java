package Steps;

import Base.BaseUtil;
import Pages.CreateNotificationPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class CreateNotification extends BaseUtil{

    private final BaseUtil base;
    private final CreateNotificationPage createNotificationPage;

    public CreateNotification(BaseUtil base) {
        this.base = base;
        this.createNotificationPage = new CreateNotificationPage(base.Driver);
   }

    @And("^I input title and content$")
    public void iInputTitleAndContent() throws Throwable {

        // Input notification title
        createNotificationPage.inputTitle();

        // Input notification content
        createNotificationPage.inputContent();
    }

    @And("^I input title and content for scheduled notification$")
    public void iInputTitleAndContentForScheduledNotification() throws Throwable {

        // Input notification title
        createNotificationPage.inputScheduledTitle();

        // Input notification content
        createNotificationPage.inputScheduledContent();
    }

    @And("^I click Next$")
    public void iClickNext() throws Throwable {

        // Wait till Next button is enabled then click
        createNotificationPage.clickNext();
    }

    @And("^I input MID$")
    public void iInputMID() throws Throwable {

        // Input MIDs
        createNotificationPage.inputMID();
    }

    @And("^I check on Email option$")
    public void iCheckOnEmailOption() throws Throwable {

        // Click on Email option
        createNotificationPage.selectEmailOption();
    }


    @And("^I click on Send Now$")
    public void iClickOnSendNow() throws Throwable {

        // Click Send Now
        createNotificationPage.clickSendNow();

    }

    @And("^I check on Send Later option$")
    public void iCheckOnSendLaterOption() throws Throwable {

        // Click on Send Later option
        createNotificationPage.clickSendLater();
    }

    @And("^I click on Submit$")
    public void iClickOnSubmit() throws Throwable {

        // Click Submit
        createNotificationPage.clickSubmit();

    }

    @Then("^I should see notification created successfully$")
    public void iShouldSeeNotificationCreatedSuccessfully() throws Throwable {

        // Wait till overlay shows up to verify message displayed in it
        createNotificationPage.getConfirmationMsg();

    }

}