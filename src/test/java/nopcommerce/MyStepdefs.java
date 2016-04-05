package nopcommerce; /**
 * Created by avantrik1 on 10/02/2016.
 */
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import sun.tools.jconsole.inspector.Utils;


public class MyStepdefs {

    static WebDriver driver = BaseClass.driver;

    @Given("^Customer on a required Product page$")
    public void customer_on_a_required_Product_page()  {
        driver.findElement(By.cssSelector(".product-title>a")).click();
    }

    @When("^Customer select a product and press on Add to compare list$")
    public void customer_select_a_product_and_press_on_Add_to_compare_list() {
       driver.findElement(By.cssSelector(".button-2.add-to-compare-list-button")).click();
    }
    @And("^Again on required Product Page$")
    public void Again_on_required_Product_Page()  {
       driver.findElement(By.linkText("Books")).click();
        new nopcommerce.Utils().handleAlerts(driver);
    }
    @And("^Customer select another product$")
    public void Customer_select_another_product() {
        driver.findElement(By.linkText("First Prize Pies")).click();
    }
    @And("^press on Add to compare list$")
    public void press_on_Add_to_compare_list() {
        driver.findElement(By.cssSelector(".button-2.add-to-compare-list-button")).click();
    }

    @When("^press on Compare Product list$")
    public void press_on_Compare_Product_list() throws Throwable {
        driver.findElement(By.linkText("Compare products list")).click();
    }

    @Then("^Customer should be able to see selected Products on Compare Products page$")
    public void customer_should_be_able_to_see_selected_Products_on_Compare_Products_page() throws Throwable {
        new nopcommerce.Utils().handleAlerts(driver);
        WebElement webElement = driver.findElement(By.className("page-title"));
        Assert.assertEquals("Page Title of Compare Products do not match","Compare products", webElement.getText());
    }
}
