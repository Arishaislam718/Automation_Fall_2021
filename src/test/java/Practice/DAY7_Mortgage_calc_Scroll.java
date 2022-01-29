package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DAY7_Mortgage_calc_Scroll {
    public static void main(String[] args) throws InterruptedException {
        //set the property of the web driver
        WebDriverManager.chromedriver().setup();
        //set the chrome option for arguments
        ChromeOptions options = new ChromeOptions();
        //maximize
        options.addArguments("start-maximized");
        options.addArguments("incognito");
        //set the web driver
        WebDriver driver = new ChromeDriver(options);

        //navigate to mortgage calculator
        driver.navigate().to("https://www.mortgagecalculator.org/");
        //wait time
        Thread.sleep(4000);
        //set the javascript executor
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0,450)");

    }//end of main method
}//end of java class
