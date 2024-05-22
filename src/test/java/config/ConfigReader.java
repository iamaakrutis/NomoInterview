package config;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
        private static Properties properties;

        static {
            try {
                FileInputStream fileInputStream
                        = new FileInputStream("src/test/resources/config.properties");
                properties = new Properties();
                properties.load(fileInputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public static String getAppPath() {
            return properties.getProperty("app.path");
        }

        public static String getAppiumServerUrl() {
            return properties.getProperty("appium.server.url");
        }
}
