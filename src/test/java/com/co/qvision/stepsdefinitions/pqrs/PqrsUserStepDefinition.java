package com.co.qvision.stepsdefinitions.pqrs;

import com.co.qvision.questions.PqrsQuestion;
import com.co.qvision.tasks.Login.LoginUserTask;
import com.co.qvision.tasks.OpenThePage;
import com.co.qvision.tasks.pqrs.PqrsUserTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class PqrsUserStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver hisBrowser;


    //Creacion del actor
    private Actor Sebas = Actor.named("Sebas");
    //Creacion del metodo que tendra la habilidad del mentor
    @Before
    public void setUp(){
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }


    @Given("^Sebas in the pqrs page$")
    public void sebasInThePqrsPage() {
        Sebas.wasAbleTo(OpenThePage.in());
        Sebas.wasAbleTo(LoginUserTask.on());
    }

    @When("^He fills in the form login$")
    public void heFillsInTheFormLogin() {
        Sebas.wasAbleTo(PqrsUserTask.sendto());

    }

    @Then("^he should perform a pqrs$")
    public void heShouldPerformAPqrs() {
        System.out.println("Were you able to send the pqrs ?" + PqrsQuestion.at().answeredBy(Sebas));
    }
}
