package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P01_Registration {
    WebDriver driver;

    public P01_Registration(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "ico-register")
    public WebElement registerNavigateBtn;

    @FindBy(id = "FirstName")
    public WebElement firstNameTxtFld;

    @FindBy(id = "LastName")
    public WebElement lastNameTxtFld;

    @FindBy(id = "Email")
    public WebElement emailTxtFld;

    @FindBy(id = "Password")
    public WebElement passwordTxtFld;

    @FindBy(id = "ConfirmPassword")
    public WebElement confirmPasswordTxtFld;

    @FindBy(id = "register-button")
    public WebElement registerBtn;

    @FindBy(className = "result")
    public WebElement resultTxt;
}
