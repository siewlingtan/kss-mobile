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
    public WebElement txtUsername;

    @FindBy(how = How.NAME, using = "LoginForm[password]")
    public WebElement txtPassword;

    @FindBy(how = How.NAME, using = "yt0")
    public WebElement btnLogin;


    public void Login(String username, String password){

        username = "siewling.tan";
        password = "q7C9Kik4H";

        txtUsername.sendKeys(username);
        txtPassword.sendKeys(password);
    }

    public void ClickLogin(){

        btnLogin.submit();
    }

}
