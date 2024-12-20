package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P03_ResetPassword {

    WebDriver driver;

    public P03_ResetPassword(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "forgot-password")
    public WebElement forgotPasswordBtn;

    @FindBy(id = "Email")
    public WebElement emailTxtFld;

    @FindBy(className = "password-recovery-button")
    public WebElement recoveryBtn;

    @FindBy(className = "content")
    public WebElement resultMessageTxt;
}
