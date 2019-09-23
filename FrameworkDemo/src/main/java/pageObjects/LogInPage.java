package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage {

     public WebDriver driver; //1st  declare global driver

    public LogInPage(WebDriver driver) { // constructor to give life to the  driver

        this.driver = driver;
    }


    // 3rd declare the page objs
    By login1 = By.id("//*[@id=\"gnav_login\"]");

    By username = By.cssSelector("#eliloUserID");
    By passwd = By.cssSelector("#eliloPassword");
    By login = By.xpath("//*[@id=\"eliloPassword\"]");

      By text = By.className("label")  ;



      public WebElement getTextData(){


          return driver.findElement(text);

      }

    public WebElement getLogin1()
    {
        return driver.findElement(login1);
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
