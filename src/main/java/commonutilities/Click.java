package commonutilities;

import driverinitialization.Initialize_Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Click  implements Init {

    public void Webdriver_Click(By by, boolean wait_For_Page_To_Load) {
        WebDriver driver =Initialize_Driver.get_Driver_Instance();
        if (wait_For_Page_To_Load) { visible.Wait_For_Page_To_Load(); }
        (new WebDriverWait(driver, Constants.expicit_Wait_Time)).until(ExpectedConditions.presenceOfElementLocated(by));
        driver.findElement(by).click();
        (new WebDriverWait(driver, Constants.expicit_Wait_Time)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//body")));
        if (wait_For_Page_To_Load) { visible.Wait_For_Page_To_Load(); }
    }

}
