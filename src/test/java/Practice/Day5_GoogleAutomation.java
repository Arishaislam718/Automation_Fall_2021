package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5_GoogleAutomation {
    public static void main(String[] args){
        //set the web driver
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        //set the web driver
        WebDriver driver = new ChromeDriver();
        //naviagte to google
        driver.navigate().to("http://www.google.com");
        //set it to full screen
        driver.manage().window().maximize();
        //write on the search field
        driver.findElement(By.xpath("//*[@name='q']")).sendKeys("cars");
        //submit
        driver.findElement(By.xpath("//*[@name='btnK']")).submit();
        //split and print only the search result
        String result = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();
        String[] arrayResult = result.split(" ");
        System.out.println("My search result for car is "+arrayResult[1]);

    }//end of java class
}//end of java class
