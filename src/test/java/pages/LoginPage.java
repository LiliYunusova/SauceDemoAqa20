package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static constants.PageUrl.SAUCEDEMO_PAGE;

public class LoginPage extends BasePage{

    private By login = By.cssSelector("[data-test = 'username']");
    private By password = By.cssSelector("[data-test = 'password']");
    private By loginButton = By.cssSelector("[data-test = 'login-button']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void openSauseDemoPage(){
        driver.get(SAUCEDEMO_PAGE);
    }

    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }

    public void sendKeysLogin(String login){
        driver.findElement(this.login).sendKeys("standard_user");
    }

    public void sendKeysPassword(String password){
        driver.findElement(this.password).sendKeys("secret_sauce");
    }
}
