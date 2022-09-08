package com.co.qvision.tasks.orderconfirmation;

import com.co.qvision.userinterfaces.addProduct.AddProductUserInterface;
import com.co.qvision.userinterfaces.addProduct.ConfirmProductUserInterface;
import com.co.qvision.userinterfaces.orderconfirmation.OrderConfirmationUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OrderConfirmationTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OrderConfirmationUserInterface.MENU_BURGUER),
                Click.on(OrderConfirmationUserInterface.CATEGORY_SHOES),
                Click.on(OrderConfirmationUserInterface.ALL_SHOES),
                Click.on(OrderConfirmationUserInterface.SELECT_PRODUCT),
                Scroll.to(OrderConfirmationUserInterface.SELECT_SIZE),
                Click.on(OrderConfirmationUserInterface.SELECT_SIZE),
                Click.on(OrderConfirmationUserInterface.SIZE_VALUE),
                Click.on(OrderConfirmationUserInterface.BTN_CONFIRMATION)


        );
    }
    public static OrderConfirmationTask pay(){
        return instrumented(OrderConfirmationTask.class);
    }
}
