package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Day8_TryandCatch {
    public static void main(String[] args) throws InterruptedException {
        //set the web driver
        WebDriverManager.chromedriver().setup();
        //set the ChromeOptions
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("incognito");
        //set the web driver
        WebDriver driver = new ChromeDriver(options);
        //navigate to website
        driver.navigate().to("https://www.mlcalc.com/");
        //set a wait time
        Thread.sleep(3000);
        //clear and change the purchase price
        try {
            WebElement pPrice = driver.findElement(By.xpath("//*[@id='ma']"));
            pPrice.clear();
            //enter new value
            pPrice.sendKeys("40000");
        }catch (Exception e){
            System.out.println("Unable to change the purchase price "+e);
        }//end of exception

        Thread.sleep(3000);

        //click on 'show advanced'
        try{
            driver.findElement(By.xpath("//*[text()='Show advanced options']")).click();
        }catch (Exception e){
            System.out.println("Unable to click on "+e);
        }//end of exception

        Thread.sleep(3000);
        //change the start date
        try{
            WebElement sDate = driver.findElement(By.xpath("//*[@name='sm']"));
            Select smonthDrop= new Select(sDate);
            smonthDrop.selectByValue("4");
        }catch(Exception e){
            System.out.println("Unable to change the "+e);
        }//end of exception



    }//end of main method
}//end of java class
