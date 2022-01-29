package Practice;

import ActionItem_5.Reusable_Actions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class best_buy_kibria {
    //Set the driver
    WebDriver driver;

    @BeforeSuite
    public void SetTheDriver() {
        driver = Reusable_Actions.setDriver();
        //Navigate to best buy
        driver.navigate().to("https://WWW.bestbuy.com");
    }//End of pre-condition

    @Test(priority = 1)
    public void BestBuy() {
        //Verify Best Buy title
        String actualTitle = driver.getTitle();
        if (actualTitle.contains("Best Buy | Official Online Store")) {
            System.out.println("Title contains 'Best Buy | Official Online Store'");
        } else {
            System.out.println("Title doesn't match. Actual title is " + actualTitle);
        }//End of else

        //Close the pop-up  class="c-close-icon-svg"
        Reusable_Actions.clickMethod(driver, "//*[@class='c-close-icon c-modal-close-icon']", "Cancel");

        //Click on search field
        Reusable_Actions.clickMethod(driver, "//*[@class='search-input']", "Search");
        //Enter Laptops
        Reusable_Actions.sendKeysMethod(driver, "//*[@class='search-input']", "Macbook", "Mac Book");
        Reusable_Actions.clickMethod(driver, "//*[@class='header-search-button']", "Search");
        //click on add to cart MacBook Air 13.3" Laptop - Apple M1 chip - 8GB Memory - 256GB SSD (Latest Model) - Space Gray
        Reusable_Actions.clickMethod(driver, "//*[text()='MacBook Air 13.3\" Laptop - Apple M1 chip - 8GB Memory - 256GB SSD (Latest Model) - Space Gray']", "Click Macbook");
        //Scroll to Add to cart
        Reusable_Actions.scrollMethod(driver, "0", "1000", "scroll");
        //Add to cart Add to Cart
       Reusable_Actions.clickMethod(driver, "//*[text()='Add to Cart']", "Add to Cart");
        Reusable_Actions.clickMethod(driver,"//*[@class='c-button-link continue-shopping']","continue shopping");

    }//end of test 1

    @Test(priority = 2)
    public void Windows(){
        //Click on search field
        Reusable_Actions.clickMethod(driver, "//*[@class='search-input']", "Search");
        //Enter Laptops
        Reusable_Actions.sendKeysMethod(driver, "//*[@class='search-input']", "Macbook", "Mac Book");
        Reusable_Actions.clickMethod(driver, "//*[@class='header-search-button']", "Search");
        //click on add to cart MacBook Air 13.3" Laptop - Apple M1 chip - 8GB Memory - 256GB SSD (Latest Model) - Space Gray
        Reusable_Actions.clickMethod(driver, "//*[text()='MacBook Air 13.3\" Laptop - Apple M1 chip - 8GB Memory - 256GB SSD (Latest Model) - Space Gray']", "Click Macbook");
        //Scroll to Add to cart
        Reusable_Actions.scrollMethod(driver, "0", "1000", "scroll");
        //Add to cart Add to Cart
        Reusable_Actions.clickMethod(driver, "//*[text()='Add to Cart']", "Add to Cart");
        //Go to cart
        Reusable_Actions.clickMethod(driver,"//*[text()='Go to Cart']","Go to Cart");
        //Go to check out
        Reusable_Actions.clickMethod(driver,"//*[text()='Checkout']","Check Out");
        //Click on continue as guest
        Reusable_Actions.clickMethod(driver,"//*[text()='Continue as Guest']","Continue as Guest");
        //Fill out required information
        Reusable_Actions.clickMethod(driver,"//*[@name='firstName']","firstname");
        Reusable_Actions.sendKeysMethod(driver,"//*[@name='firstName']","Mohammad","First");
        Reusable_Actions.clickMethod(driver,"//*[@name='lastName']","lastname");
        Reusable_Actions.sendKeysMethod(driver,"//*[@name='lastName']","Kibria","last");
        //class="tb-input  autocomplete__input"
        Reusable_Actions.clickMethod(driver,"//*[@class='tb-input  autocomplete__input']","Address");
        Reusable_Actions.sendKeysMethod(driver,"//*[@class='tb-input  autocomplete__input']","3560 Rochambeau ave,Bronx NY","Address");


    }//end of test 2
}
