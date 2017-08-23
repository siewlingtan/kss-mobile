package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AcadChecklistsPage {

    public AcadChecklistsPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/div[1]/h2")
    private WebElement acadChecklistsPageHeader;

    public String getAcadChecklistsHeaderText() {

        return acadChecklistsPageHeader.getText();

    }
}
