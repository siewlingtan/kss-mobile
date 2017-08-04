package Steps;

import Base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Hook extends BaseUtil{

    private BaseUtil base;

    public Hook(BaseUtil base) {

        this.base = base;
    }

    @Before
    public void InitializeTest(){

        System.out.println("Opening the browser: Firefox");

        System.setProperty("webdriver.gecko.driver","C:\\Users\\siewling.tan\\geckodriver-v0.18.0-win64\\geckodriver.exe");
        base.Driver = new FirefoxDriver();
        base.Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @After
    public void TearDownTest(Scenario scenario){

        if(scenario.isFailed()){

            // Take screenshot
            System.out.println(scenario.getName());

        }

        System.out.println("Closing the browser: Firefox");
        // base.Driver.quit();
    }
}