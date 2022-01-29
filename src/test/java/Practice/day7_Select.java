package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Set;

public class day7_Select {
    public static void main(String[] args) throws InterruptedException {
        //set the web driver
        WebDriverManager.chromedriver().setup();
        //define the chromeOption
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("incognito");
        //set the web driver
        WebDriver driver = new ChromeDriver(options);
        //navigate to mortgage calculator
        driver.navigate().to("https://www.mortgagecalculator.org/");
        //set a time
        Thread.sleep(3000);
        //scroll by pixels
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0,400)");
        WebElement element = driver.findElement(By.xpath("//*[@name='param[principal]']"));
        //clear the amount
        element.clear();
        //enter new amount
        element.sendKeys("300000");
       //change the month
        WebElement startMonth = driver.findElement(By.xpath("//*[@name='param[start_month]']"));
        Select sMonthDropDown = new Select(startMonth);
        sMonthDropDown.selectByValue("5");

    }//end of main method
}//end of java class
