package com.co.qvision.tasks.orderconfirmation;

import com.co.qvision.userinterfaces.orderconfirmation.EndPurchaseUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EndPurchaseTask implements Task {
    @Override
    @Step("{0} End purchase")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(EndPurchaseUserInterface.CHECKBOX)
        );
    }
    public static EndPurchaseTask end(){
        return instrumented(EndPurchaseTask.class);
    }
}
