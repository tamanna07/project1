package home;

import common.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;

import java.io.IOException;
import java.util.logging.Logger;


public class TestHomePage extends BasePage {

        @Test
        public void navigate () throws IOException {

            driver.get("https://americanexpress.com");
            HomePage home = new HomePage(driver); // anytime you create a obj of object page, give driver inside constructor

            home.getUsername().sendKeys("tsbristy");
            home.getPass().sendKeys("11111");
            home.getLogin().click();
        }



        @Test

        public void NavBar () throws IOException {

            driver.get("https://americanexpress.com");
            HomePage home = new HomePage(driver); // anytime you create a obj of object page, give driver inside constructor


            Assert.assertTrue(home.getNavBar().isDisplayed());
           // Assert.assertFalse();// most frequently used assertion

        }



    }







