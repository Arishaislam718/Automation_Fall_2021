package Practice;

import Day9_010822.Reusable_Actions;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class GoogleSearch_DataDriven {
    WebDriver driver;
    @BeforeSuite
    public void setDriver(){

        driver = Reusable_Actions.setDriver();
    }//end of before suit

    @Test
    public void GoogleSearchDataDrive() throws BiffException, IOException, WriteException {
        //Step 1: Read the data from the Excel sheet you created
        Workbook readableFile = Workbook.getWorkbook(new File("src/main/resources/Hobbies_Search.xls"));
        //Step 2: Locating the worksheet that you created for the workbook
        Sheet readableSheet = readableFile.getSheet(0);
        //return the physical rows present on the sheet
        int rowCount = readableSheet.getRows();
        System.out.print("My row count is "+rowCount);
        //Step 3: Create a writable file to mimic readable but you can also write back the results to this file
        WritableWorkbook writableFile = Workbook.createWorkbook(new File("src/main/resources/Hobbies_Search_Result.xls"),readableFile);
        WritableSheet writableSheet = writableFile.getSheet(0);
        //will return the physical rows present on the sheet
        int rowCount2 = writableSheet.getRows();
        System.out.println("My writable row count is "+rowCount2);

      //generate the for loop
      for(int i=1;i<rowCount2;i++){
          //Step 4: Accessing the values from the column and rows and stored as a variable on your code
          //store the countries list as a variable
          String hobbies = writableSheet.getCell(0,i).getContents();
          System.out.print("My values are "+hobbies);

          //navigate to google
          driver.navigate().to("https://www.google.com");
          //Enter hobbies on my google search field
          Reusable_Actions.sendKeysMethod(driver,"//*[@name='q']",hobbies, "Search Field");
          //Submit to google search button
          Reusable_Actions.submitMethod(driver,"//*[@name='btnK']","Google Search Button");

          //capture the result
          String result = Reusable_Actions.getTextMethod(driver,"//*[@id='result-stats']","Search Result");
          String[] arrayResults = result.split(" ");

          //Step 5: Storing the values to the writable excel sheet
          Label label = new Label(1,i,arrayResults[1]);
          //I need to write back to the writable sheet
          writableSheet.addCell(label);
      }//end of loop
            //Step 6: writing back to the writable file to see
        writableFile.write();
      writableFile.close();

    }//end of test


}//end of java class
