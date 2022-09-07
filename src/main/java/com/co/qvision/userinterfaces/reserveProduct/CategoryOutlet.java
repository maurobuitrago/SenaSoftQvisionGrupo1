package com.co.qvision.userinterfaces.reserveProduct;

import net.serenitybdd.screenplay.targets.Target;

public class CategoryOutlet {
    public static final Target PRODUCT_OUTLET = Target.the("Product outlet")
            .locatedBy("//img[@src='https://www.bon-bonite.com/wp-content/uploads/2022/03/184466-A-600x600.png']");
    public static final Target SCROLL_PRODUCT_OUTLET = Target.the("Scroll")
            .locatedBy("//a[@href='https://www.bon-bonite.com/producto/baletas-en-cuero-color-azul-pacifico/']");
}
