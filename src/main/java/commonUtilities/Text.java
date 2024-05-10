package commonUtilities;

import driverInitialization.Initialize_Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Text extends Initialize_Driver implements Init{
    public String Webdriver_Get_Text(By by) {
        WebDriver driver=get_Driver_Instance();
        (new WebDriverWait(driver, Constants.expicit_Wait_Time)).until(ExpectedConditions.presenceOfElementLocated(by));
        String text = driver.findElement(by).getText().trim();
        return text;
    }

    public String Webdriver_Get_Text(WebElement ele){
//		(new WebDriverWait(driver, Constants.expicit_Wait_Time)).until(ExpectedConditions.presenceOfElementLocated());
        return ele.getText().trim();
    }

}
