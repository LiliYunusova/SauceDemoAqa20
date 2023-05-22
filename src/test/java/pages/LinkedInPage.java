package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LinkedInPage extends BasePage{

    private By enterLinkedin = By.cssSelector("[data-tracking-control-name = " +
            "'organization_guest_contextual-sign-in-modal_sign-in-modal_outlet-button']");

    public LinkedInPage(WebDriver driver) {
        super(driver);
    }

    public boolean isEnableLinkedinPage(){
        return driver.findElement(enterLinkedin).isEnabled();
    }


}
