package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {


    @FindBy(css = ".subcategories-title [data-id='35']")
    public WebElement subcategoriesSeeAllAnimalAddsButton;


    @FindBy(css = ".li.fleft [data-id = '35']")
    public WebElement animalButton;

    @FindBy(id = "postNewAdLink")
    public WebElement postNewAdLink;

    @FindBy(id ="topLoginLink")
    public WebElement loginLink;

    @FindBy(id ="headerSearch")
    public WebElement headerSearch;
    @FindBy(id ="submit-searchmain")
    public WebElement searcButton;

    public AnimalAllAddsPage clickSubcatSeeAllAnimalAddsButton() {
        subcategoriesSeeAllAnimalAddsButton.click();
        return createPage(AnimalAllAddsPage.class);
    }
    public LogRegTablePage clickPostNewAdLink(){
        postNewAdLink.click();
        return createPage(LogRegTablePage.class);
    }
    public LogRegTablePage clickLoginLink(){
        loginLink.click();
        return createPage(LogRegTablePage.class);
    }
    public SearchResultPage clickSearch(){
        searcButton.click();
        return createPage(SearchResultPage.class);

    }


    public HomePage(WebDriver driver) {
        super(driver);
    }
}
