package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import javax.print.DocFlavor;

public class Day7_mortgageCalc_scrollElement {
    public static void main(String[] args) throws InterruptedException {
        //set the property of the web driver
        WebDriverManager.chromedriver().setup();
        //set the chrome option
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("incognito");
        //set the web driver
        WebDriver driver = new ChromeDriver(options);

        //navigate to the website
       driver.navigate().to("https://www.mortgagecalculator.org/");
       //set the time
        Thread.sleep(4000);

        //set the jse
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        //webelement
        WebElement HomeText = driver.findElement(By.xpath("//*[@class='left-cell']"));
        jse.executeScript("arguments[0].scrollIntoView(true);",HomeText);



    }//end of main method
}//end of java class
