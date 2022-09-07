package com.co.qvision.tasks.wishesList;

import com.co.qvision.userinterfaces.register.MyAccount;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GoToHandbag implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MyAccount.MENU_BURGUER),
                Click.on(MyAccount.BTN_HANDBAG),
                Click.on(MyAccount.BTN_ALL_HANDBAG)
        );
    }
    public static GoToHandbag in(){
        return instrumented(GoToHandbag.class);
    }
}
