package com.co.qvision.stepsdefinitions.register;

import com.co.qvision.questions.register.SuccesfulRegister;
import com.co.qvision.tasks.register.CreateUser;
import com.co.qvision.tasks.register.OpenThePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class RegisterUserStepdefinitions {
    //Instaciamos el driver chromeDriver
    @Managed(driver = "chrome")
    private WebDriver hisBrowser;

    //Creación del actor
    private Actor Alejo = Actor.named("Alejo");

    //Se crea el metodo que contendra las habilidades del actor
    @Before
    public void setUp(){
        Alejo.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Alejo want to create a account$")
    public void alejoWantToCreateAAccount() {
        Alejo.wasAbleTo(OpenThePage.on());
    }

    @When("^He fills in the form fields$")
    public void heFillsInTheFormFields() {
        Alejo.wasAbleTo(CreateUser.with());
    }

    @Then("^He should sees in screen the text of successful register$")
    public void heShouldSeesInScreenTheTextOfSuccessfulRegister() {
        System.out.println("Successful Register? "+ SuccesfulRegister.value().answeredBy(Alejo));
        assertEquals("1091011403",SuccesfulRegister.value().answeredBy(Alejo));
    }

}
