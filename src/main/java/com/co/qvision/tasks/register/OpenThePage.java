package com.co.qvision.tasks.register;

import com.co.qvision.userinterfaces.register.BonBonitePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenThePage implements Task {
    @Override
    @Step("{0} Open the page bon bonite")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(new BonBonitePage()),
                Click.on(BonBonitePage.BTN_MY_ACCOUNT)
        );
    }

    public static OpenThePage on(){
        return instrumented(OpenThePage.class);
    }

}
