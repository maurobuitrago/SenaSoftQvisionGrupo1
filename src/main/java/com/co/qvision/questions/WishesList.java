package com.co.qvision.questions;

import com.co.qvision.userinterfaces.register.MyAccount;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class WishesList implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(MyAccount.PRODUCT_IN_WISHES_LIST).getText();
    }
    public static WishesList at(){
        return new WishesList();
    }
}
