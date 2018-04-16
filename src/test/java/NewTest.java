package example;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;


public class NewTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        // Create a new instance of the html unit driver
        driver = new HtmlUnitDriver();

        //Navigate to desired web page
        driver.get("http://localhost:8011/login");
    }
}

//package example;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.AfterTest;
//public class NewTest {
//    private WebDriver driver;
//    @Test
//    public void testEasy() {
//        driver.get("http://localhost:8011/login");
//        String title = driver.getTitle();
//        Assert.assertTrue(title.contains("Amazon Sign IN"));
//    }
//    @BeforeTest
//    public void beforeTest() {
//        driver = new FirefoxDriver();
//    }
//    @AfterTest
//    public void afterTest() {
//        driver.quit();
//    }
}