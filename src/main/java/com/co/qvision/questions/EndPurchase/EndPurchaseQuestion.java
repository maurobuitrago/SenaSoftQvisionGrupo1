package com.co.qvision.questions.EndPurchase;

import com.co.qvision.userinterfaces.login.LoginUserUserInterface;
import com.co.qvision.userinterfaces.orderconfirmation.EndPurchaseUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class EndPurchaseQuestion implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(EndPurchaseUserInterface.DOWNLOAD).getText();
    }
    public static EndPurchaseQuestion ok(){
        return new EndPurchaseQuestion();
    }
}
