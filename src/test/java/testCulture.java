import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
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
        MobileElement el1 = (MobileElement) driver.findElementById("ru.fabit.culture:id/action_schedule");
        el1.click();
        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Поиск");
        el2.click();
        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Поиск");
        el2.click();
        MobileElement el3 = (MobileElement) driver.findElementById("ru.fabit.culture:id/et_search_query");
        el3.sendKeys("qwe");


    }



    @After
    public void tearDown() {
        driver.quit();
    }

}
