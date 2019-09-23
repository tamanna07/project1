package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {


        public WebDriver driver; //1st  declare global driver

        public HomePage (WebDriver driver) { // constructor to give life to the  driver

            this.driver = driver;
    }


    // 3rd declare the page objs
        By username = By.id("login-user");
        By passwd = By.id("login-password");
        By login = By.id("login-submit");


        By NavBar = By.cssSelector("#amex-header > div > div.axp-global-header__GlobalHeader__globalHeader___1FtPO.axp-global-header__GlobalHeader__withoutSAN___3mTIg.axp-global-header__dls__nav___3fRQ-.axp-global-header__dls__navSticky___1z47- > div.axp-global-header__GlobalHeader__horizontalNav___xpeRa.axp-global-header__dls__nav___3fRQ-.axp-global-header__dls__navHorizontal___WMUzY.axp-global-header__dls__borderB___2Mn8V.axp-global-header__dls__navLarge___2ep_Q.axp-global-header__dls__dlsAccentWhite01Bg___3JnPj > div.axp-global-header__GlobalHeader__navContainer___1OEUJ.axp-global-header__dls__container___1nKch.axp-global-header__dls__widthFull___LPsPQ > div > div.axp-global-header__dls__hiddenMdDown___FiMgu > div > ul");


        public WebElement getNavBar () {

            return driver.findElement(NavBar);
        }




    public WebElement getLogin()
    {
        return driver.findElement(login);
    }

    public WebElement getUsername (){


        return driver.findElement(username);
    }

    public WebElement getPass (){

        return driver.findElement(passwd);
    }








}
