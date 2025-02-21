package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import utils.ConfigReader;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Set the path for the ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver-win64\\Chromedriver.exe");

        // Initialize the WebDriver
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        // Get URL from ConfigReader
        String url = ConfigReader.getProperty("url");
        if (url != null) {
            driver.get(url);
        } else {
            throw new RuntimeException("URL not found in data.properties file.");
        }
    }

  // @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
