package Pages;

import Base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends TestBase {

    @FindBy(xpath = "//a[@class='login']")
    WebElement siginPageBtn;

    @FindBy(xpath = "//input[@id='email']")
    WebElement inputEmail;

    @FindBy(xpath = "//input[@id='passwd']")
    WebElement inputPassword;

    @FindBy(xpath = "//button[@id='SubmitLogin']")
    WebElement signInBtn;

    public SignInPage(){
        PageFactory.initElements(driver,this);
    }
    public HomePage SignInPageUser(String EmailAddress,String Password){
        siginPageBtn.click();
        inputEmail.sendKeys(EmailAddress);
        inputPassword.sendKeys(Password);
        signInBtn.click();
        return new HomePage();
    }




}

