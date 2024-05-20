package tests;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import org.openqa.selenium.Platform;
import org.testng.Assert;
import pages.LoginPage;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;

public class LoginTests {
    public static UiAutomator2Options options;
    public static AndroidDriver driver;
    public static void basicSetup() {
        Path path = Paths.get("D:\\Workspace01\\src\\test\\resources\\App\\demo.apk");
//		DesiredCapabilities capabilities = new DesiredCapabilities();
        options = new UiAutomator2Options();
        options.autoGrantPermissions();
//		options.fullReset();
        options.noReset();
        options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
        options.setPlatformVersion("14");
        options.setPlatformName(Platform.ANDROID.name());
        options.setApp(path.toAbsolutePath().toString());
        options.setAppPackage("com.swaglabsmobileapp");
        options.setAppActivity("com.swaglabsmobileapp.MainActivity");
        options.setAppWaitForLaunch(true);
    }
    public static void openApp() throws MalformedURLException{
        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10L));
    }
    public static void validLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLoginButton();
    }
    public static void SuccessLogin(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10L));
        String productText = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='PRODUCTS']")).getText();
        Assert.assertEquals("PRODUCTS", productText);
    }
    public static void invalidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("abc");
        loginPage.enterPassword("abc");
        loginPage.clickLoginButton();
    }
    public static void errorMessage(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10L));
        String actualText = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Username and password do not match any user in this service.\"]")).getText();
        String expectedMsg = "Username and password do not match any user in this service.";
        Assert.assertEquals(expectedMsg, actualText);
    }
    public static void emptyField() {
        driver.findElement(AppiumBy.accessibilityId("test-LOGIN")).click();
    }
    public static void errorMessageOfEmptyField(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10L));
        String actualText = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Username is required\"]")).getText();
        String expectedMsg = "Username is required";
        Assert.assertEquals(expectedMsg, actualText);
    }
    public static void closeApp(){
        if (driver != null) {
            driver.quit();
        }
    }
}
