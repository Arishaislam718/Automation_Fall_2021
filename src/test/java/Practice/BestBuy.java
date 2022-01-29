package Practice;

import Day9_010822.Reusable_Actions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BestBuy {
    //declare web driver
    WebDriver driver;

    @BeforeSuite
    public void setDriver(){
        driver= Reusable_Actions.setDriver();
        //navigate to Best Buy
        driver.navigate().to("https://www.bestbuy.com/");
    }//end of pre-condition

    @Test(priority = 1)
    public void SearchForAKeyword() {
        //verify the title says 'Best Buy | Official Online Store'
        String actualTitle = driver.getTitle();
        if (actualTitle.equals("Best Buy | Official Online Store")) {
            System.out.println("Title matches as 'Best Buy | Official Online Store'");
        } else {
            System.out.println("Title doesn't match. Actual title is " + actualTitle);
        }//end of condition

        //close the pop-up
        Reusable_Actions.clickMethod(driver,"//*[@class='c-close-icon c-modal-close-icon']","pop=up");

        //click on search field
        Reusable_Actions.clickMethod(driver,"//*[@class='search-input']","Search Field");

        //Write Hp Laptop
        Reusable_Actions.sendKeysMethod(driver,"//*[@class='search-input']","hp laptop","Laptop");

        //click on search field
        Reusable_Actions.clickMethod(driver,"//*[@class='header-search-button']","search-button");

        //add a Laptop to the cart
        Reusable_Actions.clickMethod(driver,"//*[@class='fulfillment-add-to-cart-button']","Add to Cart");


        //go to cart
        Reusable_Actions.clickMethod(driver,"//*[@class='c-button c-button-secondary c-button-sm c-button-block ']","Go to Cart");

        //Click on Check Out
        Reusable_Actions.clickMethod(driver,"//*[@class='btn btn-lg btn-block btn-primary']","Go to Cart");

        //Continue as Guest
        Reusable_Actions.clickMethod(driver,"//*[@class='c-button c-button-secondary c-button-lg cia-guest-content__continue guest']","Go to Cart");

        //enter email
        Reusable_Actions.sendKeysMethod(driver,"//*[@id='user.emailAddress']","arishaislam718@gmail.com","Go to Cart");

        //enter phone number
        Reusable_Actions.sendKeysMethod(driver,"//*[@id='user.phone']","6465957110","Go to Cart");

        //click on continue to payment
        Reusable_Actions.clickMethod(driver,"//*[@class='btn btn-lg btn-block btn-secondary']","Go to Cart");

    }//end of method


    }//end of java class
