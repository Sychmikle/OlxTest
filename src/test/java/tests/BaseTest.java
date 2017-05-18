package tests;

import pages.BasePage;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected static String baseUrl = "https://www.olx.ua/";
    protected BasePage page;
    protected static WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public static void beforeClass() {
        initialization();
    }

    @Before
    public void before() {
        page = new BasePage(driver);
        open(baseUrl);
        homePage = page.createPage(HomePage.class);

    }

    @AfterClass
    public static void after() {
        driver.quit();
    }

    private static void initialization() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    public void open(String url) {
        driver.get(url);

    }


}
