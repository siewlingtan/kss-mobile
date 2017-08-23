package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CreateNotificationPage{

    private final WebDriver driver;
    private final WebDriverWait wait;

    public CreateNotificationPage(WebDriver driver){

        PageFactory.initElements(driver,this);
        this.driver = driver;

        this.wait = new WebDriverWait(driver, 40);
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"title\"]")
    private WebElement txtNotificationTitle;

    @FindBy(how = How.CSS, using = "div.note-editable.panel-body")
    private WebElement txtNotificationBody;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Next')]")
    private WebElement btnNext;

    @FindBy(how = How.XPATH, using = "//textarea[@name='modInstanceIds']")
    private WebElement txtMID;

    @FindBy(how = How.XPATH, using = "//input[@name='isSendEmail'][@type='checkbox']")
    private WebElement chkEmail;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Send now')]")
    private WebElement btnSendNow;

    @FindBy(how = How.XPATH, using = "//input[@type='checkbox'][@name='isSendNow']")
    private WebElement chkSendLater;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Submit')]")
    private WebElement btnSubmit;

    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'Create new notification successfully')]")
    private WebElement txtConfirmationMsg;

    private String getDate(){

        // Get current system date time
        // Create object of SimpleDateFormat class and decide the format
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

        //get current date time with Date()
        Date date = new Date();

        // Now format the date
        return dateFormat.format(date);
    }

    public void inputTitle(){

        String title = "Auto test title on " + getDate();

        txtNotificationTitle.click();
        txtNotificationTitle.sendKeys(title);

    }

    public void inputContent(){

        String content = "Auto test body on " + getDate();

        txtNotificationBody.click();
        ((JavascriptExecutor)driver).executeScript("document.querySelectorAll('div.note-editable.panel-body')[0].style.display='inline'");
        txtNotificationBody.sendKeys(content);
    }

    public void inputScheduledContent(){

        String content = "Auto test scheduled body on " + getDate();

        txtNotificationBody.click();
        ((JavascriptExecutor)driver).executeScript("document.querySelectorAll('div.note-editable.panel-body')[0].style.display='inline'");
        txtNotificationBody.sendKeys(content);
    }

    public void inputScheduledTitle(){

        String title = "Auto test scheduled title on " + getDate();

        txtNotificationTitle.click();
        txtNotificationTitle.sendKeys(title);

    }

    public void clickNext(){

        // Wait till Next button is enabled then click
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Next')]")));
        btnNext.click();
    }

    public void inputMID(){

        String mid = "12345";

        txtMID.click();
        txtMID.sendKeys(mid);
    }

    public void selectEmailOption(){
        chkEmail.click();
    }

    public void clickSendNow(){
        btnSendNow.click();
    }

    public void clickSendLater(){
        chkSendLater.click();
    }

    public void clickSubmit(){
        btnSubmit.click();
    }

    public void getConfirmationMsg(){

        WebDriverWait wait = new WebDriverWait(this.driver, 40);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.sweet-alert.showSweetAlert.visible")));

        String confirmationMsgText = txtConfirmationMsg.getText();

        System.out.println(confirmationMsgText);
    }
}
