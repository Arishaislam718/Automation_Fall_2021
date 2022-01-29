package Express;

import Reusable_Library.Reusable_Actions_Loggers_POM;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import freemarker.core.ReturnInstruction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Reusable_Library.Reusable_Actions_Loggers_POM.getScreenShot;

public class ShippingInfo extends Reusable_Annotations {
    ExtentTest logger;
    public ShippingInfo(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotations.logger;
    }//end of the constructor method

    //define all the WebElement we need for this page per use case
    @FindBy(xpath = "//*[@name='firstname']")
    WebElement FirstName;
    @FindBy(xpath = "//*[@name='lastname']")
    WebElement LastName;
    @FindBy(xpath = "//*[@name='email']")
    WebElement Email;
    @FindBy(xpath = "//*[@name='confirmEmail']")
    WebElement ConfirmEmail;
    @FindBy(xpath = "//*[@name='phone']")
    WebElement PhoneNumber;
    @FindBy(xpath = "//*[text()='Continue']")
    WebElement Continue;
    @FindBy(xpath = "//*[@name='shipping.line1']")
    WebElement Address;
    @FindBy(xpath = "//*[@name='shipping.postalCode']")
    WebElement ZipCode;
    @FindBy(xpath = "//*[@name='shipping.city']")
    WebElement City;
    @FindBy(xpath = "//*[@name='shipping.state']")
    WebElement State;
    @FindBy(xpath = "//*[text()='Continue']")
    WebElement Continue1;
    @FindBy(xpath = "//*[text()='Continue']")
    WebElement Continue2;
    @FindBy(xpath = "//*[@name='creditCardNumber']")
    WebElement CardNumber;
    @FindBy(xpath = "//*[text()='NO, THANK YOU']")
    WebElement PopUP;
    @FindBy(xpath = "//*[@name='expMonth']")
    WebElement ExpMonth;
    @FindBy(xpath = "//*[@name='expYear']")
    WebElement EXPYear;
    @FindBy(xpath = "//*[@name='cvv']")
    WebElement CVV;
    @FindBy(xpath = "//*[text()='Place Order']")
    WebElement PlaceOrder;
    @FindBy(xpath = "//*[@class='_2paT8dZ2 _1gNCYBQ3']")
    WebElement Error;


    public void FirstName(String userData){
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver,FirstName,userData,logger,"firstName");
    }//end of method

    public void LastName(String userData){
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver,LastName,userData,logger,"LastName");
    }//end of method

    public void Email(String userData){
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver,Email,userData,logger,"Email");
    }//end of method

    public void ConfirmEmail(String userData){
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver,ConfirmEmail,userData,logger,"Confirm Email");
    }//end of method

    public void phoneNumber(String userData){
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver,PhoneNumber,userData,logger,"Phone Number");
    }//end of method

    public void ClickOnContinue(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,Continue,logger,"Continue");
    }//end of method

    public void Address(String userData){
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver,Address,userData,logger,"Address");
    }//end of method

    public void ZipCode(String userData){
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver,ZipCode,userData,logger,"Zipcode");
    }//end of method

    public void City(String userData){
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver,City,userData,logger,"City");
    }//end of method

    public void State(String userData){
        Reusable_Actions_Loggers_POM.dropDownByText(driver,State,userData,logger,"State");
    }//end of method

    public void ClickOnContinue1(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,Continue1,logger,"Continue");
    }//end of method

    public void ClickOnContinue2(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,Continue2,logger,"Continue");
    }//end of method

    public void CardNumber(String userData){
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver,CardNumber,userData,logger,"CardNumber");
    }//end of method

    public void PopUp(){
        Reusable_Actions_Loggers_POM.clickPOPMethod(driver,PopUP,logger,"PopUp");
    }//end of method

    public void EXPMonth(String userData){
        Reusable_Actions_Loggers_POM.dropDownByText(driver,ExpMonth,userData,logger,"EXP Month");
    }//end of method

    public void EXPYear(String userData){
        Reusable_Actions_Loggers_POM.dropDownByText(driver,EXPYear,userData,logger,"EXPYear");
    }//end of method

    public void CVV(String userData){
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver,CVV,userData,logger,"CVV");
    }//end of method

    public void ClickOnPlaceOrder(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,PlaceOrder,logger,"Place order");
    }//end of method

    public String captureErrMsg(){
    String result = Reusable_Actions_Loggers_POM.getTextMethod(driver,Error,logger,"Error Message");
    return result;
    }//end of method




}//end of Java class
