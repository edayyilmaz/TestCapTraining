package utils;

import java.io.IOException;
import java.util.Properties;

public class Configuration {
    public Properties configProps = new Properties();
    private String geckoDriverPath;
    private String chromeDriverPath;
    private String userName;
    private String password;

    Configuration () {
        try {
            String configFile = "config.properties";
            configProps.load(ClassLoader.getSystemResourceAsStream(configFile));

            this.geckoDriverPath = configProps.getProperty("webdriver.gecko.driver");
            this.chromeDriverPath = configProps.getProperty("webdriver.chrome.driver");
            this.userName = configProps.getProperty("username");
            this.password = configProps.getProperty("password");

        } catch (IOException e) {
            System.err.println("Cannot read config file");
        }
    }

    public String getGeckoDriverPath() {
        return geckoDriverPath;
    }
    public String getChromeDriverPath() {
        return chromeDriverPath;
    }
    public String getUserName(){ return userName;};
    public String getPassword(){ return password;};
}
