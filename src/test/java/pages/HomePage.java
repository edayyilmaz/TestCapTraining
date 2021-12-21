package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;
    String pageUrl = "https://www.hepsiburada.com";

    public HomePage (WebDriver driver) {
        this.driver = driver;
    }
    public void getPage() {
        driver.get(pageUrl);
    }
    public void searchProduct(String productName) {
        //new WebDriverWait(driver,10).until(ExpectedConditions.);
        driver.findElement(By.cssSelector("#SearchBoxOld > div > div > div.SearchBoxOld-inputContainer > div.desktopOldAutosuggestTheme-container > input")).sendKeys(productName);
        driver.findElement(By.cssSelector("#SearchBoxOld > div > div > div.SearchBoxOld-buttonContainer")).click();
    }

    public boolean isAnyProductDisplayed() {
        try {
            return !driver.findElement(By.id("noResultsTitle")).isDisplayed();
        }catch (NotFoundException e) {
            return true;
        }
    }
}
