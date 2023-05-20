package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SauceDemoInventoryPage extends BasePage{

    private By socialLinkedinLink = By.xpath("//a[@href= 'https://www.linkedin.com/company/sauce-labs/']");
    private By iconLinkedin = By.cssSelector("[data-test-id = 'nav-logo']");

    public SauceDemoInventoryPage(WebDriver driver) {
        super(driver);
    }

    public void socialLinkedinLinkClick(){
        driver.findElement(socialLinkedinLink).click();
    }

    public String switchToWindowAndGetText(){
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait webDriverWait = new WebDriverWait(driver,15);
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(iconLinkedin));
        WebElement linkedin = driver.findElement(iconLinkedin);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return linkedin.getText();
    }

}
