package ActionItem_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_WebDriver_Java {
    public static void main(String[] args) throws InterruptedException {
        //search multiple sports and each time capture the search number from the result page
        //set an array
        String[] sports = new String[6];
        sports[0] = "Soccer";
        sports[1] = "Football";
        sports[2] = "Cricket";
        sports[3] = "Swimming";
        sports[4] = "Badminton";
        sports[5] = "Tennis";

        //define the WebDriver outside of the for loop
        //set the property of the chromedriver we are using
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");

        //define the web driver you are using
        WebDriver driver = new ChromeDriver();

        for(int i = 0; i< sports.length; i++){

            //simply open the bing website
            driver.navigate().to("https://www.bing.com");

            //anytime when you go to a new page you should put some wait statement
            Thread.sleep(3000);

            //searching for sports on Bing search field
            driver.findElement(By.xpath("//*[@class='sb_form_q']")).sendKeys(sports[i]);

            //hit submit on Bing search button
            driver.findElement(By.xpath("//*[@class='search icon tooltip']")).submit();

            //another wait statement since we came to a new page(result page)
            Thread.sleep(3000);

            //capture the search result and store it as a variable (this is like a return method)
            String result = driver.findElement(By.xpath("//*[@class='sb_count']")).getText();

            //declaring the array variable to split the result
            String[] arrayResult = result.split(" ");

            //now print the search number only
            System.out.println("My search result for sport  "+sports[i]+ " is " +arrayResult[0]);

        }// end of for loop

        //quit the driver
        driver.quit();

    }// end of main method
}//end of java class


