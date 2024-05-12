package automationsourcecode;

import driverinitialization.Initialize_Driver;
import org.testng.annotations.Test;

public class Internshala_Controller extends Initialize_Driver{

    Internshala_Utils internshala_utils=new Internshala_Utils();

    @Test
    public void Login(){
        internshala_utils.Login_To_Internshala();
    }

    @Test
    public void Application_Section(){
        internshala_utils.Navigate_To_Application_Page();
    }





}
