package Steps;

import Base.BaseUtil;
import Pages.ViewNotificationsPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class ViewNotification extends BaseUtil {

    private BaseUtil base;

    public ViewNotification(BaseUtil base) {
        this.base = base;
    }


    @And("^I click on View button$")
    public void iClickOnViewButton() throws Throwable {

        // Click on View button
        base.Driver.findElement(By.xpath("//a[@type='button'][contains(text(),'View')]")).click();

    }

    @Then("^I should be directed to View$")
    public void iShouldBeDirectedToView() throws Throwable {

        // Switch to new tab
        ArrayList<String> tabs2 = new ArrayList<String>(base.Driver.getWindowHandles());
        base.Driver.switchTo().window(tabs2.get(1));

        // Directed to view notification page
        WebElement notificationTitleOnViewPage = base.Driver.findElement(By.xpath("//div[@class='form-group']/h2"));
        String getNotificationTitleOnViewPage = notificationTitleOnViewPage.getText();

        // Should read the title of the latest created notification
        System.out.println("The title is " + getNotificationTitleOnViewPage);

    }


}
