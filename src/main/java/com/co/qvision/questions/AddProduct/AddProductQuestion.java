package com.co.qvision.questions.AddProduct;

import com.co.qvision.userinterfaces.addProduct.ConfirmProductUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class AddProductQuestion implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(ConfirmProductUserInterface.TEXT_SUCCESSFUL);
    }

    public static AddProductQuestion confirm(){
        return new AddProductQuestion();
    }
}
