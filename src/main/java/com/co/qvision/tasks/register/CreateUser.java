package com.co.qvision.tasks.register;

import com.co.qvision.userinterfaces.register.MyAccount;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CreateUser implements Task {

    @Override
    @Step("{0}  registers on the site")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("1091011403").into(MyAccount.INPUT_ID),
                Enter.theValue("jupaRami2810@gmail.com").into(MyAccount.INPUT_EMAIL),
                Enter.theValue("senasoft2022*.").into(MyAccount.INPUT_PASSWORD),
                Scroll.to(MyAccount.INPUT_PASSWORD),
                Click.on(MyAccount.CHECKBOX_PRIVACY_POLICY),
                Click.on(MyAccount.BTN_REGISTER)

        );
    }

    public static CreateUser with(){
        return instrumented(CreateUser.class);
    }
}
