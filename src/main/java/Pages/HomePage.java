package Pages;

import Base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {


    @FindBy(xpath = "//img[@class='logo img-responsive']")
    WebElement pageLogo;

    @FindBy(xpath = "(//a[contains(text(),'Women')])[1]")
    WebElement interWomenPage;

    public HomePage() {
        PageFactory.initElements(driver, this);


    }
    public String HomePageTitle(){
       return driver.getTitle();
    }

    public boolean HomePageLogo(){
     return pageLogo.isDisplayed();
    }
    public HomePage womenTops(){
        interWomenPage.click();
        return new HomePage();
    }

}
