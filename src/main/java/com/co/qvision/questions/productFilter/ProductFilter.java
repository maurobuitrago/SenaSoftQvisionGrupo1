package com.co.qvision.questions.productFilter;

import com.co.qvision.userinterfaces.productFilter.FilterAccessories;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.HoverOverBy;
import net.serenitybdd.screenplay.actions.HoverOverTarget;

public class ProductFilter implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(FilterAccessories.PRODUCT_FITLTER).getText();
    }
    public static ProductFilter with(){
        return  new ProductFilter();
    }
}
