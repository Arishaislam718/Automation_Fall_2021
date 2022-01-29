package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day9_ReusableActions {
    public static WebDriver setDriver(){
        //set the property of the webDriver
        WebDriverManager.chromedriver().setup();
        //declare the chromeOptions
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("incognito");
        //set the web driver
        WebDriver driver = new ChromeDriver(options);
        return driver;
    }//end of setDriver method

    //create a reusable method for click
    public void ClickMethod(WebDriver driver, String xpath, String elementName){
        //set the explicit wait
        WebDriverWait wait = new WebDriverWait(driver,15);
        System.out.println("Able to click on "+elementName);
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
        }catch (Exception e){
            System.out.println("Unable to click on"+e);
        }//end of exception
    }//end of click method


    //create a reusable method for sendKeys
    public void sendKeys(WebDriver driver, String xpath, String userData, String ElementName){
        //declare your explicit
        WebDriverWait wait = new WebDriverWait(driver, 15);
        System.out.println("Able to click on"+ElementName);
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
        }catch(Exception e){
            System.out.println("Unable to click on "+e);
        }//end of exception
    }//end of sendKeys method




}//end of java class

