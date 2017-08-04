package Pages;

import Base.BaseUtil;
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

    public CreateNotificationPage(WebDriver driver){

        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"title\"]")
    public WebElement txtNotificationTitle;

    @FindBy(how = How.CSS, using = "div.note-editable.panel-body")
    public WebElement txtNotificationBody;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Next')]")
    public WebElement btnNext;

    public String getDate(){

        // Get current system date time
        // Create object of SimpleDateFormat class and decide the format
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

        //get current date time with Date()
        Date date = new Date();

        // Now format the date
        String currentDate= dateFormat.format(date);
        return currentDate;
    }


}
