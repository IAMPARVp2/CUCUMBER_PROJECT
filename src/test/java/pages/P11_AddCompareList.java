package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P11_AddCompareList {

    WebDriver driver;

    public P11_AddCompareList(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//button[@class=\"button-2 add-to-compare-list-button\"])[2]")
    public WebElement addToComparingListBtn;

    @FindBy(xpath = "(//button[@class=\"button-2 add-to-compare-list-button\"])[3]")
    public WebElement addToComparingListBtn2;

    @FindBy(xpath = "(//h2[@class=\"product-title\"])[2]//a")
    public WebElement productTitle;

    @FindBy(xpath = "(//h2[@class=\"product-title\"])[3]//a")
    public WebElement productTitle2;

    @FindBy(xpath = "//a[@href=\"/compareproducts\"]")
    public WebElement comparingListBtn;

    @FindBy(xpath = "//tr[@class=\"product-name\"]//a")
    public WebElement firstCompareListProduct;

    @FindBy(xpath = "(//tr[@class=\"product-name\"]//a)[2]")
    public WebElement secondCompareListProduct;
}
