package ai.makeitright.test2;

import ai.makeitright.utils.DriverConfig;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class SampleAppTest2 extends DriverConfig {

    @Test
    public void checkText() throws InterruptedException {
        System.out.println("SampleAppTest2.checkText");

        final WebElement button_first = driver.findElementById("pl.makeitright.appium_sample_app:id/button_first");
        button_first.click();
        Thread.sleep(2000);

        final WebElement button_second = driver.findElementById("pl.makeitright.appium_sample_app:id/button_second");
        button_second.click();
        Thread.sleep(2000);

        final WebElement textview_first = driver.findElementById("pl.makeitright.appium_sample_app:id/textview_first");
        Assert.assertEquals("Hello first fragment", textview_first.getText());

        System.out.println("DONE");
    }
}
