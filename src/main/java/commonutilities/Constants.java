package commonutilities;

import org.openqa.selenium.Keys;

import java.time.Duration;

public class Constants {
    public static final String username="abhinavprakashak47@gmail.com";
    public static final String password="user@ah56";


    public static final Duration expicit_Wait_Time = Duration.ofSeconds(50);
    public static CharSequence control_Key = (System.getProperty("os.name").contains("mac"))? Keys.COMMAND : Keys.CONTROL;

}
