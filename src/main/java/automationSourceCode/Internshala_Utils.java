package automationSourceCode;

import commonUtilities.Init;
import org.openqa.selenium.By;

import java.util.logging.Logger;

import static automationSourceCode.Internshala_Locators.*;
import static commonUtilities.Constants.*;

public class Internshala_Utils implements Init {


    public void Login_To_Internshala(){
        click.Webdriver_Click(By.xpath(input_Credentials_Xpath.replace("$Credential_Id","email")),true);
        sendkeys.Webdriver_Sendkeys(By.xpath(input_Credentials_Xpath.replace("$Credential_Id","email")),username);
        click.Webdriver_Click(By.xpath(input_Credentials_Xpath.replace("$Credential_Id","password")),true);
        sendkeys.Webdriver_Sendkeys(By.xpath(input_Credentials_Xpath.replace("$Credential_Id","password")),password);
        click.Webdriver_Click(login_Button,true);
        visible.Wait_For_Page_To_Load();
        visible.Pause(5);
    }
}
