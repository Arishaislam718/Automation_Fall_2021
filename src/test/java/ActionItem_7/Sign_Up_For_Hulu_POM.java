package ActionItem_7;

import ActionItem_5.Reusable_Actions;
import Reusable_Library.Reusable_Annotations;
import SignUp_Hulu.BaseClass;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class Sign_Up_For_Hulu_POM extends Reusable_Annotations {
    @Test(priority = 1)
    public void HuluSignupLoop() {
        ArrayList<String> email = new ArrayList<>();
        email.add("321Santos66Andres6666768999809@gmail.com");
        email.add("OwonkoUlyima669878609@gmail.com");

        ArrayList<String> password = new ArrayList<>();
        password.add("Triage2022");
        password.add("6figures2022");

        ArrayList<String> name = new ArrayList<>();
        name.add("Arisha Islam");
        name.add("Islam Arisha");

        ArrayList<String> birthMonth = new ArrayList<>();
        birthMonth.add("January");
        birthMonth.add("April");

        ArrayList<String> birthDay = new ArrayList<>();
        birthDay.add("1");
        birthDay.add("8");

        ArrayList<String> birthYear = new ArrayList<>();
        birthYear.add("1990");
        birthYear.add("1999");

        ArrayList<String> gender = new ArrayList<>();
        gender.add("Female");
        gender.add("Male");

        //set the loop
        for (int i = 0; i < email.size(); i++) {
            //navigate to Hulu
            driver.navigate().to("http://www.hulu.com");
            //verify the title contains 'Stream TV and Movies'
            String actualTitle = driver.getTitle();
            if (actualTitle.contains("Stream TV and Movies")) {
                System.out.println("Title contains 'Stream TV and Movies'");
            } else {
                System.out.println("Title doesn't match. Actual title is " + actualTitle);
            }//end of get title condition
            //Scroll to select
            Reusable_Actions.scrollMethod(driver, "0", "950", "scroll");
            //Click on select for 30 day free trial
            BaseClass.huluHomePage().ClickOn30DaysTrial();
            //Enter email
            BaseClass.signUpPage().EnterEmail(email.get(i));
            //Enter password
            BaseClass.signUpPage().EnterPassword(password.get(i));
            //Enter Name
            BaseClass.signUpPage().EnterName(password.get(i));
            //click on Month Tab
            BaseClass.signUpPage().ClickOnBirthMonthTab();
            //Select Birth Month
            BaseClass.signUpPage().SelectBirthMonth(birthMonth.get(i));
            //Click on Date Tab
            BaseClass.signUpPage().ClickOnBirthDateTab();
            //Select Birth Date
            BaseClass.signUpPage().SelectBirthDate(birthDay.get(i));
            //Click on Year tab
            BaseClass.signUpPage().ClickOnBirthYearTab();
            //Select Birth Year
            BaseClass.signUpPage().SelectBirthYear(birthYear.get(i));
            //Click on Gender Tab
            BaseClass.signUpPage().ClickOnGenderTab();
            //Click on desired gender
            BaseClass.signUpPage().SelectGender(gender.get(i));
            //Click on Continue
            BaseClass.signUpPage().ClickOnContinue();
            //Capture subscription amount
            String amount = BaseClass.amountDue().captureSubscriptionsAmount();
            //capture amount due today
            String result = BaseClass.amountDue().CaptureAmountDueToday();

            //To delete previous data
            driver.manage().deleteAllCookies();

        }//end of loop
    }//end of test 1

    @Test(dependsOnMethods="HuluSignupLoop")
    public void LogIn() {
        //navigate to Hulu
        driver.navigate().to("http://www.hulu.com");
        //Click on Log in
        BaseClass.huluHomePage().ClickOnLogIn();
        //Enter email
        BaseClass.memberLogIn().EnterEmail("321Santos66Andres6666768999809@gmail.com");
        //Enter Password
        BaseClass.memberLogIn().EnterPassword("Triage2022");
        //Click on Log in
        BaseClass.memberLogIn().ClickOnLogIn();
        //Verify UserName & print
        String result = BaseClass.usersPage().captureUserName();

    }//end of test 2
}//end of java class
