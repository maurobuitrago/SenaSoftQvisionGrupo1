package com.co.qvision.tasks.socialNetworks;

import com.co.qvision.userinterfaces.register.MyAccount;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GoToSocialNetwork implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MyAccount.MENU_BURGUER),
                Scroll.to(MyAccount.INSTAGRAM),
                Click.on(MyAccount.INSTAGRAM)
        );
    }

    public static GoToSocialNetwork instagram(){
        return instrumented(GoToSocialNetwork.class);
    }
}
