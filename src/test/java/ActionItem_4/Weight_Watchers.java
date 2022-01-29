package ActionItem_4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.List;

public class Weight_Watchers {
    public static void main(String[] args) throws InterruptedException {
        //set an array list for integers
        ArrayList<String> zipCode = new ArrayList<>();
        zipCode.add("11218");
        zipCode.add("10462");
        zipCode.add("10467");

        //set the web driver manager
        WebDriverManager.chromedriver().setup();
        //set the ChromeOptions
        ChromeOptions options = new ChromeOptions();
        //maximize my screen
        options.addArguments("start-maximized");
        //incognito
        options.addArguments("incognito");
        //set my web driver
        WebDriver driver = new ChromeDriver(options);

        for (int i = 0; i< zipCode.size();i++) {

            //navigate to weight watchers.com
            driver.navigate().to("https://www.weightwatchers.com/us/");

            //set a wait time for new page
            Thread.sleep(2500);

            //Click on Attend Dropdown
            try{
                driver.findElement(By.xpath("//*[@class='MenuItem_menu-item__angle-wrapper__1XaUv']")).click();
            }catch (Exception e){
                System.out.println("Unable to click attend dropdown "+e);
            }//end of Attend dropdown exception

            //Click on Unlimited Workshops
            try {
                driver.findElement(By.xpath("//*[@class='MenuItem_subtitle__3LoiE']")).click();
            }catch (Exception e){
                System.out.println("Unable to click on unlimited workshops "+e);
            }//end of unlimited workshop exceptions

            //set a wait time for new page
            Thread.sleep(2500);

            //Click on find a studio link
            try {
                driver.findElement(By.xpath("//*[@class='buttonWrapper-QK2gi']")).click();
            }catch (Exception e){
                System.out.println("Unable to click on studio link "+e);
            }//end of studio link exceptions

            //set a time for new page
            Thread.sleep(2500);

            //Enter Zipcodes
            try {
                driver.findElement(By.xpath("//*[@id='location-search']")).sendKeys(zipCode.get(i));
            }catch (Exception e) {
                System.out.println("Unable to enter zipcodes " + e);
            }//end of zipcode exception

            // Click on search arrow
            try {
                driver.findElement(By.xpath("//*[@id='location-search-cta']")).submit();
            }catch (Exception e) {
                System.out.println("Unable to click on search arrow "+e);
            }//end of search arrow exception

            //set a time for new page
            Thread.sleep(4000);

            //click on specific links for the studios
            // storing WebElement as list for find elements
            try {
                List<WebElement> links = driver.findElements(By.xpath("//*[@class='container-3SE46']"));
                //set conditions
                if (i == 0) {
                    links.get(0).click();
                } else if (i == 1) {
                    links.get(1).click();
                } else if (i == 2) {
                    links.get(2).click();
                }//end of conditions
            }catch (Exception e){
                System.out.println("Unable to click on specific links "+e);
            }//end of links for studios exception

            Thread.sleep(2500);
            //capture the search result and store it as a variable
            try {
                String result = driver.findElement(By.xpath("//*[@class='address-2PZwW']")).getText();
                System.out.println("The address for zipcode " + zipCode.get(i) + " is " + result);
            }catch (Exception e) {
                System.out.println("Unable to print address "+e);
            }//end of exception

            //scroll to the workshop schedule table
            try{
                JavascriptExecutor jse = (JavascriptExecutor) driver;
                //scroll to the table by pixels
                jse.executeScript("scroll(0,900)");
            }catch (Exception e){
                System.out.println("Unable to scroll "+e);
            }//end of exception
            Thread.sleep(4000);

            //Capture workshop schedule
            try {
                String result = driver.findElement(By.xpath("//*[@class='scheduleContainerMobile-1RfmF']")).getText();
                System.out.println("The schedule for zipcode " + zipCode.get(i) + " is " + result);
            }catch (Exception e) {
                System.out.println("Unable to print workshop schedule "+e);
            } //end of exception

        }//end of for loop
    }//end of main method
}//end of java class




