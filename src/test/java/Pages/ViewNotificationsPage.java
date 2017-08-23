package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ViewNotificationsPage {

    public ViewNotificationsPage (WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/div/div/div[1]/div[1]/h2")
    private WebElement notificationsPageHeader;

    @FindBy(how = How.XPATH, using = "//a[@type='button'][contains(text(),'View')]")
    private WebElement btnView;

    @FindBy(how = How.XPATH, using = "//div[@class='form-group']/h2")
    private WebElement notificationTitleOnViewPage;

    public String getNotificationsHeaderText(){

        String headerOnNotificationsPage;

        headerOnNotificationsPage = notificationsPageHeader.getText();
        return  headerOnNotificationsPage;
    }

    public void clickBtnView(){

        btnView.click();
    }

    public String getNotificationTitleOnViewPage(){

        String titleOnViewPage;

        titleOnViewPage = notificationTitleOnViewPage.getText();
        return titleOnViewPage;
    }
}
