package nopcommerce;

/**
 * Created by avantrik1 on 10/02/2016.
 */
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by avantrik1 on 10/02/2016.
 */
public class BaseClass {
    public static WebDriver driver;
    @Before
    public static void startBrowser(){
        System.out.println("Starting Browser" + Enviornment.browser);
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println("Entering URL " + Enviornment.homeURL);
        driver.get(Enviornment.homeURL);
        driver.manage().window().maximize();
        System.out.println("Checking the Book Product Page is shown......");
        Assert.assertTrue("Checking the welcome message shown ", driver.findElement(By.tagName("body")).getText().contains("Computers"));
    }

    @After
    public static void closeBrowser(){
        driver.manage().deleteAllCookies();
        driver.close();
        driver.quit();
    }
}
