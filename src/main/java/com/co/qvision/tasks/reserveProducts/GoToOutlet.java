package com.co.qvision.tasks.reserveProducts;

import com.co.qvision.userinterfaces.register.MyAccount;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GoToOutlet implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MyAccount.MENU_BURGUER),
                Click.on(MyAccount.BTN_OUTLET),
                Click.on(MyAccount.BTN_ALL_OUTLET)
        );
    }

    public static GoToOutlet of(){
        return  instrumented(GoToOutlet.class);
    }
}
