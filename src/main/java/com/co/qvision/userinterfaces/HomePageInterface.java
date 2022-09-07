package com.co.qvision.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.bon-bonite.com/")
public class HomePageInterface extends PageObject {
    public static Target MICOUNT = Target.the("mi cuenta").
            locatedBy("//a[@href=\"https://www.bon-bonite.com/mi-cuenta/\"]");
}
