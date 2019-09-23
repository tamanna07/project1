package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BasePage {


        public static WebDriver driver;
        public Properties prop;

        @Parameters({"url"})

        @BeforeMethod
         public WebDriver setUp () throws IOException {

                 prop= new Properties();
                 FileInputStream fis=new FileInputStream("C:\\Users\\tsult\\Desktop\\workspace\\FrameworkDemo\\src\\main\\resources\\prop.properties");

                 prop.load(fis);
                 String browserName=prop.getProperty("browser");
                 System.out.println(browserName);

                 if(browserName.equals("chrome"))
                 {
                         System.setProperty("webdriver.chrome.driver", "C:\\Users\\tsult\\Desktop\\workspace\\FrameworkDemo\\src\\main\\java\\driver\\chromedriver.exe");
                         driver= new ChromeDriver();
                         //execute in chrome driver

                 }
                 else if (browserName.equals("firefox"))
                 {
                         driver= new FirefoxDriver();
                         //firefox code
                 }
                 else if (browserName.equals("IE"))
                 {
                        //	IE code
                 }

                return driver;

         }
        @AfterMethod
        public void cleanUp() {
                driver.close();
        }



}

