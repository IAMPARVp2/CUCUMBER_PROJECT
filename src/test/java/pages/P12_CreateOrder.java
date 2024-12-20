package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P12_CreateOrder {

    WebDriver driver;

    public P12_CreateOrder(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//td[@class=\"product\"]//a")
    public WebElement productTitle;

    @FindBy(xpath = "(//div[@class=\"add-info\"]//button[@class=\"button-2 product-box-add-to-cart-button\"])[3]")
    public WebElement addToCartBtn;

    @FindBy(xpath = "//a[@href=\"/cart\"]")
    public WebElement shoppingCartBtn;

    @FindBy(id = "termsofservice")
    public WebElement termsBtn;

    @FindBy(id = "checkout")
    public WebElement checkoutBtn;

    @FindBy(id = "BillingNewAddress_CountryId")
    public WebElement countryDropdown;

    @FindBy(id = "BillingNewAddress_City")
    public WebElement cityTxtFld;

    @FindBy(id = "BillingNewAddress_Address1")
    public WebElement addressTxtFld;

    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    public WebElement zipCodeTxtFld;

    @FindBy(id = "BillingNewAddress_PhoneNumber")
    public WebElement phoneNumTxtFld;

    @FindBy(xpath = "//div[@id=\"billing-buttons-container\"]//button[@class=\"button-1 new-address-next-step-button\"]")
    public WebElement billingAddressBtn;

    @FindBy(xpath = "//div[@id=\"shipping-method-buttons-container\"]//button[@class=\"button-1 shipping-method-next-step-button\"]")
    public WebElement shippingMethodBtn;

    @FindBy(xpath = "//div[@id=\"payment-method-buttons-container\"]//button[@class=\"button-1 payment-method-next-step-button\"]")
    public WebElement paymentMethodBtn;

    @FindBy(xpath = "//div[@id=\"payment-info-buttons-container\"]//button[@class=\"button-1 payment-info-next-step-button\"]")
    public WebElement paymentInformationBtn;

    @FindBy(xpath = "//div[@id=\"confirm-order-buttons-container\"]//button[@class=\"button-1 confirm-order-next-step-button\"]")
    public WebElement confirmBtn;

    @FindBy(className = "details-link")
    public WebElement orderDetailsBtn;

    @FindBy(xpath = "//td[@class=\"product\"]//a")
    public WebElement product;
}
