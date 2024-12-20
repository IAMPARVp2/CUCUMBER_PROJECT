package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.P05_SwitchCurrencies;

public class SD05_SwitchCurrencies {
    P05_SwitchCurrencies changeCurrencies = new P05_SwitchCurrencies(Hooks.driver);

    @When("user choose a currency from the dropdown on the top left")
    public void changeCurrency() throws InterruptedException {
        Select s = new Select(changeCurrencies.currencyDropdown);
        s.selectByVisibleText("Euro");
        Thread.sleep(2000);
    }

    @Then("user change currency and the price of products converts to the new currency symbol")
    public void checkCurrencyChanged() {
        System.out.println(changeCurrencies.productPrice.getText());
        Assert.assertTrue(changeCurrencies.productPrice.getText().contains("€"));
    }
}
