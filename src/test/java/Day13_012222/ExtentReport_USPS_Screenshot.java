package Day13_012222;

import Reusable_Library.Reusable_Actions_Loggers;
import Reusable_Library.Reusable_Annotations;
import org.testng.annotations.Test;

public class ExtentReport_USPS_Screenshot extends Reusable_Annotations {
    @Test()
    public void Usps_Invalid_Tracking_Number(){

        driver.navigate().to("https://www.usps.com");
        //hover to the quick tool tab
        Reusable_Actions_Loggers.mouseHover(driver,"//*[text()='Quick Tools']",logger,"Quick tools");
        //click on track a package
        Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='Track a Package']",logger,"Track a Package");
        //enter your tracking number
        Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@id='tracking-input']","1111111111",logger,"Track Field");
        //click on track button
        //purposely messed up the xpath to see the screenshot on HTML report
        Reusable_Actions_Loggers.clickMethod(driver,"//*[class='button tracking-btn']",logger,"Track Button");

    }//end of test
}
