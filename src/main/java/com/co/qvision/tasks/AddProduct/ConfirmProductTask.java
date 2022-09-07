package com.co.qvision.tasks.AddProduct;

import com.co.qvision.userinterfaces.addProduct.ConfirmProductUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.selectactions.SelectByIndexFromBy;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class ConfirmProductTask implements Task {
    @Step("{0} Sebas adds the product")
    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Scroll.to(ConfirmProductUserInterface.SELECT_SIZE),
                    Click.on(ConfirmProductUserInterface.SELECT_SIZE),
                   Click.on(ConfirmProductUserInterface.SIZE_VALUE),
                  Click.on(ConfirmProductUserInterface.BTN_ADD_PRODUCT)

                  );
    }
    public static ConfirmProductTask ok(){
        return instrumented(ConfirmProductTask.class);
    }
}
