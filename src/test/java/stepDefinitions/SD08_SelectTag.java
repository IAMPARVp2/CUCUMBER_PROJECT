package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.P08_SelectTag;

public class SD08_SelectTag {

    P08_SelectTag selectTag = new P08_SelectTag(Hooks.driver);

    @And("user selects tag")
    public void changeColor() {
        selectTag.tag.click();
    }

    @Then("user get the result data with the chosen tag")
    public void checkResult() {
        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains(selectTag.tag.getText()));
    }
}
