package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4_GoogleAutomation {
    public static void main(String[] args){
        //set the property of the web Driver
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        //set the web driver
        WebDriver driver = new ChromeDriver();
        //navigate to google
        driver.navigate().to("http://www.google.com");
        //maximize the screen
        driver.manage().window().maximize();

        //close the window
        driver.close();

    }//end of main method
}//end of java class
