package com.co.qvision.tasks.discardProduct;

import com.co.qvision.userinterfaces.discardProduct.ShoppingCart;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DiscartProduct implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ShoppingCart.BTN_DISCARD)
        );
    }
    public static DiscartProduct fromShoppingCart(){
        return instrumented(DiscartProduct.class);
    }
}
