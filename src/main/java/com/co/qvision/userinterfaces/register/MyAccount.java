package com.co.qvision.userinterfaces.register;

import net.serenitybdd.screenplay.targets.Target;
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
}
