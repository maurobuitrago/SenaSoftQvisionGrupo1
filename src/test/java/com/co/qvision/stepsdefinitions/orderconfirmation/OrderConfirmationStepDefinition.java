package com.co.qvision.stepsdefinitions.orderconfirmation;


import com.co.qvision.questions.EndPurchase.EndPurchaseQuestion;
import com.co.qvision.tasks.Login.LoginUserTask;
import com.co.qvision.tasks.OpenThePage;
import com.co.qvision.tasks.orderconfirmation.ConfirmationCardTask;
import com.co.qvision.tasks.orderconfirmation.EndPurchaseTask;
import com.co.qvision.tasks.orderconfirmation.OrderConfirmationTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class OrderConfirmationStepDefinition {

    @Managed(driver = "chrome")

    private WebDriver hisBrowser;

    private Actor Sebas = Actor.named("Sebas");
    //Creacion del metodo que tendra la habilidad del mentor
    @Before
    public void setUp(){
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Sebas on the product page of the pay product$")
    public void sebasOnTheProductPageOfThePayProduct() {
        Sebas.wasAbleTo(OpenThePage.in());
        Sebas.wasAbleTo(LoginUserTask.on());
        Sebas.wasAbleTo(OrderConfirmationTask.pay());
        Sebas.wasAbleTo(ConfirmationCardTask.select());


    }

    @When("^he paes the product$")
    public void hePaesTheProduct() {
        Sebas.wasAbleTo(EndPurchaseTask.end());
    }

    @Then("^Then he should receive the product$")
    public void thenHeShouldReceiveTheProduct() {
        System.out.println("Order summary downloaded ?" + EndPurchaseQuestion.ok().answeredBy(Sebas));
        assertEquals("Descargar resumen pedido",EndPurchaseQuestion.ok().answeredBy(Sebas));
    }
}
