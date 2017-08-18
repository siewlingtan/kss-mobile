package Steps;

import Base.BaseUtil;
import Pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class SelfServicesModule extends BaseUtil{

    private BaseUtil base;

    private LoginPage loginPage;
    private KSSPage kssPage;
    private SelfServicesPage selfServicesPage;
    private ViewNotificationsPage viewNotificationsPage;
    private CreateNotificationPage createNotificationPage;
    private AcadChecklistsPage acadChecklistsPage;
    private CreateChecklistGrpPage createChecklistGrpPage;
    private ViewRequests viewRequests;
    private ViewLeaveAppPage viewLeaveAppPage;
    private ViewClassroomReportsPage viewClassroomReportsPage;

    public SelfServicesModule(BaseUtil base) {
        this.base = base;

        LoginPage loginPage = new LoginPage(base.Driver);
        this.loginPage = loginPage;

        KSSPage kssPage = new KSSPage(base.Driver);
        this.kssPage = kssPage;

        SelfServicesPage selfServicesPage = new SelfServicesPage(base.Driver);
        this.selfServicesPage = selfServicesPage;

        ViewNotificationsPage viewNotificationsPage = new ViewNotificationsPage(base.Driver);
        this.viewNotificationsPage = viewNotificationsPage;

        CreateNotificationPage createNotificationPage = new CreateNotificationPage(base.Driver);
        this.createNotificationPage = createNotificationPage;

        AcadChecklistsPage acadChecklistsPage = new AcadChecklistsPage(base.Driver);
        this.acadChecklistsPage = acadChecklistsPage;

        CreateChecklistGrpPage createChecklistGrpPage = new CreateChecklistGrpPage(base.Driver);
        this.createChecklistGrpPage = createChecklistGrpPage;

        ViewRequests viewRequests = new ViewRequests(base.Driver);
        this.viewRequests = viewRequests;

        ViewLeaveAppPage viewLeaveAppPage = new ViewLeaveAppPage(base.Driver);
        this.viewLeaveAppPage = viewLeaveAppPage;

        ViewClassroomReportsPage viewClassroomReportsPage = new ViewClassroomReportsPage(base.Driver);
        this.viewClassroomReportsPage = viewClassroomReportsPage;

    }


    @Given("^I am logged in to KSS with correct \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iAmLoggedInToKSSWithCorrectAnd(String username, String password) throws Throwable {

        // Navigate to KSS login page
        base.Driver.navigate().to("http://kss-mobile.aws.kaplan.com.sg/");

        // Input login credentials
        loginPage.Login(username, password);

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

        // Verify elements on page
        Assert.assertEquals("Text field for title is not displayed.", createNotificationPage.txtNotificationTitle.isDisplayed(),true);

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