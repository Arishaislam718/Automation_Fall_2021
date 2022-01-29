package Practice;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Day7_ScrollByPixels {
    public static void main(String[] args){
        //set the property of the web driver
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        //set the chromeOptions
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("incognito");
        //set the web driver
        WebDriver driver = new ChromeDriver(options);
        //navigate to mortgage calculator
        driver.navigate().to("https://www.mortgagecalculator.org");
        //scroll down on the page
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0,400)");
    }//end of main method0
}//end of java class
