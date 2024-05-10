package commonutilities;

import driverinitialization.Initialize_Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SendKeys extends Initialize_Driver implements Init{
    public  void Webdriver_Sendkeys_Enter(By by, String value){
        WebDriver driver=get_Driver_Instance();
        (new WebDriverWait(driver, Constants.expicit_Wait_Time)).until(ExpectedConditions.presenceOfElementLocated(by));
        driver.findElement(by).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
        driver.findElement(by).findElement(by).clear();
        driver.findElement(by).sendKeys(value);
        driver.findElement(by).sendKeys(Keys.ENTER);
    }
    public  void Webdriver_Sendkeys_Enter_Without_Clear(By by, String value){
        WebDriver driver=get_Driver_Instance();
        driver.findElement(by).sendKeys(value);
        driver.findElement(by).sendKeys(Keys.ENTER);
    }

    public void Webdriver_Sendkeys(By by, String value) {
        WebDriver driver=get_Driver_Instance();
        (new WebDriverWait(driver, Constants.expicit_Wait_Time)).until(ExpectedConditions.presenceOfElementLocated(by));
        (new WebDriverWait(driver, Constants.expicit_Wait_Time)).until(ExpectedConditions.visibilityOfElementLocated(by));
        select_All_Text(by);
        // visible.Pause(1);
        Backspace();
        driver.findElement(by).sendKeys(value);
    }

    public String select_All_Text(By by)
    {
        Initialize_Driver.get_Driver_Instance().findElement(by).sendKeys(Constants.control_Key + "a");
        return text.Webdriver_Get_Text(by);
    }

    public void Backspace() {
        Actions action = new Actions(Initialize_Driver.get_Driver_Instance());
        action.sendKeys(Keys.BACK_SPACE).perform();
    }

}
