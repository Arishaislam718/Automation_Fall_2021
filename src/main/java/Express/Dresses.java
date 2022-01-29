package Express;

import Reusable_Library.Reusable_Actions_Loggers_POM;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dresses extends Reusable_Annotations {

    ExtentTest logger;
        public Dresses(WebDriver driver){
            PageFactory.initElements(driver,this);
            this.logger = Reusable_Annotations.logger;
        }//end of the constructor method

        //define all the WebElement we need for this page per use case
        @FindBy(xpath = "//*[contains(@class,'-qIS3zH7eoemBZF9mo1K5')]")
        WebElement SecondDress;
         @FindBy(xpath = "//*[@name='bluecoreCloseButton']")
         WebElement PopUp;

        //create a pom method to click on second dress
        public void ClickOnSecondDress(){
        Reusable_Actions_Loggers_POM.clickByIndex(driver,SecondDress,1,logger,"Second Dress");
        }//end of method

        //create a pom method to click on Pop-up
        public void ClickOnPopUp(){
            Reusable_Actions_Loggers_POM.clickPOPMethod(driver,PopUp,logger,"Pop-Up");
        }//end of method

    }//end of java class
