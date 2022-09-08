package com.co.qvision.tasks.productFilter;

import com.co.qvision.userinterfaces.register.MyAccount;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GoToCategory implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MyAccount.MENU_BURGUER),
                Click.on(MyAccount.BTN_ACCESORIES)
        );
    }

    public static GoToCategory of(){
        return instrumented(GoToCategory.class);
    }
}
