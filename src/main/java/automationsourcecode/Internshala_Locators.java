package automationsourcecode;

import org.openqa.selenium.By;

public class Internshala_Locators {
   public static String input_Credentials_Xpath= "//div[@id='form-container']//input[@id='$Credential_Id']";
   public static final By login_Button =By.xpath("//div[@id='form-container']//button[@id='login_submit']");
   public static final By home_Page_Heading =By.xpath("//div[@class='main-heading']//h1[text()]");
   public static final By application_Page_Heading =By.xpath("//div[@class='heading heading_2_3 main_heading ']");
   public static final By profile_Dropdown_Icon =By.xpath("//div[contains(@class,'navbar_desktop')]//a[contains(@class,'profile_container')]");
   public static final By profile_Dropdown_Options =By.xpath("//div[@class='profile_options']//li//a");

}
