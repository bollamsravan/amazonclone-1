//package example;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.AfterTest;
//
//public class NewTest {
//    public static void main(String[] args){
//        FirefoxDriver driver=new FirefoxDriver();
//        driver.get("http://localhost:8011/login");
//        WebElement element=driver.findElement(By.xpath("//input[@name='email']"));
//        element.sendKeys("dharmaraja.vandanapu@gmail.com");
//        WebElement element=driver.findElement(By.xpath("//input[@name='psword']"));
//        element.sendKeys("dharma@99");
//        WebElement button=driver.findElement(By.xpath("//input[@name='btn-login']"));
//        button.click();
//    }
//}
package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
public class NewTest {
    private WebDriver driver;
    @Test
    public void testEasy() {
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        //Launch the Online Store Website
        driver.get("http://localhost:8011/login");

        // Print a Log In message to the screen
        System.out.println("Successfully opened the website www.Store.Demoqa.com");

        //Wait for 5 Sec
        Thread.sleep(5000);

        // Close the driver
        driver.quit();
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