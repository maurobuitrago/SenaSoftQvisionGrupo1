package com.co.qvision.tasks.pqrs;

import com.co.qvision.questions.PqrsQuestion;
import com.co.qvision.userinterfaces.pqrs.PqrsUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PqrsUserTask implements Task {
    @Step("{0} The user could not perform the pqrs due to a bug found.")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(PqrsUserInterface.MENU_BURGUER),
                Scroll.to(PqrsUserInterface.PQRS),
                Click.on(PqrsUserInterface.PQRS)
        );

    }
    public static PqrsUserTask sendto(){
        return instrumented(PqrsUserTask.class);
    }
}
