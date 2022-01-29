package Express;

import Reusable_Library.Reusable_Annotations;
import USPS_Package_Object.Homepage;
import USPS_Package_Object.SendMailAndPackages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseClass extends Reusable_Annotations {
    public BaseClass(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }//end of constructor class

    public static ExpressHomepage expressHomepage(){
        ExpressHomepage expressHomepage = new ExpressHomepage(driver);
        return expressHomepage;
    }//end of method

    //create static reference for Dresses Page
    public static Dresses dresses() {
        Dresses dresses = new Dresses(driver);
        return dresses;
    }//end of method


    //create static reference for Add to Bag page
    public static AddToBag addToBag() {
        AddToBag addToBag = new AddToBag(driver);
        return addToBag;
    }//end of method

    //create static reference for check out page
    public static CheckOut checkOut() {
        CheckOut checkOut = new CheckOut(driver);
        return checkOut;
    }//end of method

    //create static reference for Shipping Information
    public static ShippingInfo shippingInfo() {
        ShippingInfo shippingInfo = new ShippingInfo(driver);
        return shippingInfo;
    }//end of method

}//end of Java Class
