package com.co.qvision.questions;

import com.co.qvision.userinterfaces.pqrs.PqrsUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class PqrsQuestion implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(PqrsUserInterface.TITLE);
    }

    public static PqrsQuestion at(){
        return new PqrsQuestion();
    }
}
