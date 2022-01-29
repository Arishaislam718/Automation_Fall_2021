package Practice;

import Day9_010822.Reusable_Actions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class Day19_TestNGLoop {

    WebDriver driver;

    @BeforeSuite
    public void setDriver(){
        driver= Reusable_Actions.setDriver();
    }//end of pre condition

    @Test(priority = 1)
        public void SearchLoop(){
        ArrayList<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Camry");

        //set the loop
        for(int i = 0; i<cars.size();i++) {

            //navigate to google
            driver.navigate().to("http://www.google.com");
            //search the cars on the search field
            Reusable_Actions.sendKeysMethod(driver, "//*[@name='q']", cars.get(i), "cars");
            //click on submit
            Reusable_Actions.submitMethod(driver,"//*[@name='btnK']","Search Button");


        }//end of loop
    }//end of test one
    @AfterSuite
    public void quitDriver(){
        driver.quit();

    }




}//end of java class

