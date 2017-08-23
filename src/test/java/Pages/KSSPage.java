package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class KSSPage {

    public KSSPage(WebDriver driver){

        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.CSS, using = "a[href='/index.php/site/logout']")
    public WebElement logoutLink;

    @FindBy(how = How.CSS, using = "a[href='/index.php/selfServices/index'")
    private WebElement selfServicesLink;

    public void clickLogout(){
        logoutLink.click();
    }

    public void clickSelfServices(){
        selfServicesLink.click();
    }
}
