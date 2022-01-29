package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class Day5_GoogleArrayTest {
    public static void main(String[] args){
        //search multiple cities and each time capture the search number from the result page
        //set the array
        String[] cities = new String[3];
        cities[0]= "Bronx";
        cities[1]="Queens";
        cities[2]="Manhattan";

        //set the property of the web driver
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        //set the web driver
        WebDriver driver = new ChromeDriver();

        //set the loop
        for (int i = 0;i< cities.length;i++){



            //naviagte to google
            driver.navigate().to("https://www.google.com/");
            //maximize the screen
            driver.manage().window().maximize();
            //search for the cities in the website

            driver.findElement(By.xpath("//*[@name='q']")).sendKeys(cities[i]);

            //click on google search
            driver.findElement(By.xpath("//*[@name='btnK']")).submit();
            //split the message
            String result = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();
            //split the messay
            String[] arrayResult = result.split(" ");
            //print the message
            System.out.println("The result is "+arrayResult[1]);
        }//end of loop
    }//end of main method
}//end of java class
