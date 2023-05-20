package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
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
 //     driver.findElement(By.xpath("//a[@href='https://www.linkedin.com/signup?session_redirect=https%3A%2F%2Fwww%2Elinkedin%2Ecom%2Fcompany%2Fsauce-labs&trk=organization_guest_contextual-sign-in-modal_join-link']")).click();
//        sauceDemoInventoryPage.switchToWindowAndGetText();

    }
}
