package Practice;

import Day9_010822.Reusable_Actions;
import Reusable_Library.Reusable_Actions_Loggers;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day12_List_WebElement {
    WebDriver driver;
    @BeforeSuite
    public void setDriver(){
        driver = Reusable_Actions.setDriver();
    }//end of pre-condition

    @Test
    public void List_WebElement(){
        //navigate to usps
        driver.navigate().to("https://www.usps.com");
        //
    }//end of test
}//end of java class
