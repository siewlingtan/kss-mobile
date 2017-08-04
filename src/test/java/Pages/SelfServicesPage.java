package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SelfServicesPage {

    public SelfServicesPage(WebDriver driver){

        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/h1")
    public WebElement selfServicesPageHeader;

    @FindBy(how = How.CSS, using = "a[href='/index.php/notification']")
    public WebElement viewNotificationsLink;

    @FindBy(how = How.CSS, using = "a[href='/index.php/notification/notification/create']")
    public WebElement createNotificationLink;

    @FindBy(how = How.CSS, using = "a[href='/index.php/onboarding']")
    public WebElement acadChecklistsLink;

    @FindBy(how = How.CSS, using = "a[href='/index.php/onboarding/admin/create']")
    public WebElement createChecklistGrpLink;

    @FindBy(how = How.CSS, using = "a[href='/index.php/lov/admin']")
    public WebElement viewLOVReqLink;

    @FindBy(how = How.CSS, using = "a[href='/index.php/leave/admin']")
    public WebElement viewLeavesLink;

    @FindBy(how = How.CSS, using = "a[href='/index.php/notification/notification/report']")
    public WebElement viewReportsLink;

    public String getSelfServicesHeaderText() {

        String headerOnSelfServicesPage;

        headerOnSelfServicesPage = selfServicesPageHeader.getText();
        return headerOnSelfServicesPage;
    }

    public void clickViewNotificationsLink(){

        viewNotificationsLink.click();
    }

    public void clickCreateNotificationsLink(){

        createNotificationLink.click();
    }

    public void clickAcadChecklistsLink(){

        acadChecklistsLink.click();
    }

    public void clickCreateChecklistGrpLink(){

        createChecklistGrpLink.click();
    }

    public void clickViewLOVReqLink(){

        viewLOVReqLink.click();
    }

    public void clickViewLeavesLink(){

        viewLeavesLink.click();
    }

    public void clickViewReportsLink(){

        viewReportsLink.click();
    }

}
