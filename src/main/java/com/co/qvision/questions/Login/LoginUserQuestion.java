package com.co.qvision.questions.Login;

import com.co.qvision.userinterfaces.login.LoginUserUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class LoginUserQuestion implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(LoginUserUserInterface.WELCOM_USER).getText();
    }

    public static LoginUserQuestion at(){
        return new LoginUserQuestion();
    }

}
