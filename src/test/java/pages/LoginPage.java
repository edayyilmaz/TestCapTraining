package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;
    String pageUrl = "https://giris.hepsiburada.com";

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void getPage() {
        driver.get(pageUrl);
    }

    public void login(String userName,String password) {
        driver.findElement(By.id("txtUserName")).sendKeys(userName);
        driver.findElement(By.id("btnLogin")).click();
        driver.findElement(By.id("txtPassword")).sendKeys(password);
        driver.findElement(By.id("btnEmailSelect")).click();
    }

    public String userNameElement() {
        return driver.findElement(By.cssSelector("#myAccount > span > a > span:nth-child(2)")).getText();
    }
}
