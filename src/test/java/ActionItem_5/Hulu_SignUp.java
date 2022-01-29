package ActionItem_5;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class Hulu_SignUp {
    //declare the Web Driver
    WebDriver driver;

    @BeforeSuite
    public void setDriver(){
        driver= Reusable_Actions.setDriver();
    }//end of pre-condition

    @Test(priority = 1)
    public void HuluSignupLoop() {
        ArrayList<String> email = new ArrayList<>();
        email.add("QACLAS6S778869995550000@gmail.com");
        email.add("ActionItem667477995550000@gmail.com");

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
        for (int i=0;i< name.size();i++){
            //navigate to Hulu
            driver.navigate().to("http://www.hulu.com");
            //verify the title contains 'Stream TV and Movies'
            String actualTitle = driver.getTitle();
            if(actualTitle.contains("Stream TV and Movies")){
                System.out.println("Title contains 'Stream TV and Movies'");
            } else {
                System.out.println("Title doesn't match. Actual title is " + actualTitle);
            }//end of get title condition


            //Scroll to select
            Reusable_Actions.scrollMethod(driver,"0","950","scroll");

            //Click on select for 30 day free trial
            Reusable_Actions.clickMethod(driver,"//*[text()='SELECT']","Select");

            //Enter email
            Reusable_Actions.sendKeysMethod(driver,"//*[@id='email']",email.get(i),"Email");

            //Enter Password
            Reusable_Actions.sendKeysMethod(driver,"//*[@id='password']",password.get(i),"Password");

            //Enter Name
            Reusable_Actions.sendKeysMethod(driver,"//*[@id='firstName']",name.get(i),"Name");

            //Select BirthMonth
            //click on Month Tab
            Reusable_Actions.clickMethod(driver,"//*[@class='selector-selected input__text placeholder']","BirthMonth");
            //select the desired Month
            Reusable_Actions.SelectMethod(driver,"//*[@id='birthdayMonth-menu']",birthMonth.get(i),"BirthMonth");

            //Select BirthDate
            //click on Day Tab
            Reusable_Actions.clickMethod(driver,"//*[@class='selector-selected input__text placeholder']","BirthDate");
            //Click the desired Date
            Reusable_Actions.SelectMethod(driver,"//*[@id='birthdayDay-menu']",birthDay.get(i),"BirthDate");

            //Select BirthYear
            //click on Year Tab
            Reusable_Actions.clickMethod(driver,"//*[@class='selector-selected input__text placeholder']","BirthYear");
            //Select the desired Year
            Reusable_Actions.SelectMethod(driver,"//*[@id='birthdayYear-menu']",birthYear.get(i),"BirthYear");

            //Select Gender
            //click on Gender Tab
            Reusable_Actions.clickMethod(driver,"//*[@class='selector-selected input__text placeholder']","Gender");
            //Click the desired Gender
            Reusable_Actions.SelectMethod(driver,"//*[@id='gender-menu']",gender.get(i),"Gender");

            //Click on Continue Button
            Reusable_Actions.clickMethod(driver,"//*[contains(@class,'button button--continue')]","Continue");

            //Capture subscription amount & store it in a variable and print the amount
            String resultValue = Reusable_Actions.getTextMethod(driver,"//*[@class='ledger__price']","SubscriptionAmount");
            String[] arrayResult = resultValue.split("/mo");
            System.out.println("My subscription amount is " + arrayResult[0]);

            String result = Reusable_Actions.getTextMethod(driver,"//*[@class='ledger__summary']","Amount");
            System.out.println(result);

            //To delete previous data
            driver.manage().deleteAllCookies();

        }//end of for loop
    }//end of test

    @Test(dependsOnMethods="HuluSignupLoop")
    public void LogIn(){
        //navigate to Hulu
        driver.navigate().to("http://www.hulu.com");
        //Click on Log in
        Reusable_Actions.clickMethod(driver,"//*[text()='Log In']","Log In");
        //Enter email
        Reusable_Actions.sendKeysMethod(driver,"//*[@id='email_id']","QACLAS6S778869995550000@gmail.com","Email");
        //Enter Password
        Reusable_Actions.sendKeysMethod(driver,"//*[@id='password_id']","Triage2022","Password");
        //Click on Log in
        Reusable_Actions.clickMethod(driver,"//*[text()='LOG IN']","Log In");
        //Verify UserName & print
        String result = Reusable_Actions.getTextMethod(driver,"//*[text()='Arisha Islam']","UserName");
        System.out.println("The User name is "+result);

    }//end of test 2

    @AfterSuite
    public void endSession(){
        driver.quit();
    }


}//end of java class

