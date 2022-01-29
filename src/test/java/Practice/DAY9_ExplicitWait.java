package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DAY9_ExplicitWait {
    public static void main(String[] args) {
        //set the web driver
        WebDriverManager.chromedriver().setup();
        //set the ChromeOptions
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("incognito");
        //set the web driver
        WebDriver driver = new ChromeDriver(options);

        //navigate to usps
        driver.navigate().to("https://www.usps.com/");

        //set the driver for the wait
        WebDriverWait wait = new WebDriverWait(driver,15);
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Send']"))).click();
        }catch (Exception e){
            System.out.println("Unable to click on "+e);
        }

    }//end of main method
}//end of java class

