package com.co.qvision.questions.reserveProduct;

import com.co.qvision.userinterfaces.reserveProduct.ProductReserve;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class SuccessfulReserve implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(ProductReserve.TEXT_SUCCESSFUL).getText();
    }
    public static SuccessfulReserve in(){
        return new SuccessfulReserve();
    }
}
