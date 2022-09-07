package com.co.qvision.userinterfaces.pqrs;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PqrsUserInterface {

    public static Target MENU_BURGUER = Target.the("menu burguer").
            locatedBy("//div[@id=\"burger\"]");

    public static Target PQRS = Target.the("pqrs").
            locatedBy("//a[@href=\"https://www.bon-bonite.com/mi-cuenta/?r=pqrs\"]");

    public static By TITLE = By.xpath("//h4[@class=\"text-primary\"]");

}
