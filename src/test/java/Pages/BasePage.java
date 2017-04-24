package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected WebDriver driver;
    protected Actions action;



    public BasePage(WebDriver driver) {
        this.driver = driver;
        action = new Actions(driver);
    }

    public <T> T createPage(Class<T> pageClass) {
        return PageFactory.initElements(driver, pageClass);
    }


    public void waitForVisibility(WebElement element) {
        new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForElementClickable(WebElement element) {
        new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(element));
    }

}
