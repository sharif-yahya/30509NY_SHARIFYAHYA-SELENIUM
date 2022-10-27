package TestCases;

import Base.TestBase;
import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;

public class HomePageTest extends TestBase {

    HomePage homePage;

    public HomePageTest(){
        super();
    }

    @BeforeMethod
    public void setUp(){
       initialization();
       homePage =new HomePage();

    }
    @Test(priority = 1)
    public void HomePageTitleTest(){
    String title = homePage.HomePageTitle();
    Assert.assertEquals(title,"My Store");
    }
    @Test(priority = 2)
    public void HomePageLogoTest(){
      boolean logo =  homePage.HomePageLogo();
        Assert.assertTrue(logo);
    }
    @Test
    public void womenTopsTest(){
       homePage = homePage.womenTops();

    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }




}
