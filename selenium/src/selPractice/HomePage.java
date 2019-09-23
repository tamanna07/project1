package selPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tsult\\IdeaProjects\\selenium\\lib\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //launch chrome

        driver.get("http://www.amazon.com");//enter url

        String title = driver.getTitle();//get the title
        System.out.println("page title is: "+ title);

        //validation point:
        if(title.equals("Amazon")){
            System.out.println("correct title");
        }else{
            System.out.println("in-correct title");
        }

        //System.out.println(driver.getCurrentUrl());

       // System.out.println(driver.getPageSource());

        driver.quit();//close the browser




    }



}
