package com.co.qvision.userinterfaces.orderconfirmation;

import net.serenitybdd.screenplay.targets.Target;

public class OrderConfirmationUserInterface {

    public static Target MENU_BURGUER = Target.the("menu burguer").
            locatedBy("//div[@id=\"burger\"]");
    public  static  Target CATEGORY_SHOES = Target.the("category shoes").
            locatedBy("//li[@id=\"menu-item-17053\"]");
    public  static  Target ALL_SHOES = Target.the("All shoes").
            locatedBy("//a[@href=\"https://www.bon-bonite.com/categoria-producto/zapatos-mujer/\"]");

    public  static  Target SELECT_PRODUCT = Target.the("Select product").
            locatedBy("//a[@href=\"https://www.bon-bonite.com/producto/baletas-en-cuero-color-verde-esmeralda-y-animal-print/\"]");

    public static Target SELECT_SIZE = Target.the("size product").
            locatedBy("//select[@id=\"pa_talla\"]");
    public static Target SIZE_VALUE = Target.the("size value").
            locatedBy("//option[@value=\"37-5\"]");
    public static Target BTN_CONFIRMATION = Target.the("button confirmation").
            locatedBy("//div[@class=\"buy_now_button enabled\"]");








}
