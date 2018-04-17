

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.WebDriver;

import org.testng.Assert;
import org.junit.Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;


public class NewTest {

    @Test
    public void testEasy() {
        System.setProperty("webdriver.gecko.driver", "/home/shravan/SeleniumGecko/geckodriver");

        //Now you can Initialize marionette driver to launch firefox
        WebDriver driver = new FirefoxDriver();
        driver.get("http://localhost:8083/login");
        WebElement element=driver.findElement(By.xpath("//input[@name='email']"));
        element.sendKeys("bollamsravan@gmail.com");
        WebElement element1=driver.findElement(By.xpath("//input[@name='psword']"));
        element1.sendKeys("shravan");
        WebElement button=driver.findElement(By.xpath("//input[@id='continue']"));
        button.click();

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
