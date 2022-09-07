package com.co.qvision.userinterfaces.login;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class LoginUserUserInterface{

    public static Target USERNAME = Target.the("user").
            locatedBy("//input[@id=\"username\"]");
    public static Target PASSWORD = Target.the("password").
            locatedBy("//input[@id=\"password\"]");
    public static Target BTN_LOGIN = Target.the("button login").
            locatedBy("//button[@value=\"Acceder\"]");

    public static By WELCOM_USER = By.xpath("//div[@id='content']/div[1]/div[1]/div[1]/p[1]/strong[1]");



}
