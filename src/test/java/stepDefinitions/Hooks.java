package stepDefinitions;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    public static WebDriver driver = new ChromeDriver();

    @BeforeAll
    public static void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com");
    }

    @AfterAll
    public static void closeBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
