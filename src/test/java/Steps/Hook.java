package Steps;

import Base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Hook extends BaseUtil{

    private BaseUtil base;

    public Hook(BaseUtil base) {

        this.base = base;
    }

    @Before
    public void InitializeTest(){

        System.out.println("Opening the browser: Chrome");

        // Firefox driver does not work in Jenkins
        /*System.setProperty("webdriver.gecko.driver","C:\\Users\\siewling.tan\\geckodriver-v0.18.0-win64\\geckodriver.exe");
        base.Driver = new FirefoxDriver();
        base.Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/

        // Chrome driver
        System.setProperty("webdriver.chrome.driver","C:\\\\Libs\\\\chromedriver.exe");
        base.Driver = new ChromeDriver();
        base.Driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

    }

    @After
    public void TearDownTest(Scenario scenario){

        if(scenario.isFailed()){

            // Take screenshot
            System.out.println(scenario.getName());

        }

        System.out.println("Closing the browser: Chrome");
        base.Driver.quit();
    }
}