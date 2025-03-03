package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected WebDriver driver;

    @BeforeClass
    public void setup() {
    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver-win64\\Chromedriver.exe");
	      
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies(); // ✅ Clears cookies for a clean session
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // ✅ Helps in locating elements
        driver.get("https://www.google.com"); // ✅ Change this to your application URL
    }

    @AfterClass
    public void teardown() {
        if (driver != null) {
            driver.quit(); // ✅ Closes browser after execution
            driver = null; // ✅ Helps in memory management
        }
    }
}
