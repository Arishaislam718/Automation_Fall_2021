package Day4_121221;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Automation {
    public static void main(String[] args){

        //set the property to the chromedriver we are using
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe"); // if using mac, no need to put exe
        //define the web driver you are using
        WebDriver driver = new ChromeDriver();

        //simply open the Google web site
        driver.navigate().to("https://www.google.com");

        //maximize my browser
        driver.manage().window().maximize();// for windows
        //driver.manage().window().fullscreen(); // for mac

        //close the Google web site
        //driver.close();

    }// end of main method
}// end of java class


