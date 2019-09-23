package home;

import common.BasePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.LogInPage;

import java.io.IOException;

public class TestLogInPage extends BasePage {

    @Test (dataProvider="getData")

    public void TestLogin ( String Username, String Password) throws IOException {

        driver.get("https://global.americanexpress.com/login?inav=iNavLnkLog");
        LogInPage log = new LogInPage(driver);
        log.getUsername().sendKeys(Username);
        log.getPass().sendKeys(Password);
        log.getLogin().click();


    }

    @DataProvider

    public Object[][] getData(){

        Object [][] data = new Object [2][2];

        data [0][0] = "ts@abc.com";
        data [0][1] ="111";


        data [1][0] ="abc@gmail.com";
        data [1][1] = "abc123";

        return data;




    }

    @Test

    public void getText () throws IOException {

   driver.get("https://global.americanexpress.com/login?inav=iNavLnkLog");
        LogInPage log = new LogInPage(driver);

        String title = log.getTextData().getText();
        System.out.println(title);
        Assert.assertEquals( title,"FROM OUR PARTNERS");

    }





}
