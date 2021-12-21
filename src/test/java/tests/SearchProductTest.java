package tests;

import org.junit.Test;
import pages.HomePage;
import pages.LoginPage;
import utils.BaseTest;
import static org.junit.Assert.assertTrue;

public class SearchProductTest extends BaseTest {
    @Test
    public void searchPlaystation4() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.getPage();
        loginPage.login(configuration.getUserName(), configuration.getPassword());
        assertTrue(loginPage.userNameElement().contains("Test User"));
        homePage.searchProduct("ps4");
        assertTrue(homePage.isAnyProductDisplayed());
    }
}
