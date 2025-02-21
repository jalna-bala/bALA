package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import utils.ConfigReader;

import java.time.Duration;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Set ChromeDriver path (ensure it's correct)
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver.exe");

        // Initialize WebDriver
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        // Load URL from ConfigReader
        String url = ConfigReader.getProperty("url");
        if (url != null) {
            driver.get(url);
        } else {
            throw new RuntimeException("URL not found in data.properties.");
        }
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
