package test;

import org.testng.annotations.Test;
import base.BaseTest;

public class LaunchTest extends BaseTest {

    @Test
    public void openBrowserTest() {
        System.out.println("Browser launched successfully!");
        System.out.println("Current Page Title: " + driver.getTitle());
    }
}
