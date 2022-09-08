package com.co.qvision.tasks.productFilter;

import com.co.qvision.userinterfaces.productFilter.FilterAccessories;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Filter implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FilterAccessories.FILTER),
                Click.on(FilterAccessories.INPUT_PRICE),
                Scroll.to(FilterAccessories.COLOR),
                Click.on(FilterAccessories.COLOR),
                Scroll.to(FilterAccessories.OREDER_SELECT),
                Click.on(FilterAccessories.OREDER_SELECT),
                Click.on(FilterAccessories.ORDER_CHOICE),
                Click.on(FilterAccessories.BTN_FILTER)
        );
    }
    public static Filter in(){
        return instrumented(Filter.class);
    }
}
