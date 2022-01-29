package SignUp_Hulu;

import Reusable_Library.Reusable_Actions_Loggers_POM;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HuluHomePage extends Reusable_Annotations {
    ExtentTest logger;
    public HuluHomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotations.logger;
    }//end of the constructor method

    //define all the WebElement we need for this page per use case
    @FindBy(xpath = "//*[text()='SELECT']")
    WebElement Trial;
    @FindBy(xpath = "//*[text()='Log In']")
    WebElement LogIn;

    //create a pom method to Click on 30 days trial
    public void ClickOn30DaysTrial(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,Trial,logger,"30 Days Trial");
    }//end of method

    //create a pom method to click on Log In
    public void ClickOnLogIn(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,LogIn,logger,"Log In");
    }//End of Method

}//end of java class
