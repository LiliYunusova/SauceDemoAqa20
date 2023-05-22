import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SauceDemoWebElements {
    WebDriver driver;

    WebElement userNameInput = driver.findElement(By.id("user-name"));
    WebElement passwordInput = driver.findElement(By.name("password"));
    WebElement loginCredentialsH4 = driver.findElement(By.className("login_credentials"));
    WebElement dataTestErrorH3 = driver.findElement(By.tagName("h3"));
    WebElement aboutLink = driver.findElement(By.linkText("About"));
    WebElement resetAppStateLink = driver.findElement(By.partialLinkText("Reset"));

    WebElement socialLinkedinLink = driver.findElement(By.xpath("//a[@href= 'https://www.linkedin.com/company/sauce-labs/']"));
    WebElement openMenuButton = driver.findElement(By.xpath("//button[text() = 'Open Menu']"));
    WebElement logoutButton = driver.findElement(By.xpath("//a[contains(@id, 'logout_sidebar')]"));
    WebElement twitterLink = driver.findElement(By.xpath("//a[contains(text(), 'Twitter')]"));
    WebElement headerContainerDiv = driver.findElement(By.xpath("//div[@id = 'header_container']/ancestor::div"));
    WebElement headerSecondaryContainer = driver.findElement(By.xpath("//div[@class = 'header_secondary_container']" +
            "/descendant::div"));
    WebElement nameZtoASelect = driver.findElement(By.xpath("//option[contains(text(), 'Name (Z to A)')]/following::option"));
    WebElement menuDiv = driver.findElement(By.xpath("//div[@class = 'bm-burger-button']/parent::div"));
    WebElement menuA = driver.findElement((By.xpath("//a[contains(text(), 'Logout')]/preceding::a")));
    WebElement summaryInfoDiv = driver.findElement(By.xpath("//div[contains(@class , 'summary_info') and " +
            "contains(text(), 'Payment')]"));

    WebElement summaryTaxLabelClass = driver.findElement(By.cssSelector(".summary_tax_label"));
    WebElement headerSecondaryContainerClass = driver.findElement(By.cssSelector(".header_secondary_container .title"));
    WebElement bmMenuClass = driver.findElement(By.cssSelector(".bm-item.menu-item"));
    WebElement inventorySidebarLink = driver.findElement(By.cssSelector("#inventory_sidebar_link"));
    WebElement bmItemListNav = driver.findElement(By.cssSelector("nav"));
    WebElement appLogoDiv = driver.findElement(By.cssSelector("div .app_logo"));
    WebElement dataTest = driver.findElement(By.cssSelector("[data-test = 'login-button']"));
    WebElement checkout = driver.findElement(By.cssSelector("[data-test ~='checkout']"));
    WebElement continueDataTest = driver.findElement(By.cssSelector("[data-test |= 'continue']"));
    WebElement description = driver.findElement(By.cssSelector("[class^= cart]"));
    WebElement label = driver.findElement(By.cssSelector("[class $= label]"));
    WebElement inventoryItem = driver.findElement(By.cssSelector("[class *= inventory_item]"));
    WebElement social = driver.findElement(By.cssSelector(".social :first-child"));
    WebElement socialNthChild = driver.findElement(By.cssSelector(".social :nth-child(1)"));


}
