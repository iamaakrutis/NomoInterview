package pages;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class LoginPage {
    private final AndroidDriver driver;
    //initializing the driver
    public LoginPage(AndroidDriver driver) {
        this.driver = driver;
    }
    // Methods to interact with elements on the login page
    public void enterUsername(String username) {
        driver.findElement(AppiumBy.accessibilityId("test-Username")).sendKeys(username);
    }
    public void enterPassword(String password) {
        driver.findElement(AppiumBy.accessibilityId("test-Password")).sendKeys(password);
    }
    public void clickLoginButton() {
        driver.findElement(AppiumBy.accessibilityId("test-LOGIN")).click();
    }
}
