package TestCases;

import Base.TestBase;
import Pages.HomePage;
import Pages.SignInPage;
import Pages.WomenHomePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignInPageTest extends TestBase {
    SignInPage signInPage;
    WomenHomePage womenHomePage;

    HomePage homePage;

    public SignInPageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        signInPage = new SignInPage();
        womenHomePage = new WomenHomePage();
        homePage = new HomePage();
    }

    @Test
    public void SignInPageTest() {
        homePage = signInPage.SignInPageUser(prop.getProperty("EmailAddress"), prop.getProperty("Password"));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


}
