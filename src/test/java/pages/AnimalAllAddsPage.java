package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AnimalAllAddsPage extends BasePage {

    @FindBy (css = "#offers_table .wrap")
    public List<WebElement> allAdsList;

    public AnimalAllAddsPage(WebDriver driver) {
        super(driver);
    }
}
