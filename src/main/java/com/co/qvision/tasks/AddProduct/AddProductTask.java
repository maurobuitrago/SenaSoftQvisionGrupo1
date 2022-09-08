package com.co.qvision.tasks.AddProduct;

import com.co.qvision.userinterfaces.addProduct.AddProductUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddProductTask implements Task {
    @Step("{0} Sebas selects the product")
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(AddProductUserInterface.MENU_BURGUER),
                Click.on(AddProductUserInterface.CATEGORY_SHOES),
                Click.on(AddProductUserInterface.ALL_SHOES),
                Click.on(AddProductUserInterface.SELECT_PRODUCT)
        );
    }
    public static AddProductTask add(){
        return instrumented(AddProductTask.class);
    }
}
