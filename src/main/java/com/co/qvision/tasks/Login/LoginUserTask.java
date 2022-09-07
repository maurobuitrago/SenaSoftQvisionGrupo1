package com.co.qvision.tasks.Login;

import com.co.qvision.userinterfaces.login.LoginUserUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollTo;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginUserTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
        Enter.theValue("1091011403").into(LoginUserUserInterface.USERNAME),
                Enter.theValue("senasoft2022*.").into(LoginUserUserInterface.PASSWORD),
                Scroll.to(LoginUserUserInterface.USERNAME),
                Click.on(LoginUserUserInterface.BTN_LOGIN)
        );

    }
    public static LoginUserTask on(){
        return instrumented(LoginUserTask.class);
    }
}
