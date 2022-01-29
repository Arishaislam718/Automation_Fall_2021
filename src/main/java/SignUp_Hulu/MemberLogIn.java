package SignUp_Hulu;

import Reusable_Library.Reusable_Actions_Loggers_POM;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MemberLogIn extends Reusable_Annotations {
    ExtentTest logger;
    public MemberLogIn(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotations.logger;
    }//end of the constructor method

    //define all the WebElement we need for this page per use case
    @FindBy(xpath = "//*[@id='email_id']")
    WebElement Email;
    @FindBy(xpath = "//*[@id='password_id']")
    WebElement Password;
    @FindBy(xpath = "//*[text()='LOG IN']")
    WebElement LogIn;

    public void EnterEmail(String userData){
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver,Email,userData,logger,"Email");
    }//end of method

    public void EnterPassword(String userData){
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver,Password,userData,logger,"Password");
    }//end of method

    public void ClickOnLogIn(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,LogIn,logger,"Log In");
    }//end of method





}//end of java class
