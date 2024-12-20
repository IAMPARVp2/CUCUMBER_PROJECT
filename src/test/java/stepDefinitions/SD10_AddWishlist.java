package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.P10_AddWishlist;

import java.util.ArrayList;
import java.util.List;

public class SD10_AddWishlist {

    P10_AddWishlist addWishlist = new P10_AddWishlist(Hooks.driver);
    List<String> titles = new ArrayList<String>();

    @When("user add a product to wishlist")
    public void addProduct() throws InterruptedException {
        Hooks.driver.get("https://demo.nopcommerce.com");
        titles.add(addWishlist.productTitle.getText());
        addWishlist.addToWishlistBtn.click();
        Thread.sleep(1000);
        addWishlist.addToWishlistPageBtn.click();
        Thread.sleep(1000);
    }

    @And("user add another product to wishlist")
    public void addAnotherProduct() throws InterruptedException {
        titles.add(addWishlist.productTitle.getText());
        addWishlist.addToWishlistBtn.click();
        Thread.sleep(1000);
    }

    @And("user navigate to wishlist page")
    public void navigateWishlistPage() {
        addWishlist.wishlistBtn.click();
    }

    @Then("user get the added products on the wishlist")
    public void getAddedProducts() {
        Assert.assertEquals(addWishlist.firstWishlistProduct.getText(), titles.get(0));
        Assert.assertEquals(addWishlist.secondWishlistProduct.getText(), titles.get(1));
    }
}
