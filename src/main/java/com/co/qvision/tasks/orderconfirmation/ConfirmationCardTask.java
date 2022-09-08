package com.co.qvision.tasks.orderconfirmation;

import com.co.qvision.userinterfaces.orderconfirmation.ConfirmationCardUserInterface;
import com.co.qvision.userinterfaces.orderconfirmation.OrderConfirmationUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ConfirmationCardTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(ConfirmationCardUserInterface.TITLE_SUBTOTAL),
                Click.on(ConfirmationCardUserInterface.BTN_PAY)
        );
    }
    public static  ConfirmationCardTask select(){
        return instrumented(ConfirmationCardTask.class);
    }
}
