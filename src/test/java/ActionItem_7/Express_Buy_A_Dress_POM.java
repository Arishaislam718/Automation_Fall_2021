package ActionItem_7;

import Express.BaseClass;
import Reusable_Library.Reusable_Actions_Loggers;
import Reusable_Library.Reusable_Actions_Loggers_POM;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.LogStatus;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Express_Buy_A_Dress_POM extends Reusable_Annotations {
    @Test
    public void Shop_For_A_Dress() throws BiffException, IOException, WriteException, InterruptedException {
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
            String zipCode = writableSheet.getCell(7, i).getContents();
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

            //navigate to usps
            logger.log(LogStatus.INFO, "Navigate to Express Home Page");
            driver.navigate().to("https://www.express.com/");
            //verify page title contains 'Men's and Women's Clothing'
            String actualTitle = driver.getTitle();
            if (actualTitle.contains("Men's and Women's Clothing")) {
                System.out.println("Title contains 'Men's and Women's Clothing'");
            } else {
                System.out.println("Title doesn't match. Actual title is " + actualTitle);
            }//end of get title condition

            //hover on 'Women' tab
            BaseClass.expressHomepage().HoverOnWomenTab();
            //Click on 'Dresses' link
            BaseClass.expressHomepage().ClickOnDressLink();
            //Scroll by pixels
            Reusable_Actions_Loggers.scrollMethod(driver,"0","400",logger,"scroll","scroll");
            //click on Pop up
            BaseClass.dresses().ClickOnPopUp();
            //Reusable_Actions_Loggers.clickPOPMethod(driver,"//*[@name='bluecoreCloseButton']",logger,"POP UP");

            //Click on Second Dress
            //BaseClass.dresses().ClickOnSecondDress();
            Reusable_Actions_Loggers.clickByIndex(driver,"//*[contains(@class,'-qIS3zH7eoemBZF9mo1K5')]",1,logger,"Second Dress");

            Thread.sleep(3000);
            //Pop Up

            //Click on Specific size
            //BaseClass.addToBag().SpecificSizes(size);
            Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='"+size+"']",logger,"Size");

            //Click on 'Add to Bag'
            //BaseClass.addToBag().ClickOnAddToBag();
           Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='Add to Bag']",logger,"Add to Bag");

            //Click on 'View Bag' tab pop-up
            BaseClass.addToBag().ClickOnViewBag();
            //Select a Quantity
            BaseClass.checkOut().SelectQuantityOfDress(quantity);
            //Click on CheckOut
            BaseClass.checkOut().ClickOnCheckOut();
            //Click on Continue as Guest
            BaseClass.checkOut().ClickOnCheckOutAsGuest();
            //Enter First Name
            BaseClass.shippingInfo().FirstName(firstName);
            //Enter Last Name
            BaseClass.shippingInfo().LastName(lastName);
            //Enter Email Address
            BaseClass.shippingInfo().Email(email);
            //Re-Enter Email Address
            BaseClass.shippingInfo().ConfirmEmail(email);
            //Enter phone number
            BaseClass.shippingInfo().phoneNumber(phoneNumber);
            //Click on Continue Button
            BaseClass.shippingInfo().ClickOnContinue();
            //Enter Address
            BaseClass.shippingInfo().Address(address);
            //Enter Zipcode
            BaseClass.shippingInfo().ZipCode(zipCode);
            //Enter City
            BaseClass.shippingInfo().City(city);
            //Enter State
            BaseClass.shippingInfo().State(state);
            //Click on Continue1
            BaseClass.shippingInfo().ClickOnContinue1();
            //Click on Continue2
            BaseClass.shippingInfo().ClickOnContinue2();
            //Card Number
            BaseClass.shippingInfo().CardNumber(cardNumber);
            Thread.sleep(4000);
            //Click on Pop up
            BaseClass.shippingInfo().PopUp();
            //Enter EXP Month
            BaseClass.shippingInfo().EXPMonth(EXPMonth);
            //Enter EXP Month
            BaseClass.shippingInfo().EXPYear(EXPYear);
            //Enter CVV
            BaseClass.shippingInfo().CVV(CVV);
            //Click on Place Order
            BaseClass.shippingInfo().ClickOnPlaceOrder();
            //Capture the result
           String result =  BaseClass.shippingInfo().captureErrMsg();
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

    }//end of test

}//end of java class

