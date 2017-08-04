package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ViewLeaveAppPage {

    public ViewLeaveAppPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/div[1]/h2")
    public WebElement viewLeaveAppPageHeader;

    public String getViewLeaveAppHeaderText() {

        String headerOnViewLeaveAppPage;

        headerOnViewLeaveAppPage = viewLeaveAppPageHeader.getText();
        return headerOnViewLeaveAppPage;
    }
}
