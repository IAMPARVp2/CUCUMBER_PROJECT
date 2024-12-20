package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.P07_FilterColor;

public class SD07_FilterColor {

    P07_FilterColor filterColor = new P07_FilterColor(Hooks.driver);

    @And("user selects color")
    public void changeColor() {
        filterColor.colorInput.click();
    }

    @Then("user get the result data with the chosen color")
    public void checkResult() {
        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("specs=15"));
    }
}
