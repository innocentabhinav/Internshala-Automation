package commonutilities;

import driverinitialization.Initialize_Driver;
import org.openqa.selenium.WebDriver;

public interface Init {
    Visible visible=new Visible();
    Click click=new Click();
    SendKeys sendkeys=new SendKeys();
    Text text=new Text();
    WebDriver driver= Initialize_Driver.get_Driver_Instance();

}
