import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;


public class MobileTest {

     private AppiumDriver driver;

    @Before
    public void setUp() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("deviceName", "testDevice");
        capabilities.setCapability(CapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability("platformVersion", "7");

        File file = new File("/home/user/Загрузки/Telegram Desktop", "wiki.apk");
        capabilities.setCapability("app", file.getAbsolutePath());

        driver = new AndroidDriver(new URL("http://127.0.1.1:4723/wd/hub"), capabilities);

    }
    @Test
    public void TestMethod(){

        MobileElement el1 = (MobileElement) driver.findElementsById("org.wikipedia:id/fragment_onboarding_skip_button");
        el1.click();

    }


    @After
    public void TearMethod(){
        driver.quit();

    }



}
