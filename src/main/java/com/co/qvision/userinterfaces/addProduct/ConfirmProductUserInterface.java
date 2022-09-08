package com.co.qvision.userinterfaces.addProduct;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConfirmProductUserInterface {
    public static Target SELECT_SIZE = Target.the("size product").
            locatedBy("//select[@id=\"pa_talla\"]");
    public static Target SIZE_VALUE = Target.the("size value").
            locatedBy("//option[@value=\"35-5\"]");
    public static Target BTN_ADD_PRODUCT = Target.the("button add product").
            locatedBy("//button[@class=\"single_add_to_cart_button button alt\"]");

    public static Target BTN_BUY = Target.the("Button of buy")
            .locatedBy("//*[@id=\"product-211244\"]/div[2]/div[1]/div/form/div/div[2]/div[1]");
    public static By TEXT_SUCCESSFUL = By.xpath("//div[@class=\"cart-contents-count\"]");


}
