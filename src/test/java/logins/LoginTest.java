package logins;

import base.BaseTests;
import org.junit.jupiter.api.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginTest extends BaseTests {

    @Test
    public void testSucessFullLogin(){

        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        assertEquals(secureAreaPage.getAlertText(),"You logged into a secure area!" ,
                "Alert Text esta errado!");
    }
}
