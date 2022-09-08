package com.co.qvision.userinterfaces.register;

import net.serenitybdd.screenplay.targets.Target;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;

public class MyAccount {
    public static final Target INPUT_ID = Target.the("Input id")
            .locatedBy("//input[@id='reg_username']");
    public static final Target INPUT_EMAIL = Target.the("Input email")
            .locatedBy("//input[@id='reg_email']");
    public static final Target INPUT_PASSWORD = Target.the("Input password")
            .locatedBy("//input[@id='reg_password']");
    public static final Target CHECKBOX_PRIVACY_POLICY = Target.the("Checkbox of privacy policy")
            .locatedBy("//input[@id='privacy_policy_reg']");
    public static final Target BTN_REGISTER = Target.the("Button of register")
            .locatedBy("//button[@name='register']");
    public static By CONFIRM_USER_CREATE = By.xpath("//*[@id=\"content\"]/div/div/div/p[1]/text()[1]");


    public static final Target MENU_BURGUER = Target.the("Menu burguer")
            .locatedBy("//div[@id='burger']");
    public static final Target BTN_OUTLET = Target.the("Button of outlet")
            .locatedBy("//li[@id='menu-item-111881']");

    public static final Target BTN_ALL_OUTLET = Target.the("Button of products outlet")
            .locatedBy("(//a[@href='https://www.bon-bonite.com/categoria-producto/outlet/'])[2]");

    public static final Target BTN_HANDBAG = Target.the("Button of handbag")
            .locatedBy("//li[@id='menu-item-17054']");
    public static final Target BTN_ALL_HANDBAG = Target.the("Button all bag products")
            .locatedBy("(//a[@href='https://www.bon-bonite.com/categoria-producto/bolsos-mujer/'])[2]");

    public static final Target BTN_WISHES_HANDBAG = Target.the("Button of wishes list")
            .locatedBy("//*[@id=\"content\"]/div/div/nav/ul/li[2]/a");

    public static final By PRODUCT_IN_WISHES_LIST = By.xpath("(//img[@alt='Carteras Cuero'])");

    public static final Target BTN_ACCESORIES = Target.the("Button of accessories")
            .locatedBy("//*[@id=\"menu-item-18950\"]/a");
    public static final Target INSTAGRAM = Target.the("Social network instagram")
            .locatedBy("(//a[@class='social_net'])[1]");
}
