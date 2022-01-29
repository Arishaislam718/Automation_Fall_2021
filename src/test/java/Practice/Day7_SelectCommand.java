package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Day7_SelectCommand {
    public static void main(String[] args) throws InterruptedException {
        //set the property of the web driver
        WebDriverManager.chromedriver().setup();
        //set the chrome options
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("incognito");
        //set the web driver
        WebDriver driver = new ChromeDriver(options);

        //navigate to mortgage calculator
        driver.navigate().to("https://www.mortgagecalculator.org/");
        //set a wait time
        Thread.sleep(3000);
        //set the jse driver
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        //scroll by pixels
        jse.executeScript("scroll(0,400)");

        //clear and type new homeVal
        //store the element into a WebElement
        WebElement homeval = driver.findElement(By.xpath("//*[@id='homeval']"));
        //clear
        homeval.clear();
        //enter value
        homeval.sendKeys("350000");

        //select new start month:November
        //store the element into a WebElement
        WebElement startMonth = driver.findElement(By.xpath("//*[@name='param[start_month]']"));
        //define the select command
        Select sMonthDropDown = new Select(startMonth);
        //selct by value
        sMonthDropDown.selectByValue("10");

    }//end of java class
}//end of java class
