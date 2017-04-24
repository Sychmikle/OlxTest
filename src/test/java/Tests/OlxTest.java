package Tests;
import Pages.AnimalAllAddsPage;
import Pages.HomePage;
import Pages.LogRegTablePage;
import org.junit.Assert;
import org.junit.Test;


public class OlxTest extends BaseTest{

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




}
