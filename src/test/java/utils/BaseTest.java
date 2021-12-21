package utils;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected static WebDriver driver;
    protected static Configuration configuration;

    @BeforeClass
    public static void openWebsite() {

        configuration = new Configuration();

        //System.setProperty("webdriver.gecko.driver",configuration.getGeckoDriverPath());
        //driver = new FirefoxDriver();

        System.setProperty("webdriver.chrome.driver",configuration.getChromeDriverPath());
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterClass
    public static void closeWebsite(){
        driver.quit();
    }

}
