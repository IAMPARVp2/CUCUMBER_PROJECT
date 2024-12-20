package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.P11_AddCompareList;

import java.util.ArrayList;
import java.util.List;

public class SD11_AddCompareList {

    P11_AddCompareList addComparingList = new P11_AddCompareList(Hooks.driver);
    List<String> titles = new ArrayList<String>();

    @When("user add two products to compare list")
    public void addProduct() throws InterruptedException {
        Hooks.driver.get("https://demo.nopcommerce.com");
        titles.add(addComparingList.productTitle.getText());
        titles.add(addComparingList.productTitle2.getText());
        addComparingList.addToComparingListBtn.click();
        Thread.sleep(1000);
        addComparingList.addToComparingListBtn2.click();
        Thread.sleep(2000);
    }

    @And("user navigate to compare list page")
    public void navigateWishlistPage() {
        addComparingList.comparingListBtn.click();
    }

    @Then("user get the added products on the compare list page")
    public void getAddedProducts() {
        Assert.assertEquals(addComparingList.firstCompareListProduct.getText(), titles.get(1));
        Assert.assertEquals(addComparingList.secondCompareListProduct.getText(), titles.get(0));
    }
}
