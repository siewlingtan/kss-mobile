package Steps;

import Base.BaseUtil;
import Pages.ViewNotificationsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import java.util.ArrayList;

public class ViewNotification extends BaseUtil {

    private final BaseUtil base;
    private final ViewNotificationsPage viewNotificationsPage;

    public ViewNotification(BaseUtil base) {
        this.base = base;

        this.viewNotificationsPage = new ViewNotificationsPage(base.Driver);
    }

/*    @And("^I click on Delivered tab$")
    public void iClickOnDeliveredTab() throws Throwable {

        // Click on Delivered tab

    }*/

    @And("^I click on View button$")
    public void iClickOnViewButton() throws Throwable {

        // Click on View button - This will open up the notification details page in new tab
        viewNotificationsPage.clickBtnView();

    }

    @Then("^I should be directed to View$")
    public void iShouldBeDirectedToView() throws Throwable {

        // Switch to new tab with notifications detail page
        ArrayList<String> tabs2 = new ArrayList<String>(base.Driver.getWindowHandles());
        base.Driver.switchTo().window(tabs2.get(1));

        // Get the notification title that is displayed on the page
        viewNotificationsPage.getNotificationTitleOnViewPage();

        // Display the notification title that is displayed on the page
        System.out.println("The title is " + viewNotificationsPage.getNotificationTitleOnViewPage());

    }


}
