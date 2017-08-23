package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CreateChecklistGrpPage {

    public CreateChecklistGrpPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/div[2]/div/h2")
    private WebElement createChecklistGrpPageHeader;

    public String getCreateChecklistGrpHeaderText() {

        String headerOnCreateChecklistGrpPage;

        headerOnCreateChecklistGrpPage = createChecklistGrpPageHeader.getText();
        return headerOnCreateChecklistGrpPage;
    }
}
