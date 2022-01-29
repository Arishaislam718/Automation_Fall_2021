package ActionItem_5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Reusable_Actions {
    //create a reusable method for WebDriver and ChromeOptions
    public static WebDriver setDriver(){
        //setup chrome driver
        WebDriverManager.chromedriver().setup();
        //declare and define the chrome options
        ChromeOptions options = new ChromeOptions();
        //declare all the arguments you need
        //to maximize my driver
        options.addArguments("start-maximized");
        //set as incognito mode
        options.addArguments("incognito");
        //define the web driver you are using
        WebDriver driver = new ChromeDriver(options);
        return driver;
    }//end of Webdriver Method

    //creating void method for javascript executor to scroll
    public static void scrollMethod(WebDriver driver, String x, String y, String scroll){
        System.out.println("Able to " + scroll);
        try {
            //scroll to window
            JavascriptExecutor jse = (JavascriptExecutor)driver;
            //scroll by pixels
            jse.executeScript("scroll("+x+","+y+")");
        } catch (Exception e) {
            System.out.println("Unable to " + scroll + " Error:" + e);
        }//end of exception
    }//end of scroll method


    //creating void click method for any web element
    public static void clickMethod(WebDriver driver, String xpath, String elementName){
        //declare local explicit wait
        WebDriverWait wait = new WebDriverWait(driver,15);
        System.out.println("Clicking on element " + elementName);
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))).click();
        } catch (Exception e) {
            System.out.println("Unable to click on " + elementName + " Error:" + e);
        }//end of exception
    }//end of click method

    //creating void sendkeys method for any web element
    public static void sendKeysMethod(WebDriver driver, String xpath, String userData, String elementName){
        //declare local explicit wait
        WebDriverWait wait = new WebDriverWait(driver,15);
        System.out.println("Typing on element " + elementName);
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            //clear first
            element.clear();
            //enter user data
            element.sendKeys(userData);
        } catch (Exception e) {
            System.out.println("Unable to type on " + elementName + " Error:" + e);
        }//end of exception
    }//end of sendKeysMethod


    //selecting dropdown
    public static void SelectMethod(WebDriver driver,String xpath, String userData, String elementName){
        //declare local explicit wait
        WebDriverWait wait = new WebDriverWait(driver,15);
        System.out.println("Selected element "+elementName);
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            element.sendKeys(userData);
        }catch (Exception e){
            System.out.println("Unable to select "+elementName+ "Error:" + e);
        }//end of exception
    }//end of select method

    //creating return getText method
    public static String getTextMethod(WebDriver driver, String xpath, String elementName){
        //declare local explicit wait
        WebDriverWait wait = new WebDriverWait(driver,15);
        System.out.println("Capturing text on element " + elementName);
        //declare a global variable to capture the text so I can return it
        String result = "";
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            //capture text
            result = element.getText();
        } catch (Exception e) {
            System.out.println("Unable to capture text on " + elementName + " Error:" + e);
        }//end of exception
        return result;
    }//end of click getTextMethod
}//end of java class
