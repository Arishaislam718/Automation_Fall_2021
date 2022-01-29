package SignUp_Hulu;

import Reusable_Library.Reusable_Actions_Loggers_POM;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmountDue extends Reusable_Annotations {
    ExtentTest logger;
    public AmountDue(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotations.logger;
    }//end of the constructor method

    //define all the WebElement we need for this page per use case
    @FindBy(xpath = "//*[@class='ledger__price']")
    WebElement SubscriptionsAmount;
    @FindBy(xpath = "//*[@class='ledger__summary']")
    WebElement AmountDueToday;

    public String captureSubscriptionsAmount(){
        String amount = Reusable_Actions_Loggers_POM.getTextMethod(driver,SubscriptionsAmount,logger,"Subscriptions Amount");
        System.out.println("My subscription amount is " + amount);
        return amount;
    }//end of method

    public String CaptureAmountDueToday(){
        String result = Reusable_Actions_Loggers_POM.getTextMethod(driver, AmountDueToday,logger,"Amount due Today");
        System.out.println("Amount due today is "+result);
        return result;
    }//end of method

}//end of java class
