package Express;

import Reusable_Library.Reusable_Actions_Loggers_POM;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Reusable_Library.Reusable_Actions_Loggers_POM.getScreenShot;

public class AddToBag extends Reusable_Annotations {
    ExtentTest logger;
    public AddToBag(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotations.logger;
    }//end of the constructor method

    //define all the WebElement we need for this page per use case
    @FindBy(xpath = "//*[text()='+size+']")
    WebElement SpecificSizes;
    @FindBy(xpath = "//*[@class ='Add to Bag']")
    WebElement AddToBag;
    @FindBy(xpath = "//*[text()='View Bag']")
    WebElement ViewBag;

    public void SpecificSizes(String size){
        //Reusable_Actions_Loggers_POM.sendKeysMethod(driver,SpecificSizes,userData,logger,"Specific Sizes");
        WebDriverWait wait = new WebDriverWait(driver,15);
        System.out.println("Clicking on element Size");
        logger.log(LogStatus.INFO,"Clicking on element size");
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='"+size+"']"))).click();
        }catch (Exception e){
            System.out.println("Unable to click on size "+e);
            logger.log(LogStatus.FAIL,"Unable to click on size. Error "+e);
            getScreenShot(driver,"size",logger);

        }
    }//End of specific sizes method

    //create a pom method to click on Add to Bag
    public void ClickOnAddToBag(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,AddToBag,logger,"Add to Bag");
    }//end of method

    //create a pom method to click on View Bag
    public void ClickOnViewBag(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,ViewBag,logger,"View Bag");
    }//end of method



}//end of Java Class
