package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Day9_ImplicitWait {
    public static void main(String[] args){
        //set the property of the web driver
        WebDriverManager.chromedriver().setup();
        //set the ChromeOptions
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("incognito");
        //set the web driver
        WebDriver driver = new ChromeDriver(options);

        //set your implicit wait and declare it for all web elements
      driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);




    }//end of main method
}//End of Java class
