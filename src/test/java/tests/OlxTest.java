package tests;
import pages.AnimalAllAddsPage;
import pages.HomePage;
import pages.LogRegTablePage;
import pages.SearchResultPage;
import utils.MakeScreenShot;
import utils.ReadFrom;
import org.junit.Assert;
import org.junit.Test;
import java.io.FileNotFoundException;
import java.io.IOException;


public class OlxTest extends BaseTest{
    ReadFrom readFrom = new ReadFrom();
    MakeScreenShot screenShot = new MakeScreenShot();


    @Test
    public void allAdAnimals(){
        HomePage homePage = page.createPage(HomePage.class);
        homePage.animalButton.click();
        AnimalAllAddsPage animalAllAddsPage = homePage.clickSubcatSeeAllAnimalAddsButton();
        Assert.assertTrue(animalAllAddsPage.allAdsList.size() == 39);
    }

    @Test
    public void registrationTest(){
        HomePage homePage = page.createPage(HomePage.class);
        LogRegTablePage regPage = homePage.clickPostNewAdLink();
        regPage.clickRegisterButton();
        regPage.userEmailRegister.sendKeys("testaccforolx@gmail.com");
        regPage.userPassRegister.sendKeys("qwerty");
        regPage.clickCheckbox();
        regPage.clickButton_register();
        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.olx.ua/account/checkemailafterpost"));
        regPage.confirmButton.click(); // next steps on local email server
    }

    @Test
    public void logInTest(){
        HomePage homePage = page.createPage(HomePage.class);
        LogRegTablePage logPage = homePage.clickLoginLink();
        logPage.userEmail.sendKeys("testaccforolx@gmail.com");
        logPage.userPass.sendKeys("qwerty");
        logPage.logCheckbox.click();
        logPage.logButton.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.olx.ua/myaccount/#login"));
    }

    @Test
    public void someProductSearch() throws IOException {
        HomePage homePage = page.createPage(HomePage.class);
        homePage.headerSearch.sendKeys(readFrom.someProduct());
        SearchResultPage searchResultPage = homePage.clickSearch();
        Assert.assertTrue(searchResultPage.allAdsList.size()==39);
        screenShot.shoot();
    }




}

