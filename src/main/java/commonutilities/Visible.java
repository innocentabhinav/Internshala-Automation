package commonutilities;

import driverinitialization.Initialize_Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class Visible extends Initialize_Driver implements Init{
    Logger log;
    private int pause_Time = 0;

    public  void Wait_For_Page_To_Load() {
        WebDriver driver =get_Driver_Instance();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            log.info("ztest");
            e.printStackTrace();
        }

        ExpectedCondition<Boolean> page_Load_Condition = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
            }
        };
        WebDriverWait wait = new WebDriverWait(driver, Constants.expicit_Wait_Time);
        wait.until(page_Load_Condition);
    }

    public  boolean Is_Selected(By by) {
        return Initialize_Driver.get_Driver_Instance().findElement(by).isSelected();
    }


    public void Pause(int seconds) {

        log.info("Pausing the Execution for " + seconds + " Seconds.");
        pause_Time = pause_Time + seconds;

        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public  void Scroll_View(By by) {
        WebDriver driver =Initialize_Driver.get_Driver_Instance();
        WebElement scroll = driver.findElement(by);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()", scroll);
    }

    public  void Scroll_IntoView_WebElement(WebElement ele) {
        WebDriver driver =get_Driver_Instance();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()", ele);
    }

    public  void Scroll_Views(By by) {
        WebDriver driver =get_Driver_Instance();
        WebElement scroll = driver.findElement(by);
        Actions actions = new Actions(driver);
        actions.moveToElement(scroll);
        actions.perform();
    }

    public  void Scroll_Views(WebElement scroll) {
        WebDriver driver =get_Driver_Instance();
        Actions actions = new Actions(driver);
        actions.moveToElement(scroll);
        actions.perform();
    }

    public  void Scroll_To_Element(By by) {
        WebDriver driver =get_Driver_Instance();
        WebElement element = driver.findElement(by);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(
                "window.scrollBy(" + element.getLocation().getX() + "," + (element.getLocation().getY() + 100) + ")",
                "");
    }
    public  void Scroll_To_Element(WebElement element) {
        WebDriver driver =get_Driver_Instance();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(
                "window.scrollBy(" + element.getLocation().getX() + "," + (element.getLocation().getY() + 100) + ")",
                "");
    }

    public  void Wait_Until_Visible(int time_To_Wait, By locator) {
        WebDriver driver =get_Driver_Instance();
        new WebDriverWait(driver, Duration.ofSeconds(time_To_Wait)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }

    public  void Wait_Until_Visible_Fluent(int time_To_Wait, int time_To_Poll, By locator) {
        WebDriver driver =get_Driver_Instance();
        new WebDriverWait(driver, Duration.ofSeconds(time_To_Wait), Duration.ofSeconds(time_To_Poll)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }

    public  void Wait_Until_Invisible(long time_To_Wait, By locator) {
        WebDriver driver =get_Driver_Instance();
        new WebDriverWait(driver, Duration.ofSeconds(time_To_Wait)).until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    public  void Wait_Until_Invisible_Fluent(int time_To_Wait, int time_To_Poll, By locator) {
        WebDriver driver =get_Driver_Instance();
        new WebDriverWait(driver, Duration.ofSeconds(time_To_Wait), Duration.ofSeconds(time_To_Poll)).until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    public  void Wait_Until_Frame_Is_Visible(int time_To_Wait, By locator) {
        WebDriver driver =get_Driver_Instance();
        new WebDriverWait(driver, Duration.ofSeconds(time_To_Wait)).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
    }

    public  Boolean Is_Displayed(By by) {
        WebDriver driver =get_Driver_Instance();
        Boolean is_displayed = false;
        try {
            is_displayed = driver.findElement(by).isDisplayed();
        } catch (Exception e) {
            log.info("Element not found");
        }
        return is_displayed;
    }

}
