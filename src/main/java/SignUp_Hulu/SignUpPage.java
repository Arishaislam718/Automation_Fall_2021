package SignUp_Hulu;

import Reusable_Library.Reusable_Actions_Loggers_POM;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends Reusable_Annotations {
    ExtentTest logger;
    public SignUpPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotations.logger;
    }//end of the constructor method

    //define all the WebElement we need for this page per use case
    @FindBy(xpath = "//*[@id='email']")
    WebElement Email;
    @FindBy(xpath = "//*[@id='password']")
    WebElement Password;
    @FindBy(xpath = "//*[@id='firstName']")
    WebElement Name;
    @FindBy(xpath = "//*[@class='selector-selected input__text placeholder']")
    WebElement BirthMonthTab;
    @FindBy(xpath = "//*[@id='birthdayMonth-menu']")
    WebElement BirthMonth;
    @FindBy(xpath = "//*[@class='selector-selected input__text placeholder']")
    WebElement BirthDateTab;
    @FindBy(xpath = "//*[@id='birthdayDay-menu']")
    WebElement BirthDate;
    @FindBy(xpath = "//*[@class='selector-selected input__text placeholder']")
    WebElement BirthYearTab;
    @FindBy(xpath = "//*[@id='birthdayYear-menu']")
    WebElement BirthYear;
    @FindBy(xpath = "//*[@class='selector-selected input__text placeholder']")
    WebElement GenderTab;
    @FindBy(xpath = "//*[@id='gender-menu']")
    WebElement Gender;
    @FindBy(xpath = "//*[contains(@class,'button button--continue')]")
    WebElement Continue;

    public void EnterEmail(String userData){
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver,Email,userData,logger,"Email");
    }//end of method

    public void EnterPassword(String userData){
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver,Password,userData,logger,"Password");
    }//end of method

    public void EnterName(String userData){
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver,Name,userData,logger,"Name");
    }//end of method

    public void ClickOnBirthMonthTab(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,BirthMonthTab,logger,"Birth Month Tab");
    }//end of method

    public void SelectBirthMonth(String userData){
        Reusable_Actions_Loggers_POM.SelectMethodHulu(driver,BirthMonth,userData,logger,"BirthMonth");
    }//end of Method

    public void ClickOnBirthDateTab(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,BirthDateTab,logger,"Birth date Tab");
    }//end of method

    public void SelectBirthDate(String userData){
        Reusable_Actions_Loggers_POM.SelectMethodHulu(driver,BirthDate,userData,logger,"Birth Date");
    }//end of Method

    public void ClickOnBirthYearTab(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,BirthYearTab,logger,"Birth Year Tab");
    }//end of method

    public void SelectBirthYear(String userData){
        Reusable_Actions_Loggers_POM.SelectMethodHulu(driver,BirthYear,userData,logger,"BirthYear");
    }//end of Method

    public void ClickOnGenderTab(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,GenderTab,logger,"Gender Tab");
    }//end of method

    public void SelectGender(String userData){
        Reusable_Actions_Loggers_POM.SelectMethodHulu(driver,Gender,userData,logger,"Gender");
    }//end of Method

    public void ClickOnContinue(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,Continue,logger,"Continue");
    }//end of method


}//end of java class
