package Steps;

import Base.BaseUtil;
import Pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class SelfServicesModule extends BaseUtil {

    private BaseUtil base;

    public SelfServicesModule(BaseUtil base) {
        this.base = base;
    }

    @Given("^I am logged in to KSS with correct \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iAmLoggedInToKSSWithCorrectAnd(String username, String password) throws Throwable {

        // Navigate to KSS login page
        base.Driver.navigate().to("http://kss-mobile.aws.kaplan.com.sg/");

        // Input login credentials
        LoginPage loginPage = new LoginPage(base.Driver);
        loginPage.Login(username, password);

        // Click Login
        loginPage.ClickLogin();

        // Verify that user is logged in by checking for presence of Logout link
        KSSPage kssPage = new KSSPage(base.Driver);
        Assert.assertEquals("Not logged in", kssPage.logoutLink.isDisplayed(), true);
    }

    @When("^I click on Self-Services link$")
    public void iClickOnSelfServicesLink() throws Throwable {

        // Click on Self-Services link
        KSSPage kssPage = new KSSPage(base.Driver);
        kssPage.clickSelfServices();
    }

    @Then("^I should be directed to Self-Services module$")
    public void iShouldBeDirectedToSelfServicesModule() throws Throwable {

        // Verify header text on page
        SelfServicesPage selfServicesPage = new SelfServicesPage(base.Driver);
        Assert.assertEquals("Self Services", selfServicesPage.getSelfServicesHeaderText());
    }

    @And("^I click on View Notifications link$")
    public void iClickOnViewNotificationsLink() throws Throwable {

        // Click on View Notifications link
        SelfServicesPage selfServicesPage = new SelfServicesPage(base.Driver);
        selfServicesPage.clickViewNotificationsLink();
    }

    @Then("^I should be directed to Notifications Listing Page$")
    public void iShouldBeDirectedToNotificationsListingPage() throws Throwable {

        // Verify header text on page
        ViewNotificationsPage viewNotificationsPage = new ViewNotificationsPage(base.Driver);
        Assert.assertEquals("Notifications", viewNotificationsPage.getNotificationsHeaderText());
    }

    @And("^I click on Create Notification link$")
    public void iClickOnCreateNotificationLink() throws Throwable {

        // Click on Create Notification link
        SelfServicesPage selfServicesPage = new SelfServicesPage(base.Driver);
        selfServicesPage.clickCreateNotificationsLink();
    }

    @Then("^I should be directed to Create Notification Page$")
    public void iShouldBeDirectedToCreateNotificationPage() throws Throwable {

        // Verify elements on page
        CreateNotificationPage createNotificationPage = new CreateNotificationPage(base.Driver);
        Assert.assertEquals("Text field for title is not displayed.", createNotificationPage.txtNotificationTitle.isDisplayed(),true);

    }

    @And("^I click on Academic Checklists link$")
    public void iClickOnAcademicChecklistsLink() throws Throwable {

        // Click on Academic Checklists link
        SelfServicesPage selfServicesPage = new SelfServicesPage(base.Driver);
        selfServicesPage.clickAcadChecklistsLink();
    }

    @Then("^I should be directed to Academic Checklists Listing Page$")
    public void iShouldBeDirectedToAcademicChecklistsListingPage() throws Throwable {

        // Verify header text on page
        AcadChecklistsPage acadChecklistsPage = new AcadChecklistsPage(base.Driver);
        Assert.assertEquals("Academic Checklists", acadChecklistsPage.getAcadChecklistsHeaderText());
    }

    @And("^I click on Create Checklist Group link$")
    public void iClickOnCreateChecklistGroupLink() throws Throwable {

        // Click on Create Checklist Group link
        SelfServicesPage selfServicesPage = new SelfServicesPage(base.Driver);
        selfServicesPage.clickCreateChecklistGrpLink();
    }

    @Then("^I should be directed to Create Checklist Group Page$")
    public void iShouldBeDirectedToCreateChecklistGroupPage() throws Throwable {

        // Verify header text on page
        CreateChecklistGrpPage createChecklistGrpPage = new CreateChecklistGrpPage(base.Driver);
        Assert.assertEquals("Create Checklist Group", createChecklistGrpPage.getCreateChecklistGrpHeaderText());
    }

    @And("^I click on View Requests link$")
    public void iClickOnViewRequestsLink() throws Throwable {

        // Click on View Requests link
        SelfServicesPage selfServicesPage = new SelfServicesPage(base.Driver);
        selfServicesPage.clickViewLOVReqLink();
    }

    @Then("^I should be directed to View Requests Page$")
    public void iShouldBeDirectedToViewRequestsPage() throws Throwable {

        // Verify header text on page
        ViewRequests viewRequests = new ViewRequests(base.Driver);
        Assert.assertEquals("LOV Requests", viewRequests.getViewRequestsHeaderText());
    }

    @And("^I click on View Leaves link$")
    public void iClickOnViewLeavesLink() throws Throwable {

        // Click on View Leaves link
        SelfServicesPage selfServicesPage = new SelfServicesPage(base.Driver);
        selfServicesPage.clickViewLeavesLink();
    }

    @Then("^I should be directed to View Leaves Page$")
    public void iShouldBeDirectedToViewLeavesPage() throws Throwable {

        // Verify header text on page
        ViewLeaveAppPage viewLeaveAppPage = new ViewLeaveAppPage(base.Driver);
        Assert.assertEquals("Leave Applications", viewLeaveAppPage.getViewLeaveAppHeaderText());
    }

    @And("^I click on View Reports link$")
    public void iClickOnViewReportsLink() throws Throwable {

        // Click on View Reports link
        SelfServicesPage selfServicesPage = new SelfServicesPage(base.Driver);
        selfServicesPage.clickViewReportsLink();
    }

    @Then("^I should be directed to View Reports Page$")
    public void iShouldBeDirectedToViewReportsPage() throws Throwable {

        // Verify header text on page
        ViewClassroomReportsPage viewClassroomReportsPage = new ViewClassroomReportsPage(base.Driver);
        Assert.assertEquals("Classroom Reports", viewClassroomReportsPage.getViewClassroomReportHeaderText());
    }
}
