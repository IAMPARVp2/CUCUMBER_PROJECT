package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P05_SwitchCurrencies {

    WebDriver driver;

    public P05_SwitchCurrencies(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "customerCurrency")
    public WebElement currencyDropdown;

    @FindBy(xpath = "//div[@class=\"currency-selector\"]//select//option[@selected]")
    public WebElement selectedCurrency;

    @FindBy(xpath = "//div[@class=\"add-info\"]//span")
    public WebElement productPrice;
}
