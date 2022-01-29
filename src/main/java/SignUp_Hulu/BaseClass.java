package SignUp_Hulu;

import Express.ExpressHomepage;
import Reusable_Library.Reusable_Annotations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseClass extends Reusable_Annotations {
    public BaseClass(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }//end of constructor class

    public static HuluHomePage huluHomePage(){
        HuluHomePage huluHomePage = new HuluHomePage(driver);
        return huluHomePage;
    }//end of method

    public static SignUpPage signUpPage(){
        SignUpPage signUpPage = new SignUpPage(driver);
        return signUpPage;
    }//end of method

    public static MemberLogIn memberLogIn(){
        MemberLogIn memberLogIn = new MemberLogIn(driver);
        return memberLogIn;
    }//end of method


    public static UsersPage usersPage(){
        UsersPage usersPage = new UsersPage(driver);
        return  usersPage;
    }//end of method

    public static AmountDue amountDue(){
        AmountDue amountDue = new AmountDue(driver);
        return amountDue;
    }//end of method



}//end of java class
