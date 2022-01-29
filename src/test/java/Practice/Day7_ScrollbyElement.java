package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Day7_ScrollbyElement {
    public static void main(String[] args) throws InterruptedException {
        //set the property of the web driver
        WebDriverManager.chromedriver().setup();
        //set the chromeOptions
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("incognito");
        //set the web driver
        WebDriver driver = new ChromeDriver(options);
        //navigate to mortgage calculator
        driver.navigate().to("https://www.mortgagecalculator.org");
        //set a time
        Thread.sleep(3000);
        //scroll to the window
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        WebElement homeValText=driver.findElement(By.xpath("//*[contains(text(),' Home Value: ')]"));
        jse.executeScript("arguments[0].scrollIntoView(true)",homeValText);
    }
}
