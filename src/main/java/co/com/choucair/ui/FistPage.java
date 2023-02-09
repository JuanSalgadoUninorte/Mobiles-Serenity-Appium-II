package co.com.choucair.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class FistPage extends PageObject {

    public static final Target LBL_CONFIRMATION =Target.the("Balance's label").located(By.xpath("//android.widget.TextView[@text='jdsa1822'][1]"));

}
