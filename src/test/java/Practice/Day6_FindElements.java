package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Day6_FindElements {
    public static void main(String[] args){
        //set the web driver
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        //set the chrome option
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        //options.addArguments("incognito");
        //set the web driver
        WebDriver driver = new ChromeDriver(options);
        //navigate to yahoo
        driver.navigate().to("https://www.yahoo.com/");
        //click on news
        driver.findElements(By.xpath("//*[@class='_yb_1k9mg ']")).get(1).click();
    }//end of main method
}//end of java class
