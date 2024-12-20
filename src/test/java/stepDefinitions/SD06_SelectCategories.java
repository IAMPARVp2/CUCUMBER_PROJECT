package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.P06_SelectCategories;

public class SD06_SelectCategories {

    P06_SelectCategories selectCategories = new P06_SelectCategories(Hooks.driver);
    Actions action = new Actions(Hooks.driver);

    @When("user hover on a main category")
    public void hoverMainCategory() throws InterruptedException {
        action.moveToElement(selectCategories.mainCategory);
        Thread.sleep(1000);
    }

    @And("user select a sub category")
    public void selectSubCategory() {
        action.moveToElement(selectCategories.subCategory);
        action.click().build().perform();
    }

    @Then("user navigate to category page")
    public void navigateCategoryPage() {
        Assert.assertTrue(selectCategories.subCategory.getAttribute("href").contains(selectCategories.pageTitle.getText().toLowerCase()));
    }
}
