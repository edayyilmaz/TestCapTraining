package tests;

import org.junit.Test;
import pages.LoginPage;
import utils.BaseTest;
import static org.junit.Assert.assertTrue;

public class LoginTest extends BaseTest {

    @Test
    public void successfulLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.getPage();
        loginPage.login(configuration.getUserName(), configuration.getPassword());
        assertTrue(loginPage.userNameElement().contains("Test User"));
    }

}
