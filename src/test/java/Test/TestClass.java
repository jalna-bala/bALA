package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import Base.BaseTest;
import utils.ConfigReader;
import java.time.Duration;

import javax.xml.crypto.Data;

public class TestClass extends BaseTest implements datas {  // Corrected syntax

  

    @Test(priority = 11)
    public void TESTCASES11() throws InterruptedException {
       
        driver.findElement(By.xpath(explore_program_xpath)).click();
        
        driver.findElement(By.xpath(Healthcare_and_Hospital_Administration_xpath_program_click)).click();
        
        WebElement text = driver.findElement(By.xpath(Healthcare_and_Hospital_Administration_string_rev));
       
        String IB = text.getText();
       
      //   System.out.println(IB);

       //Assert.assertEquals(Healthcare_and_Hospital_Administration_Data, IB);
       Assert.assertEquals(IB, Healthcare_and_Hospital_Administration);
       System.out.println(IB + " ELECTIVE IS FOUND");
       
       driver.close();

    }
    
}
