package com.co.qvision.stepsdefinitions.login;

import com.co.qvision.questions.Login.LoginUserQuestion;
import com.co.qvision.tasks.Login.LoginUserTask;
import com.co.qvision.tasks.OpenThePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class LoginUserStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver hisBrowser;


    //Creacion del actor
    private Actor Sebas = Actor.named("Sebas");
    //Creacion del metodo que tendra la habilidad del mentor
    @Before
    public void setUp(){
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }


    @Given("^Sebas in the my count page$")
    public void sebasInTheMyCountPage() {
        Sebas.wasAbleTo(OpenThePage.in());
    }


    @When("^He fills in the form login$")
    public void heFillsInTheFormLogin() {
        Sebas.wasAbleTo(LoginUserTask.on());
    }

    @Then("^He should into page Bon bonite$")
    public void heShouldIntoPageBonBonite() {
        System.out.println("Login successful ?  \n el numero de usario es: "+ LoginUserQuestion.at().answeredBy(Sebas));

    }
}
