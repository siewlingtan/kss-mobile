package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ViewClassroomReportsPage {

    public ViewClassroomReportsPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/div/div/div[1]/h2")
    public WebElement viewClassroomReportPageHeader;

    public String getViewClassroomReportHeaderText() {

        String headerOnViewClassroomReportPage;

        headerOnViewClassroomReportPage = viewClassroomReportPageHeader.getText();
        return headerOnViewClassroomReportPage;
    }
}
