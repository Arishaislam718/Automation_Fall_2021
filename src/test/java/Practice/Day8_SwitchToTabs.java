package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class Day8_SwitchToTabs {
    public static void main(String[] args) throws InterruptedException {
        //set the property of the Web Driver
        WebDriverManager.chromedriver().setup();
        //set the chrome options
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("incognito");
        //set the web driver
        WebDriver driver = new ChromeDriver(options);

        //navigate to UHC
        driver.navigate().to("https://www.uhc.com/");
        //set a wait time
        Thread.sleep(4000);
        //click on find a doctor
        driver.findElement(By.xpath("//*[text()='Find a doctor']")).click();
        Thread.sleep(4000);
        //scroll
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0,300)");
        //click on select your plan dropdown and choose medicare as value
        driver.findElement(By.xpath("//*[contains(text(),'Select your plan to sign in')]")).click();
        driver.findElement(By.xpath("//*[text()='Medicare plan']")).click();
        //to switch to new tab use arraylist
        ArrayList<String> tabs = new ArrayList<>();
        //switch to new tab
        driver.switchTo().window(tabs.get(1));
        Thread.sleep(4000);
        //click on dismiss (for the pop-up)
        driver.findElement(By.xpath("//*[@id='alert-sticky__dismiss-button']")).click();
        Thread.sleep(4000);
        //click on Sign In
        //driver.findElement(By.xpath("//*[text()='Sign In']")).click();
    }//end of main method
}//end of java class
