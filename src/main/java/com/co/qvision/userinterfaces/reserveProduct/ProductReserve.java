package com.co.qvision.userinterfaces.reserveProduct;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductReserve {
    public static final Target SELECT_SIZE = Target.the("Select size")
            .locatedBy("//select[@id='pa_talla']");
    public static final Target SIZE_PRODUCT = Target.the("Size product")
            .locatedBy("//option[@value='35']");
    public static final Target INPUT_NAME = Target.the("Input name")
            .locatedBy("//input[@name='your-name']");
    public static final  Target INPUT_EMAIL = Target.the("Input email")
            .locatedBy("//input[@name='your-email']");
    public static final  Target INPUT_PHONE = Target.the("Input email")
            .locatedBy("//input[@name='your-tel']");
    public static final  Target INPUT_ID = Target.the("Input email")
            .locatedBy("//input[@name='your-ceudla']");
    public static Target BTN_SEND = Target.the("Button send")
            .locatedBy("//input[@type='submit']");
    public static final By TEXT_SUCCESSFUL = By.xpath("//div[@class='wpcf7-response-output']");

}
