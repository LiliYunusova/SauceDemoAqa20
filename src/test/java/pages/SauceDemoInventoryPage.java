package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SauceDemoInventoryPage extends BasePage {

    private By socialLinkedinLink = By.xpath("//a[@href= 'https://www.linkedin.com/company/sauce-labs/']");
    private By iconLinkedin = By.cssSelector("[data-test-id = 'nav-logo']");

    public SauceDemoInventoryPage(WebDriver driver) {
        super(driver);
    }

    public void socialLinkedinLinkClick() {
        driver.findElement(socialLinkedinLink).click();
    }

    public void switchToWindow() {
        String mainHandle = driver.getWindowHandle();
        Set<String> windows = driver.getWindowHandles();
        for (String windowHandle : windows) {
            if (mainHandle.equals(windowHandle)) {
                driver.getCurrentUrl();
            } else {
                driver.switchTo().window(windowHandle);
            }
        }
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait webDriverWait = new WebDriverWait(driver, 20);
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(iconLinkedin));
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
}
