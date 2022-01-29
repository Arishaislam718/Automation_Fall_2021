package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class Day9_MouseActions {
    public static void main(String[] args) throws InterruptedException {
        //set the web driver
        WebDriverManager.chromedriver().setup();
        //set the chromeOptions
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("incognito");
        //set the web Driver
        WebDriver driver = new ChromeDriver(options);
        //navigate to usps
        driver.navigate().to("https://www.usps.com/");
        //hover to send
        Actions mouseAction = new Actions(driver);
        try {
            WebElement element = driver.findElement(By.xpath("//*[text()='Quick Tools']"));
            mouseAction.moveToElement(element).perform();
        }catch(Exception e){
            System.out.println("Unable to hover on "+e);
        }//end of exception

        //click on track a package
        try {
            WebElement element = driver.findElement(By.xpath("//*[text()='Track a Package']"));
            mouseAction.moveToElement(element).click().perform();
        }catch (Exception e){
            System.out.println("Unable to click on "+e);
        }//end of exception

    }//end of main method
}//end of java class
