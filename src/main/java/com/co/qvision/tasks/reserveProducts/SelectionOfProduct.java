package com.co.qvision.tasks.reserveProducts;

import com.co.qvision.userinterfaces.reserveProduct.CategoryOutlet;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectionOfProduct implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(CategoryOutlet.PRODUCT_OUTLET),
                Click.on(CategoryOutlet.PRODUCT_OUTLET)

        );
    }

    public static SelectionOfProduct in(){
        return instrumented(SelectionOfProduct.class);
    }
}
