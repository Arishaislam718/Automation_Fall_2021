package Express;

import Reusable_Library.Reusable_Actions_Loggers_POM;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExpressHomepage extends Reusable_Annotations {
    ExtentTest logger;
    public ExpressHomepage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotations.logger;
    }//end of the constructor method

    //define all the WebElement we need for this page per use case
    @FindBy(xpath = "//*[@href='/womens-clothing?W_HEADER_WOMENSCLOTHING']")
    WebElement WomenTab;
    @FindBy(xpath = "//*[@href='/womens-clothing/dresses/cat550007']")
    WebElement DressLink;

    //create a pom method to hover to women tab
    public void HoverOnWomenTab(){
        Reusable_Actions_Loggers_POM.mouseHover(driver,WomenTab,logger,"Women Tab");
    }//end of method

    //create a pom method to click on Second Dress
    public void ClickOnDressLink(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,DressLink,logger,"WomenTab");
    }//End of Method

}//end of java class
