package com.co.qvision.userinterfaces.register;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.bon-bonite.com/")
public class BonBonitePage extends PageObject {
    public static final Target BTN_MY_ACCOUNT = Target.the("Button of my account")
            .locatedBy("(//a[@href='https://www.bon-bonite.com/mi-cuenta/'])[1]");
}
