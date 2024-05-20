import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import org.openqa.selenium.Platform;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;

public class AppiumTests {
	public static UiAutomator2Options options;
	/*public static void main(String [] args) throws MalformedURLException {
		basicSetup();
		validLogin();
	}*/
	private static void validLogin() throws MalformedURLException {
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10L));
		driver.findElement(AppiumBy.accessibilityId("test-Username")).sendKeys("standard_user");
		driver.findElement(AppiumBy.accessibilityId("test-Password")).sendKeys("secret_sauce");
		driver.findElement(AppiumBy.accessibilityId("test-LOGIN")).click();
	}
	private static void basicSetup() {
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
}
