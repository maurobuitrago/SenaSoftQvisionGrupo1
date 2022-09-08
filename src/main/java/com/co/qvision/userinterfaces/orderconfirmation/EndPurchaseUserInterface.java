package com.co.qvision.userinterfaces.orderconfirmation;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;



public class EndPurchaseUserInterface {

    public static By DOWNLOAD = By.xpath("//div[text()='Descargar resumen pedido']");


    public static Target CHECKBOX = Target.the("checkbox")
            .locatedBy("//input[@id=\"newsletter_authorization\"]");

    //input[@id="newsletter_authorization"]
    //button[@id="place_order"]

}
