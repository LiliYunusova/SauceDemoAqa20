package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LinkedInPage;
import pages.LoginPage;
import pages.SauceDemoInventoryPage;
import java.util.concurrent.TimeUnit;


public class SauceDemoLinkedinTest extends BaseTest{

    @Test
    public void isVisibilityLogoTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openSauseDemoPage();
        loginPage.sendKeysLogin();
        loginPage.sendKeysPassword();
        loginPage.clickLoginButton();
        SauceDemoInventoryPage sauceDemoInventoryPage = new SauceDemoInventoryPage(driver);
        sauceDemoInventoryPage.socialLinkedinLinkClick();
        sauceDemoInventoryPage.switchToWindow();
        LinkedInPage linkedInPage = new LinkedInPage(driver);
        Assert.assertTrue(linkedInPage.isEnableLinkedinPage(), "Mistake");
    }
}
