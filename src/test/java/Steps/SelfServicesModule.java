package Steps;

import Base.BaseUtil;
import Pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class SelfServicesModule extends BaseUtil{

    private final BaseUtil base;

    private final LoginPage loginPage;
    private final KSSPage kssPage;
    private final SelfServicesPage selfServicesPage;
    private final ViewNotificationsPage viewNotificationsPage;
    private final AcadChecklistsPage acadChecklistsPage;
    private final CreateChecklistGrpPage createChecklistGrpPage;
    private final ViewRequests viewRequests;
    private final ViewLeaveAppPage viewLeaveAppPage;
    private final ViewClassroomReportsPage viewClassroomReportsPage;

    public SelfServicesModule(BaseUtil base) {
        this.base = base;

        this.loginPage = new LoginPage(base.Driver);

        this.kssPage = new KSSPage(base.Driver);

        this.selfServicesPage = new SelfServicesPage(base.Driver);

        this.viewNotificationsPage = new ViewNotificationsPage(base.Driver);

        this.acadChecklistsPage = new AcadChecklistsPage(base.Driver);

        this.createChecklistGrpPage = new CreateChecklistGrpPage(base.Driver);

        this.viewRequests = new ViewRequests(base.Driver);

        this.viewLeaveAppPage = new ViewLeaveAppPage(base.Driver);

        this.viewClassroomReportsPage = new ViewClassroomReportsPage(base.Driver);

    }


    @Given("^I am logged in to KSS with correct \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iAmLoggedInToKSSWithCorrectAnd(String username, String password) throws Throwable {

        // Navigate to KSS login page
        base.Driver.navigate().to("http://kss-mobile.aws.kaplan.com.sg/");

        // Input login credentials
        loginPage.Login();

        // Click Login
        loginPage.ClickLogin();

        // Verify that user is logged in by checking for presence of Logout link
        Assert.assertEquals("Not logged in", kssPage.logoutLink.isDisplayed(), true);
    }

    @When("^I click on Self-Services link$")
    public void iClickOnSelfServicesLink() throws Throwable {

        // Click on Self-Services link
        kssPage.clickSelfServices();
    }

    @Then("^I should be directed to Self-Services module$")
    public void iShouldBeDirectedToSelfServicesModule() throws Throwable {

        // Verify header text on page
        Assert.assertEquals("Self Services", selfServicesPage.getSelfServicesHeaderText());
    }

    @And("^I click on View Notifications link$")
    public void iClickOnViewNotificationsLink() throws Throwable {

        // Click on View Notifications link
        selfServicesPage.clickViewNotificationsLink();
    }

    @Then("^I should be directed to Notifications Listing Page$")
    public void iShouldBeDirectedToNotificationsListingPage() throws Throwable {

        // Verify header text on page
        Assert.assertEquals("Notifications", viewNotificationsPage.getNotificationsHeaderText());
    }

    @And("^I click on Create Notification link$")
    public void iClickOnCreateNotificationLink() throws Throwable {

        // Click on Create Notification link
        selfServicesPage.clickCreateNotificationsLink();
    }

    @Then("^I should be directed to Create Notification Page$")
    public void iShouldBeDirectedToCreateNotificationPage() throws Throwable {

        // Verify URL on page
        Assert.assertEquals("Not on Create Notification page", base.Driver.getCurrentUrl().contains("/notification/notification/create"),true);

    }

    @And("^I click on Academic Checklists link$")
    public void iClickOnAcademicChecklistsLink() throws Throwable {

        // Click on Academic Checklists link
        selfServicesPage.clickAcadChecklistsLink();
    }

    @Then("^I should be directed to Academic Checklists Listing Page$")
    public void iShouldBeDirectedToAcademicChecklistsListingPage() throws Throwable {

        // Verify header text on page
        Assert.assertEquals("Academic Checklists", acadChecklistsPage.getAcadChecklistsHeaderText());
    }

    @And("^I click on Create Checklist Group link$")
    public void iClickOnCreateChecklistGroupLink() throws Throwable {

        // Click on Create Checklist Group link
        selfServicesPage.clickCreateChecklistGrpLink();
    }

    @Then("^I should be directed to Create Checklist Group Page$")
    public void iShouldBeDirectedToCreateChecklistGroupPage() throws Throwable {

        // Verify header text on page
        Assert.assertEquals("Create Checklist Group", createChecklistGrpPage.getCreateChecklistGrpHeaderText());
    }

    @And("^I click on View Requests link$")
    public void iClickOnViewRequestsLink() throws Throwable {

        // Click on View Requests link
        selfServicesPage.clickViewLOVReqLink();
    }

    @Then("^I should be directed to View Requests Page$")
    public void iShouldBeDirectedToViewRequestsPage() throws Throwable {

        // Verify header text on page
        Assert.assertEquals("LOV Requests", viewRequests.getViewRequestsHeaderText());
    }

    @And("^I click on View Leaves link$")
    public void iClickOnViewLeavesLink() throws Throwable {

        // Click on View Leaves link
        selfServicesPage.clickViewLeavesLink();
    }

    @Then("^I should be directed to View Leaves Page$")
    public void iShouldBeDirectedToViewLeavesPage() throws Throwable {

        // Verify header text on page
        Assert.assertEquals("Leave Applications", viewLeaveAppPage.getViewLeaveAppHeaderText());
    }

    @And("^I click on View Reports link$")
    public void iClickOnViewReportsLink() throws Throwable {

        // Click on View Reports link
        selfServicesPage.clickViewReportsLink();
    }

    @Then("^I should be directed to View Reports Page$")
    public void iShouldBeDirectedToViewReportsPage() throws Throwable {

        // Verify header text on page
        Assert.assertEquals("Classroom Reports", viewClassroomReportsPage.getViewClassroomReportHeaderText());
    }
}