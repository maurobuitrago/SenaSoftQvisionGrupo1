package com.co.qvision.tasks;

import com.co.qvision.userinterfaces.HomePageInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenThePage implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.browserOn(new HomePageInterface()));

        actor.attemptsTo(
                Click.on(HomePageInterface.MICOUNT)
        );

    }

    public static OpenThePage in(){
        return instrumented(OpenThePage.class);
    }

}
