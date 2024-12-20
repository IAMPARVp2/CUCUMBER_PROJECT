package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P09_AddShoppingCart {

    WebDriver driver;

    public P09_AddShoppingCart(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//div[@class=\"item-box\"]//button[@class=\"button-2 product-box-add-to-cart-button\"])[3]")
    public WebElement addToCartBtn;

    @FindBy(xpath = "(//div[@class=\"item-box\"]//h2[@class=\"product-title\"])[3]//a")
    public WebElement productTitle;

    @FindBy(id = "add-to-cart-button-4")
    public WebElement addToCartPageBtn;

    @FindBy(xpath = "//a[@href=\"/cart\"]")
    public WebElement shoppingCartBtn;

    @FindBy(xpath = "//td[@class=\"product\"]//a")
    public WebElement firstCartProduct;

    @FindBy(xpath = "(//td[@class=\"product\"]//a)[2]")
    public WebElement secondCartProduct;
}
