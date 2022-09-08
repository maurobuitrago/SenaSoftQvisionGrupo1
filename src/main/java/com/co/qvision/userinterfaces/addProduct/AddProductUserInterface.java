package com.co.qvision.userinterfaces.addProduct;

import net.serenitybdd.screenplay.targets.Target;

public class AddProductUserInterface {

    public static Target MENU_BURGUER = Target.the("menu burguer").
            locatedBy("//div[@id=\"burger\"]");
    public  static  Target CATEGORY_SHOES = Target.the("category shoes").
            locatedBy("//li[@id=\"menu-item-17053\"]");
    public  static  Target ALL_SHOES = Target.the("All shoes").
            locatedBy("//a[@href=\"https://www.bon-bonite.com/categoria-producto/zapatos-mujer/\"]");

    public  static  Target SELECT_PRODUCT = Target.the("Select product").
            locatedBy("//a[@href=\"https://www.bon-bonite.com/producto/baletas-en-cuero-color-verde-esmeralda-y-animal-print/\"]");
}
