package TestCases;

import Base.TestBase;
import Pages.HomePage;
import Pages.SignInPage;
import Pages.WomenHomePage;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class WomenPageTest extends TestBase {
    WebDriverWait wait;
    WomenHomePage womenHomePage;
    SignInPage signInPage;

    HomePage homePage;

    public WomenPageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        womenHomePage = new WomenHomePage();
        signInPage = new SignInPage();
        homePage = new HomePage();
        homePage = signInPage.SignInPageUser(prop.getProperty("EmailAddress"),
                                                prop.getProperty("Password"));
        homePage = homePage.womenTops();

    }

    @Test(priority = 1)
    public void shopWomenItem() {

        womenHomePage.shopWomenTops(
                prop.getProperty("FirstName"),
                prop.getProperty("LastName"),
                prop.getProperty("CompanyInfo"),
                prop.getProperty("City"),
                prop.getProperty("State"),
                prop.getProperty("ZipCode"),
                prop.getProperty("HomePhone"),
                prop.getProperty("MobilePhone"),
                prop.getProperty("AdditionalInfo")
        );


    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
