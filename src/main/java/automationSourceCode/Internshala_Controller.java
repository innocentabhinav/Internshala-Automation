package automationSourceCode;

import commonUtilities.Init;
import driverInitialization.Initialize_Driver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static automationSourceCode.Internshala_Locators.*;

public class Internshala_Controller extends Initialize_Driver{

    Internshala_Utils internshala_utils=new Internshala_Utils();

    @Test
    public void Login(){
        internshala_utils.Login_To_Internshala();
    }



}
