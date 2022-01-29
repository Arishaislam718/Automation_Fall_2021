package Express;

import Reusable_Library.Reusable_Actions_Loggers_POM;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOut extends Reusable_Annotations {
    ExtentTest logger;
    public CheckOut(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotations.logger;
    }//end of the constructor method

    //define all the WebElement we need for this page per use case
    @FindBy(xpath = "//*[@id='qdd-0-quantity']")
    WebElement SelectQuantity;
    @FindBy(xpath = "//*[text()='Checkout']")
    WebElement CheckOut;
    @FindBy(xpath = "//*[text()='Checkout as Guest']")
    WebElement CheckOutAsGuest;

    //create a pom method to Select Quantity
    public void SelectQuantityOfDress(String userData){
        Reusable_Actions_Loggers_POM.dropDownByText(driver,SelectQuantity,userData,logger,"Add to Bag");
    }//end of method

    //create a pom method to click on CheckOut
    public void ClickOnCheckOut(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,CheckOut,logger,"CheckOut");
    }//end of method

    //create a pom method to click on Check out as Guest
    public void ClickOnCheckOutAsGuest(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,CheckOutAsGuest,logger,"Check out as Guest");
    }//end of method


}//end of java class
