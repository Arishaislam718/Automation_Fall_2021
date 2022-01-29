package ActionItem_6;

import ActionItem_5.Reusable_Actions;
import Reusable_Library.Reusable_Actions_Loggers;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Express_dress {
    WebDriver driver;
    ExtentReports reports;
    ExtentTest logger;

    @BeforeSuite
    public void SetTheDriver(){
        driver = Reusable_Actions_Loggers.setDriver();
        //set the path of the report once
        reports = new ExtentReports("src/main/java/HTML_Report/ExpressAutomation_Report.html",true);
    }//end of precondition

    @Test
    public void ExpressSearchDataDriven() throws BiffException, IOException, WriteException, InterruptedException {
        //Step 1: read the data from the Excel sheet you created
        Workbook readableFile = Workbook.getWorkbook(new File("src/main/resources/Express.xls"));
        //Step 2: locating the worksheet that you created for the workbook
        Sheet readableSheet = readableFile.getSheet(0);
        //will return the physical rows present on the sheet
        int rowCount = readableSheet.getRows();
        System.out.println("My row count is " + rowCount);

        //Step 3: create a writable file to mimic readable and to write back the results to this file
        WritableWorkbook writableFile = Workbook.createWorkbook(new File("src/main/resources/Express_Results.xls"), readableFile);
        WritableSheet writableSheet = writableFile.getSheet(0);
        //will return the physical rows present on the sheet
        int rowCount2 = writableSheet.getRows();
        System.out.println("My writable row count is " + rowCount2);

        //generate the for loop
        for(int i = 1; i < rowCount2;i++) {

            //store the row list as a variable
            String size = writableSheet.getCell(0, i).getContents();
            System.out.println("My values are " + size);
            String quantity = writableSheet.getCell(1, i).getContents();
            System.out.println("My values are " + quantity);
            String firstName = writableSheet.getCell(2, i).getContents();
            System.out.println("My values are " + firstName);
            String lastName = writableSheet.getCell(3, i).getContents();
            System.out.println("My values are " + lastName);
            String email = writableSheet.getCell(4, i).getContents();
            System.out.println("My values are " + email);
            String phoneNumber = writableSheet.getCell(5, i).getContents();
            System.out.println("My values are " + phoneNumber);
            String address = writableSheet.getCell(6, i).getContents();
            System.out.println("My values are " + address);
            String zipCode= writableSheet.getCell(7, i).getContents();
            System.out.println("My values are " + zipCode);
            String city = writableSheet.getCell(8, i).getContents();
            System.out.println("My values are " + city);
            String state = writableSheet.getCell(9, i).getContents();
            System.out.println("My values are " + state);
            String cardNumber = writableSheet.getCell(10, i).getContents();
            System.out.println("My values are " + cardNumber);
            String EXPMonth = writableSheet.getCell(11, i).getContents();
            System.out.println("My values are " + EXPMonth);
            String EXPYear = writableSheet.getCell(12, i).getContents();
            System.out.println("My values are " + EXPYear);
            String CVV = writableSheet.getCell(13, i).getContents();
            System.out.println("My values are " + CVV);

            logger = reports.startTest("Purchasing dresses on Express website");
            //navigate to usps
            logger.log(LogStatus.INFO,"Navigate to Express Home Page");
            driver.navigate().to("https://www.express.com/");
            //verify page title contains 'Men's and Women's Clothing'
            String actualTitle = driver.getTitle();
            if(actualTitle.contains("Men's and Women's Clothing")){
                System.out.println("Title contains 'Men's and Women's Clothing'");
            } else {
                System.out.println("Title doesn't match. Actual title is " + actualTitle);
            }//end of get title condition
            //hover on 'Women' tab
            Reusable_Actions_Loggers.mouseHover(driver,"//*[@href='/womens-clothing?W_HEADER_WOMENSCLOTHING']",logger,"Women");
            //Click on 'Dresses' link
            Reusable_Actions_Loggers.clickMethod(driver,"//*[@href='/womens-clothing/dresses/cat550007']",logger,"Dresses");
            //Wait Times
            Thread.sleep(3000);
            //Scroll by pixels
            Reusable_Actions_Loggers.scrollMethod(driver,"0","600",logger,"scroll","scroll");
            Reusable_Actions_Loggers.clickMethod(driver,"//*[@name='bluecoreCloseButton']",logger,"pop-up");
            //Click on second dress
            Reusable_Actions_Loggers.clickByIndex(driver,"//*[contains(@class,'-qIS3zH7eoemBZF9mo1K5')]",1,logger,"Second Dress");
            //Wait time
            Thread.sleep(3000);
            //pop-up--------------------------------
            Reusable_Actions_Loggers.clickPOPMethod(driver,"//*[@class='icon-close']",logger,"POP UP");
            //Click on specific size
            //Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='S']",logger,"Clicking on size");
            Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='"+size+"']",logger,"Size");
            Thread.sleep(3000);
            //Click on 'Add to Bag'
            Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='Add to Bag']",logger,"Add to Bag");
            //Click on 'View Bag' tab pop-up
            Reusable_Actions_Loggers.clickPOPMethod(driver,"//*[text()='View Bag']",logger,"View Bag");
            //Wait time
            Thread.sleep(3000);
            //Select a Quantity
            Reusable_Actions_Loggers.dropDownByText(driver,"//*[@id='qdd-0-quantity']",quantity,logger,"quantity");
            Thread.sleep(3000);
            //Click on CheckOut
            Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='Checkout']",logger,"Checkout");
            //Wait
            Thread.sleep(3000);
            //Click on Continue as Guest
            Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='Checkout as Guest']",logger,"Checkout as Guest ");
            //Wait Time
            Thread.sleep(3000);
            //Enter First Name
            Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='firstname']",firstName,logger,"FirstName");
            //Enter Last Name
            Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='lastname']",lastName,logger,"lastName");
            //Enter Email Address
            Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='email']",email,logger,"email");
            //Re-Enter Email Address
            Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='confirmEmail']",email,logger,"ConfirmEmail");
            //Enter phone number
            Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='phone']",phoneNumber,logger,"phoneNumber");
            //Click on Continue Button
            Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='Continue']",logger,"Continue");
            //Enter Address
            Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='shipping.line1']",address,logger,"address");
            //Enter Zipcode
            Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='shipping.postalCode']",zipCode,logger,"zipCode");
            //Enter City
            Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='shipping.city']",city,logger,"city");
            //Enter State
            // Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@class='rvndd--shipping.state--6']",state,logger,"state");
            Reusable_Actions_Loggers.dropDownByText(driver,"//*[@name='shipping.state']",state,logger,"state");
            Thread.sleep(3000);
            //Click on Continue1
            Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='Continue']",logger,"Continue");
            //Click on continue2
            Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='Continue']",logger,"Continue");
            //Card Number
            Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='creditCardNumber']",cardNumber,logger,"cardNumber");
            Reusable_Actions_Loggers.clickPOPMethod(driver,"//*[text()='NO, THANK YOU']",logger,"POP UP");
            //Enter EXP Month
            Reusable_Actions_Loggers.dropDownByText(driver,"//*[@name='expMonth']",EXPMonth,logger,"EXP Month");
            Thread.sleep(3000);
            //Enter EXP Year
            Reusable_Actions_Loggers.dropDownByText(driver,"//*[@name='expYear']",EXPYear,logger,"EXP Year");
            Thread.sleep(3000);
            //Enter CVV
            Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='cvv']",CVV,logger,"CVV");
            Thread.sleep(3000);
            //Click on Place Order
            Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='Place Order']",logger,"Place a order");

            //capture the result
            String result = Reusable_Actions.getTextMethod(driver,"//*[@class='_2paT8dZ2 _1gNCYBQ3']","Error");
            System.out.println("The error is "+result);

            //Step 5: storing the values to the writable excel sheet
            Label label = new Label(14,i,result);
            //I need to write back to the writable sheet
            writableSheet.addCell(label);
            //delete cookies
            driver.manage().deleteAllCookies();

        }//end of loop

        //Step 6: writing back to the writable file to see
        writableFile.write();
        writableFile.close();

        //end the logger
        reports.endTest(logger);
    }//end of test

    @AfterSuite
    public void endTest(){
        driver.quit();
        //write/log the information back to the html report
        reports.flush();
    }//end of after suite

}//end of java class
