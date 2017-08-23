package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.NAME, using = "LoginForm[username]")
    private WebElement txtUsername;

    @FindBy(how = How.NAME, using = "LoginForm[password]")
    private WebElement txtPassword;

    @FindBy(how = How.NAME, using = "yt0")
    private WebElement btnLogin;


    public void Login(){

        String username = "siewling.tan";
        String password = "q7C9Kik4H";

        txtUsername.sendKeys(username);
        txtPassword.sendKeys(password);
    }

    public void ClickLogin(){

        btnLogin.submit();
    }

}
