package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class Day8_SwitchTabs {
    public static void main(String[] args) throws InterruptedException {
        //set the web driver
        WebDriverManager.chromedriver().setup();
        //set the ChromeOptions
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("incognito");
        //set the web driver
        WebDriver driver = new ChromeDriver(options);
        //navigate
        driver.navigate().to("https://www.uhc.com/");
        //click on find a doctor
        driver.findElement(By.xpath("//*[text()='Find a doctor']")).click();
        //scroll
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0,300)");
        Thread.sleep(3000);
        //click
       // driver.findElement(By.xpath("//*[contains(text(),'Select your plan to sign in')]")).click();
        driver.findElement(By.xpath("//*[contains(text(),'Select your plan to sign in')]")).click();
        Thread.sleep(3000);

        //select medicare
        driver.findElement(By.xpath("//*[text()='Medicare plan']")).click();
        //switch to new tab
        ArrayList<String> Tab = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(Tab.get(1));

        Thread.sleep(3000);

        //switch back to window one
        driver.switchTo().window(Tab.get(0));
        //Click o Medicaid
        driver.findElement(By.xpath("//*[text()='Medicaid plan']")).click();
    }//end of java class
}//end of java class
