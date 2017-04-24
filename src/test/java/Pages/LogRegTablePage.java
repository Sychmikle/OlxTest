package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogRegTablePage extends BasePage {

    @FindBy(id = "register_tab")
    public WebElement registerButton;

    @FindBy(id = "userEmailRegister")
    public WebElement userEmailRegister;

    @FindBy(id = "userPassRegister")
    public WebElement userPassRegister;

    @FindBy(css = ".login-page div.login-box #userEmail")
    public WebElement userEmail;

    @FindBy(css = ".login-page div.login-box #userPass")
    public WebElement userPass;
    @FindBy(css = ".login-page div.login-box  .login-form__rememberme")
    public WebElement logCheckbox;

    @FindBy(css = ".login-page div.login-box #se_userLogin")
    public  WebElement logButton;

    @FindBy(xpath= ".//*[@id='registerForm']/div[3]/div/div/label[1]")
    public WebElement checkbox;

    @FindBy(id = "button_register")
    public WebElement button_register;

    @FindBy(css = ".button.big.cfff.br3.default.large")
    public WebElement confirmButton;

    public LogRegTablePage(WebDriver driver) {
        super(driver);
    }
    public void clickRegisterButton(){
        waitForElementClickable( registerButton);
         registerButton.click();
    }
    public void clickCheckbox(){
        waitForElementClickable(checkbox);
        checkbox.click();
    }
    public void clickButton_register(){
        waitForElementClickable(button_register);
        button_register.click();
    }

}
