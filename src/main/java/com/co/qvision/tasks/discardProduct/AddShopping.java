package com.co.qvision.tasks.discardProduct;

import com.co.qvision.userinterfaces.addProduct.ConfirmProductUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddShopping implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(ConfirmProductUserInterface.SELECT_SIZE),
                Click.on(ConfirmProductUserInterface.SELECT_SIZE),
                Click.on(ConfirmProductUserInterface.SIZE_VALUE),
                Click.on(ConfirmProductUserInterface.BTN_BUY)

        );
    }
    public static AddShopping cart(){
        return instrumented(AddShopping.class);
    }
}
