package automationsourcecode;

import commonutilities.Init;
import driverinitialization.Initialize_Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static automationsourcecode.Internshala_Locators.*;
import static commonutilities.Constants.*;

public class Internshala_Utils implements Init {



    public void Login_To_Internshala(){
        click.Webdriver_Click(By.xpath(input_Credentials_Xpath.replace("$Credential_Id","email")),true);
        sendkeys.Webdriver_Sendkeys(By.xpath(input_Credentials_Xpath.replace("$Credential_Id","email")),username);
        sendkeys.Webdriver_Sendkeys(By.xpath(input_Credentials_Xpath.replace("$Credential_Id","password")),password);
        click.Webdriver_Click(login_Button,true);
        visible.Wait_For_Page_To_Load();
        visible.Wait_Until_Visible(10,home_Page_Heading);
    }

    public void Navigate_To_Application_Page(){
        click.Webdriver_Click(profile_Dropdown_Icon,true);
        List<WebElement> profileOptions = driver.findElements(profile_Dropdown_Options);
        List<String> app_Urls = new ArrayList<>();
        for (WebElement profileOption : profileOptions) {
            String url = profileOption.getAttribute("href");
            app_Urls.add(url);
            System.out.println(url);
        }
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("https://internshala.com"));
        driver.get(app_Urls.get(1));
        System.out.println("Navigated to: " + app_Urls.get(1));
        visible.Wait_Until_Visible(12,application_Page_Heading);
        String application_Page_Header_Text=text.Webdriver_Get_Text(application_Page_Heading);
        Assert.assertEquals(application_Page_Header_Text,"My applications","Header Text For Application Page not as expected!");
        visible.Pause(5);

    }

}
