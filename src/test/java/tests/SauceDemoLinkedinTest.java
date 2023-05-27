package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LinkedInPage;
import pages.LoginPage;
import pages.SauceDemoInventoryPage;


public class SauceDemoLinkedinTest extends BaseTest {

    @Test
    public void isVisibilityLogoTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openSauseDemoPage();
        loginPage.sendKeysLogin(System.getProperty("login"));
        loginPage.sendKeysPassword(System.getProperty("password"));
        loginPage.clickLoginButton();
        SauceDemoInventoryPage sauceDemoInventoryPage = new SauceDemoInventoryPage(driver);
        sauceDemoInventoryPage.socialLinkedinLinkClick();
        sauceDemoInventoryPage.switchToWindow();
        LinkedInPage linkedInPage = new LinkedInPage(driver);
        Assert.assertTrue(linkedInPage.isEnableLinkedinPage(), "Mistake");
    }
}
