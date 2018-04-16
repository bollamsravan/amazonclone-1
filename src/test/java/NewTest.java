

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.WebDriver;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;


public class NewTest {

    private WebDriver driver;
    @Test
    public void testEasy() {
        System.setProperty("webdriver.gecko.driver", "/home/dharma_vandanapu/seleniumGecko/geckodriver.exe");

        //Now you can Initialize marionette driver to launch firefox
        WebDriver driver = new FirefoxDriver();
        driver.get("http://localhost:8011/login");
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Demo Guru99 Page"));
    }
    @BeforeTest
    public void beforeTest() {
        driver = new FirefoxDriver();
    }
    @AfterTest
    public void afterTest() {
        driver.quit();
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
