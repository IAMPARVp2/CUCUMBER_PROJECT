package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.P12_CreateOrder;

public class SD12_CreateOrder {

    P12_CreateOrder createOrder = new P12_CreateOrder(Hooks.driver);
    String title = "";

    @And("user accept the terms of service")
    public void acceptTerms() {
        title = createOrder.productTitle.getText();
        createOrder.termsBtn.click();
    }

    @And("user click on checkout button")
    public void clickCheckout() throws InterruptedException {
        createOrder.checkoutBtn.click();
        Thread.sleep(1000);
    }

    @And("user fill the billing address data")
    public void fillBillData() throws InterruptedException {
        Select countrySelect = new Select(createOrder.countryDropdown);
        countrySelect.selectByValue("123");

        createOrder.cityTxtFld.sendKeys("Cairo");
        createOrder.addressTxtFld.sendKeys("Helwan");
        createOrder.zipCodeTxtFld.sendKeys("123456");
        createOrder.phoneNumTxtFld.sendKeys("01012345678");
        createOrder.billingAddressBtn.click();
        Thread.sleep(1000);
    }

    @And("user continue with default values")
    public void continueDefault() throws InterruptedException {
        createOrder.shippingMethodBtn.click();
        Thread.sleep(1000);
        createOrder.paymentMethodBtn.click();
        Thread.sleep(1000);
        createOrder.paymentInformationBtn.click();
        Thread.sleep(2000);
    }

    @And("user confirm the order")
    public void confirmOrder() throws InterruptedException {
        createOrder.confirmBtn.click();
        Thread.sleep(1000);
        createOrder.orderDetailsBtn.click();
        Thread.sleep(2000);
    }

    @Then("user create a successful order")
    public void createSuccessfulOrder() {
        Assert.assertEquals(createOrder.product.getText(), title);
    }
}
