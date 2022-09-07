package com.co.qvision.tasks.reserveProducts;

import com.co.qvision.userinterfaces.reserveProduct.ProductReserve;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ReserveOfProducto implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(ProductReserve.SELECT_SIZE),
                Click.on(ProductReserve.SELECT_SIZE),
                Click.on(ProductReserve.SIZE_PRODUCT),
                Scroll.to(ProductReserve.INPUT_NAME),
                Enter.theValue("Sebas Gómez").into(ProductReserve.INPUT_NAME),
                Enter.theValue("jupaRami2810@gmail.com").into(ProductReserve.INPUT_EMAIL),
                Enter.theValue("3173291712").into(ProductReserve.INPUT_PHONE),
                Enter.theValue("1091011403").into(ProductReserve.INPUT_ID),
                Click.on(ProductReserve.BTN_SEND)
        );
    }

    public static ReserveOfProducto in() {
        return instrumented(ReserveOfProducto.class);
    }
}
