package Pages;

import Base.TestBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;
import java.util.UUID;

public class WomenHomePage extends TestBase {

    @FindBy(xpath = "(//img[@class='replace-2x'])[1]")
    WebElement topsPage;

    @FindBy(xpath = "//a[@class='product-name' and@title='Blouse']")
    WebElement BlousePage;

    @FindBy(xpath = "//a[@id='color_8']")
    WebElement colorChange;

    @FindBy(xpath = "//a[@class='btn btn-default button-plus product_quantity_up']")
    WebElement addAdditonalitem;

    @FindBy(xpath = "//select[@id='group_1']")
    WebElement selectSize;

    @FindBy(xpath = "//*[contains(text(),'Add to cart')]")
    WebElement addToCart;

    @FindBy(xpath = "//a[@class='btn btn-default button button-medium']")
    WebElement ProceedToCheckout1;

    @FindBy(xpath = "//a[@title='Proceed to checkout'and @class='button btn btn-default standard-checkout button-medium']")
    WebElement ProceedToCheckout2;

    @FindBy(xpath = "//input[@name='same']")
    WebElement unCheckBox;

    @FindBy(xpath = "//*[contains(text(),'Add a new address')]")
    WebElement AddANewAddress;

    @FindBy(xpath = "//input[@name='address1']")
    WebElement inputAddress;

    @FindBy(xpath = "//input[@id='address2']")
    WebElement inputAddress2;

    @FindBy(xpath = "//input[@id='city']")
    WebElement inputCity;

    @FindBy(xpath = "//select[@id='id_state']")
    WebElement inputState;

    @FindBy(xpath = "//input[@id='postcode']")
    WebElement inputZipCode;

    @FindBy(xpath = "//input[@id='phone']")
    WebElement inputHomePhone;

    @FindBy(xpath = "//input[@type='tel' and @name='phone_mobile']")
    WebElement inputMobilePhone;

    @FindBy(xpath = "//textarea[@id='other']")
    WebElement AdditionalInformation;

    @FindBy(xpath = "//input[@id='alias']")
    WebElement addressReference;

    @FindBy(xpath = "//button[@id='submitAddress']")
    WebElement saveInfo;

    @FindBy(xpath = "//button[@name='processAddress']")
    WebElement ProceedToCheckout3;

    @FindBy(xpath = "//input[@id='cgv']")
    WebElement checkBoxAgree;

    @FindBy(xpath = "//button[@name='processCarrier']")
    WebElement ProceedToCheckout4;

    @FindBy(xpath = "//a[@title='Pay by bank wire']")
    WebElement paymentProcessing;

    @FindBy(xpath = "//*[contains(text(),'I confirm my order')]")
    WebElement confirmingOrder;

    public WomenHomePage() {
        PageFactory.initElements(driver, this);
    }

    public SignInPage shopWomenTops(
            String Firstname,
            String Lastname,
            String CompanyInfo,
            String City,
            String State,
            String ZipCode,
            String HomePhone,
            String MobilePhone,
            String AdditionalInfo
    ) {

        topsPage.click();
        BlousePage.click();
        addAdditonalitem.click();
        colorChange.click();

        System.out.println("I am trying to select the element");
        WebElement myElement = driver.findElement(By.id("group_1"));
        Select select = new Select(myElement);
        select.selectByValue("2");

        addToCart.click();
        ProceedToCheckout1.click();
        ProceedToCheckout2.click();

        unCheckBox.click();

        System.out.println("I am clicking on adding a new address");
        AddANewAddress.click();
      /*  try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/
        String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%&";
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder(6);
        for (int i = 0; i < 6; i++)
            stringBuilder.append(chars.charAt(random.nextInt(chars.length())));

        String uuid = UUID.randomUUID().toString();

        inputAddress.sendKeys(uuid);
        inputAddress2.sendKeys(uuid);
        inputCity.sendKeys(City);
        inputState.sendKeys(State);
        inputZipCode.sendKeys(ZipCode);
        inputHomePhone.sendKeys(HomePhone);
        inputMobilePhone.sendKeys(MobilePhone);
        AdditionalInformation.sendKeys(AdditionalInfo);
        addressReference.sendKeys(stringBuilder);
        saveInfo.click();
        ProceedToCheckout3.click();
        checkBoxAgree.click();
        ProceedToCheckout4.click();
        paymentProcessing.click();
        confirmingOrder.click();
        return new SignInPage();
    }

    public void getRandomAddress() {
        String uuid = UUID.randomUUID().toString();

    }

    public static String generateRandomFiveCharString() {
        String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%&";
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder(6);
        for (int i = 0; i < 6; i++)
            stringBuilder.append(chars.charAt(random.nextInt(chars.length())));
        return stringBuilder.toString();
    }


}
