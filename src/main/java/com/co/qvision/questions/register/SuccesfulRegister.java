package com.co.qvision.questions.register;

import com.co.qvision.userinterfaces.register.MyAccount;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class SuccesfulRegister implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(MyAccount.CONFIRM_USER_CREATE).getText();
    }

    public static SuccesfulRegister value(){
        return new SuccesfulRegister();
    }
}
