package SignUp_Hulu;

import Reusable_Library.Reusable_Actions_Loggers_POM;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage extends Reusable_Annotations {
    ExtentTest logger;
    public UsersPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotations.logger;
    }//end of the constructor method

    //define all the WebElement we need for this page per use case
    @FindBy(xpath = "//*[text()='Triage2022']")
    WebElement VerifyUserName;

    public String captureUserName(){
        String result = Reusable_Actions_Loggers_POM.getTextMethod(driver,VerifyUserName,logger,"Users Name");
        System.out.println("The user name is "+result);
        return result;
    }//end of method

}//end of java class
