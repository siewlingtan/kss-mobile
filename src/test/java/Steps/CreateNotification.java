package Steps;

import Base.BaseUtil;
import Pages.CreateNotificationPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateNotification extends BaseUtil{

    private BaseUtil base;
    private CreateNotificationPage createNotificationPage;

    public CreateNotification(BaseUtil base) {
        this.base = base;

        CreateNotificationPage createNotificationPage = new CreateNotificationPage(base.Driver);
        this.createNotificationPage = createNotificationPage;
    }

    @And("^I input title and content$")
    public void iInputTitleAndContent() throws Throwable {

        // Input notification title
        createNotificationPage.txtNotificationTitle.click();
        createNotificationPage.txtNotificationTitle.sendKeys("Auto test title on " + createNotificationPage.getDate());

        // Input notification content
        createNotificationPage.txtNotificationBody.click();
        ((JavascriptExecutor)base.Driver).executeScript("document.querySelectorAll('div.note-editable.panel-body')[0].style.display='inline'");
        createNotificationPage.txtNotificationBody.sendKeys("Auto test body on " + createNotificationPage.getDate());
    }

    @And("^I click Next$")
    public void iClickNext() throws Throwable {

        // Wait till Next button is enabled then click
        WebDriverWait wait = new WebDriverWait(base.Driver, 40);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Next')]")));

        base.Driver.findElement(By.xpath("//*[contains(text(),'Next')]")).click();
    }

    @And("^I input MID$")
    public void iInputMID() throws Throwable {

        // Input MIDs
        base.Driver.findElement(By.xpath("//textarea[@name='modInstanceIds']")).click();
        base.Driver.findElement(By.xpath("//textarea[@name='modInstanceIds']")).sendKeys("18040,18041,18042");


    }

    @And("^I check on Email option$")
    public void iCheckOnEmailOption() throws Throwable {

        // Click on Email option
        base.Driver.findElement(By.xpath("//input[@name='isSendEmail'][@type='checkbox']")).click();
    }


    @And("^I click on Send Now$")
    public void iClickOnSendNow() throws Throwable {

        // Click Send Now
        base.Driver.findElement(By.xpath("//button[contains(text(),'Send now')]")).click();

    }

    @Then("^I should see notification created successfully$")
    public void iShouldSeeNotificationCreatedSuccessfully() throws Throwable {

        // Wait till overlay shows up to verify message displayed in it
        WebDriverWait wait = new WebDriverWait(base.Driver, 40);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.sweet-alert.showSweetAlert.visible")));

        WebElement confirmationMsg = base.Driver.findElement(By.xpath("//h2[contains(text(),'Create new notification successfully')]"));
        String confirmationMsgText = confirmationMsg.getText();

        System.out.println(confirmationMsgText);

    }



}