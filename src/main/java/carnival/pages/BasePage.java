package carnival.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends PageObject {

    public BasePage(WebDriver driver) {
        super(driver);
    }

    public void openTheHomePage() {
        open();
    }

    public WebDriverWait getWait() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        return wait;
    }
}

