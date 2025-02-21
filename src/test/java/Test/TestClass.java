package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import Base.BaseTest;
import utils.ConfigReader;

public class TestClass extends BaseTest {

    @Test(priority = 1)
    public void testCases1() throws InterruptedException {
        // Click on Explore Program
        driver.findElement(By.xpath(ConfigReader.getProperty("explore_program_xpath"))).click();
        Thread.sleep(2000);  // Use WebDriverWait in real scenarios

        // Click on Healthcare and Hospital Administration
        driver.findElement(By.xpath(ConfigReader.getProperty("Healthcare_and_Hospital_Administration_xpath"))).click();
        Thread.sleep(2000);

        // Get the actual text from the web page
        WebElement textElement = driver.findElement(By.xpath(ConfigReader.getProperty("Healthcare_and_Hospital_Administration_string")));
        String actualText = textElement.getText();
       // System.out.println(actualText); 
       // System.out.println(ConfigReader.getProperty("Healthcare_and_Hospital_Administration"));
       
        
        
        
        
        String expectedText = ConfigReader.getProperty("Healthcare_and_Hospital_Administration");
       

        // Assertion
        Assert.assertEquals(actualText, expectedText, "Text mismatch!");
      System.out.println(actualText);
    System.out.println(expectedText);
               
        driver.close();
    }
}
