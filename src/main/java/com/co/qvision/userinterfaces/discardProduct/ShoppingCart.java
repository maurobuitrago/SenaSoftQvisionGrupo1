package com.co.qvision.userinterfaces.discardProduct;

import net.serenitybdd.screenplay.targets.Target;

public class ShoppingCart {
    public static final Target BTN_DISCARD = Target.the("Button of add from shopping cart")
                .locatedBy("//*[@id=\"content\"]/div/div/form/table/tbody/tr[1]/td[1]/a");
}