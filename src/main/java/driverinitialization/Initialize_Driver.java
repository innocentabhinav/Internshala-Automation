package driverinitialization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Initialize_Driver {
    private static WebDriver driver;
    public static WebDriver get_Driver_Instance() {
        if (driver == null) {
            driver = new ChromeDriver();

        }
        return driver;
    }

    @BeforeSuite
    public void Navigate_To_Internshala(){
        driver =get_Driver_Instance();
        driver.manage().window().maximize();
        driver.get("https://internshala.com/login/");
    }

    @AfterSuite
    public void tearDown(){
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

}

