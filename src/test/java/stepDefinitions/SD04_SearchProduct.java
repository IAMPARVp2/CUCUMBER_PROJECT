package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.P04_SearchProduct;

public class SD04_SearchProduct {

    P04_SearchProduct searchProduct = new P04_SearchProduct(Hooks.driver);

    @When("user search for a product {string}")
    public void searchProduct(String product) {
        searchProduct.searchTxtFld.sendKeys(product);
        searchProduct.searchBtn.click();
    }

    @Then("user got relative result of product searched for {string}")
    public void searchSuccessfully(String product) {
        Assert.assertEquals(product, searchProduct.productTitleTxt.getText());
    }
}
