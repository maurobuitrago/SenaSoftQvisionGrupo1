package com.co.qvision.userinterfaces.productFilter;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FilterAccessories {
    public static final Target FILTER = Target.the("Button of filter")
            .locatedBy("//div[@class='more_filters']");

    public static final Target INPUT_PRICE = Target.the("Price of filter")
            .locatedBy("//*[@id=\"filters-side-bar\"]/div[2]/div[2]/div[3]");

    public static final Target COLOR = Target.the("Color of filter")
            .locatedBy("//label[@for='color-332']");
    public static final Target OREDER_SELECT = Target.the("Order of select")
            .locatedBy("//select[@name='orderby']");
    public static final  Target ORDER_CHOICE = Target.the("Order choice")
            .locatedBy("//option[@value='price']");
    public static final Target BTN_FILTER = Target.the("Button of filter")
            .locatedBy("//a[@id='filtrar_button']");
    public static final  Target PRODUCT_FITER_IMAGE = Target.the("Product filter image")
            .locatedBy("//img[@src='https://www.bon-bonite.com/wp-content/uploads/2022/08/184454-A-600x600.png']");

    public static final By PRODUCT_FITLTER = By.xpath("//span[@class='woocommerce-Price-amount amount']/bdi/span");


}
