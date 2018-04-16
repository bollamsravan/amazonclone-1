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
        driver.get("http://localhost:8011/login");
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Amazon Sign IN"));
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