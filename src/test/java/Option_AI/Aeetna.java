package Option_AI;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class Aeetna {
    public static void main(String[] args) throws InterruptedException {
        //set an array list for zipcodes
        ArrayList<String> zipCode = new ArrayList<>();
        zipCode.add("11218");
        zipCode.add("10462");
        zipCode.add("10467");

        //set an array list for milesRange
        ArrayList<Integer>milesRange = new ArrayList<>();
        milesRange.add(10);
        milesRange.add(20);
        milesRange.add(30);

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

        //set the for loop
        for(int i = 0;i< zipCode.size();i++) {

            //navigate to aetna homepage
            driver.navigate().to("https://www.aetna.com/");

            //set a wait time
            Thread.sleep(2000);

            //verify home page title is  Health Insurance Plans | Aetna
            String title = driver.getTitle();

            String actualTitle = driver.getTitle();
            if (actualTitle.equals("Health Insurance Plans | Aetna")) {
                System.out.println("Title matches");
            } else {
                System.out.println("Title doesn't match");
                System.out.println("Actual title is " + actualTitle);
            }//end of conditions

            //click on shop for a plan
            try {
                driver.findElement(By.xpath("//*[text()='Shop for a plan']")).click();
            } catch (Exception e) {
                System.out.println("Unable to click on shop for a plan" + e);
            }//end of exceptions

            //set a wait time
            Thread.sleep(2000);

            //click on Medicare link
            try {
                driver.findElement(By.xpath("//*[text()='Medicare']")).click();
            } catch (Exception e) {
                System.out.println("Unable to click on Medicare link " + e);
            }//end of exception

            //set a wait time
            Thread.sleep(2000);

            //Click on Find a Doctor
            try {
                //driver.findElements(By.xpath("//*[contains(@class,'megamenu__tertiary--item')]")).get(1).click();
                driver.findElement(By.xpath("//*[contains(text(),'Find a doctor')]")).click();

            } catch (Exception e) {
                System.out.println("Unable to click on find a doctor " + e);
            }//end of exception

            //set a wait time
            Thread.sleep(3000);

            //click on 2021 Medicare plans you purchase yourself
            try {
                driver.findElement(By.xpath("//*[text()='2021 Medicare plans you purchase yourself']")).click();
            } catch (Exception e) {
                System.out.println("Unable to click on 2021 Medicare plans you purchase yourself " + e);
            }//end of exception

            Thread.sleep(3000);

            //enter zipcode
            try {
                driver.findElement(By.xpath("//*[@id='medZip']")).sendKeys(zipCode.get(i));
            } catch (Exception e) {
                System.out.println("Unable to clear and add zipcodes" + e);
            }//end of exception

            //set a wait time
            Thread.sleep(3000);

            //click on zipcode
            try{
                driver.findElement(By.xpath("//*[@class='typeahead_grouping active']")).click();
            }catch (Exception e){
                System.out.println("Unable to click on zipcode"+e);
            }//end of exception

            //set a wait time
            Thread.sleep(3000);

            //slider
            WebElement milesSlider = driver.findElement(By.xpath("//*[@class='rz-pointer rz-pointer-min']"));
            for (i = 0; i < 25; i++) {
                milesSlider.sendKeys(Keys.ARROW_LEFT);
            }//end of loop for rest to 0

            int deiredMile = 30;
            for (i = 0; i < deiredMile; i++) {
                milesSlider.sendKeys(Keys.ARROW_RIGHT);
            }//end of loop for desiredmile

            // click on Skip plan selection
            try {
                driver.findElement(By.xpath("//*[text()='Skip plan selection*']")).click();
            }catch (Exception e){
                System.out.println("Unable to click on Skip Plan selection");
            }//end of exception

            //set a wait time
            Thread.sleep(3000);

            //click on Medical Doctors & Specialists
            try {
                driver.findElement(By.xpath("//*[contains(text(),'Medical Doctors & Specialists')]")).click();
            }catch(Exception e){
                System.out.println("Unable to click on medical doctor and specialists"+e);
            }//end of exception

            //set a wait time
            Thread.sleep(3000);

            //Doctors(Primary Care)
            try {
                driver.findElement(By.xpath("//*[contains(text(),'Doctors (Primary Care)')]")).click();
            }catch (Exception e){
                System.out.println("Unable to click on doctors"+e);
            }//end of exception

            Thread.sleep(3000);

            //click on All Primary care physicians
            try {
                driver.findElement(By.xpath("//*[contains(text(),'All Primary Care Physicians')]")).click();
            }catch (Exception e){
                System.out.println("Unable to click on all primary care physicians" + e);
            }//end of exception

            //set a timer
            Thread.sleep(3000);

            //print out the first result for doctor's name and clinic address
            String result = driver.findElement(By.xpath("//*[contains(text(),'Live Well Medical Care PC')]")).getText();
            System.out.println("The doctor name is " + result);

            Thread.sleep(3000);

        }//end of for loop
    }//end of main method
}//end of java class


