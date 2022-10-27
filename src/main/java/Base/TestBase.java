package Base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {
 public   static Properties prop;
    public static WebDriver driver;

  public   static WebElement element;



    static WebDriverWait wait;

    public TestBase() {


        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream("/Users/sharifyahya/ABC_Company/src/main/java/config/properties");
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void initialization() {

        String browserName = prop.getProperty("browser");
        if (browserName.equals("chrome")) {
            System.getProperty("WebDriver,ChromeDriver", "/Users/sharifyahya/ABC_Company/chromedriver");
            driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(70,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(70,TimeUnit.SECONDS);

        driver.get(prop.getProperty("url"));


    }

    public  void clickElement(WebElement element) {

        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }


}
