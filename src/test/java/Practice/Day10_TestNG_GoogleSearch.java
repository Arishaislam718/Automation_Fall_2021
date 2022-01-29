package Practice;

import ActionItem_5.Reusable_Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day10_TestNG_GoogleSearch {
    /*
   precondition - set the driver and navigate to google website
   test 1 - verify the google title and search for google keyword and hit submit
   test 2 - capture search result and only print out the search number
   post condition - quit your driver
 */
    //set the webdriver
    WebDriver driver;

    @BeforeSuite
    public void setDriver(){
        driver=Reusable_Actions.setDriver();
        //navigate to google
        driver.navigate().to("http://www.google.com");
    }//end of pre-condition

    @Test(priority = 1)
    public void SearchAKeyword(){
        //verify the title page
        String ActualTitle = driver.getTitle();
        if(ActualTitle.equals("Google")){
            System.out.println("Title matches "+ActualTitle);
        }else {
            System.out.println("Title doesn't match. Actual title is "+ActualTitle);
        }//end of condition

        //search a key word
        Reusable_Actions.sendKeysMethod(driver,"//*[@name='q']","cars","Cars");
        Day9_010822.Reusable_Actions.submitMethod(driver,"//*[@name='btnK']","Submit Button");

    }//end of test 1

    @Test(priority = 2)
    public void getResult(){
        //get search result
        String result = Reusable_Actions.getTextMethod(driver,"//*[@id='result-stats']","Result");
        String[] ArrayResult = result.split(" ");
        System.out.println("The search result is "+ArrayResult[1]);
    }//end of test 2

    @AfterSuite
    public void quitDriver(){
        driver.quit();
    }//end of method


}//end of java class
