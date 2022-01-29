package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Day6_GoogleChromeOptions {
    public static void main(String[] args){
        //set the proeprty of the web driver
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        //set the chromeOptions
        ChromeOptions option = new ChromeOptions();
        option.addArguments("start-maximized");
        option.addArguments("incognito");
        option.addArguments("headless");
        //set the web driver
        WebDriver driver = new ChromeDriver(option);
        //navigate to google
        driver.navigate().to("http://www.google.com");
        driver.findElement(By.xpath("//*[@name='q']")).sendKeys("cars");
        driver.findElement(By.xpath("//*[@name='btnK']")).submit();

    }//end of main method
}//end of java class
