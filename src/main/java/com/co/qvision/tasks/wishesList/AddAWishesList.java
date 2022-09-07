package com.co.qvision.tasks.wishesList;

import com.co.qvision.userinterfaces.register.BonBonitePage;
import com.co.qvision.userinterfaces.register.MyAccount;
import com.co.qvision.userinterfaces.wishesList.CategoryHandbag;
import com.co.qvision.userinterfaces.wishesList.HandBag;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddAWishesList implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CategoryHandbag.IMG_HANDBAG),
                Scroll.to(HandBag.ICON_WISHES),
                Click.on(HandBag.ICON_WISHES),
                Click.on(BonBonitePage.BTN_MY_ACCOUNT),
                Click.on(MyAccount.BTN_WISHES_HANDBAG)

        );
    }

    public static AddAWishesList at(){
        return instrumented(AddAWishesList.class);
    }
}
