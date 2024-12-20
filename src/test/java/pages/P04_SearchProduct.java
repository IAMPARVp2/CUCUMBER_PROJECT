package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P04_SearchProduct {

    WebDriver driver;

    public P04_SearchProduct(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "small-searchterms")
    public WebElement searchTxtFld;

    @FindBy(className = "search-box-button")
    public WebElement searchBtn;

    @FindBy(xpath = "//div[@class=\"item-grid\"]//h2[@class=\"product-title\"]//a")
    public WebElement productTitleTxt;
}
