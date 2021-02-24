package ai.makeitright.utils;

import org.junit.After;
import org.junit.Before;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverConfig extends Main {
    public static AndroidDriver driver;

    @Before
    public void setupTest() throws InterruptedException, MalformedURLException {
        System.out.println("DriverConfig.setupTest()");

        final DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        final URL url = new URL("http://127.0.0.1:4723/wd/hub");

        driver = new AndroidDriver(url, desiredCapabilities);
        Thread.sleep(6000);
    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
