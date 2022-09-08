package com.co.qvision.userinterfaces.orderconfirmation;

import net.serenitybdd.screenplay.targets.Target;

public class ConfirmationCardUserInterface {

    public static Target BTN_PAY = Target.the("button pay").
            locatedBy("//a[@class=\"checkout-button button alt wc-forward\"]");


    public static Target TITLE_SUBTOTAL = Target.the("title subtotal").
            locatedBy("//table[@class=\"shop_table shop_table_responsive\"]");
}
