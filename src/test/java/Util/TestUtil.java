package Util;

import Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.xml.bind.Element;
import java.util.List;

public class TestUtil extends TestBase {

    static long PAGE_LOAD_TIMEOUT = 30;
    static long IMPLICIT_WAIT = 30;

    public TestUtil() {

        TestUtil testUtil;

        Actions action = new Actions(driver);


    }
}
   /* public static String generateRandomFiveCharString() {
        String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%&";
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder(5);
        for (int i = 0; i < 5; i++)
            stringBuilder.append(chars.charAt(random.nextInt(chars.length())));
        return stringBuilder.toString();
    }*/