import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;


public class testCulture {
    private AndroidDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("deviceName", "AndroidTestDevice");
        desiredCapabilities.setCapability("platformVersion", "6.0");
        desiredCapabilities.setCapability("appPackage", "ru.fabit.culture");
        desiredCapabilities.setCapability("appActivity", "ru.fabit.culture.ui.activity.MainActivity");

        URL remoteUrl = new URL("http://localhost:4723/wd/hub");

        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
    }

    @Test
    public void sampleTest() {
        MobileElement el1 = (MobileElement) driver.findElementById("org.wikipedia:id/fragment_onboarding_skip_button");
        el1.click();

        MobileElement el2 = (MobileElement) driver.findElementsById("org.wikipedia:id/view_announcement_action_negative");
        el2.click();

    }


        @After
        public void tearDown() {
        driver.quit();
    }

}
