package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.P09_AddShoppingCart;

import java.util.ArrayList;
import java.util.List;

public class SD09_AddShoppingCart {

    P09_AddShoppingCart addShoppingCart = new P09_AddShoppingCart(Hooks.driver);
    List<String> titles = new ArrayList<>();

    @When("user add a product to shopping cart")
    public void addProduct() throws InterruptedException {
        titles.add(addShoppingCart.productTitle.getText());
        addShoppingCart.addToCartBtn.click();
        Thread.sleep(2000);
        addShoppingCart.addToCartPageBtn.click();
        Thread.sleep(1000);
    }

    @And("user add another product to shopping cart")
    public void addAnotherProduct() throws InterruptedException {
        titles.add(addShoppingCart.productTitle.getText());
        addShoppingCart.addToCartBtn.click();
        Thread.sleep(1000);
    }

    @And("user navigate to shopping cart page")
    public void navigateShoppingCartPage() {
        addShoppingCart.shoppingCartBtn.click();
    }

    @Then("user get the added products on the shopping cart")
    public void getAddedProducts() {
        Assert.assertEquals(addShoppingCart.firstCartProduct.getText(), titles.get(0));
        Assert.assertEquals(addShoppingCart.secondCartProduct.getText(), titles.get(1));
    }
}
