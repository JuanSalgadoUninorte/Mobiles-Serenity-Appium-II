package co.com.choucair.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage extends PageObject {

    public static final Target START = Target.the("").located(By.xpath("//android.widget.Button[@text='Log in or sign up with WordPress.com']"));
    public static final Target TXT_USERNAME = Target.the("").located(By.xpath("//android.widget.EditText[@text='Email address']"));
    public static final Target CONTINUE_BUTTON = Target.the("").located(By.xpath("//android.widget.Button[@text='Continue']"));
    public static final Target TXT_PASSWORD = Target.the("").located(By.xpath("//android.widget.EditText[@text='Password']"));

}
