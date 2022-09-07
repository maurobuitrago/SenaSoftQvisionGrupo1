package com.co.qvision.stepsdefinitions.reserveProduct;

import com.co.qvision.questions.reserveProduct.SuccessfulReserve;
import com.co.qvision.tasks.Login.LoginUserTask;
import com.co.qvision.tasks.OpenThePage;
import com.co.qvision.tasks.reserveProducts.ReserveOfProducto;
import com.co.qvision.tasks.reserveProducts.SelectionOfProduct;
import com.co.qvision.tasks.reserveProducts.GoToOutlet;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ReserveProductStepsdefinitions {

    //Instaciamos el driver chromeDriver
    @Managed(driver = "chrome")
    private WebDriver hisBrowser;

    //Creación del actor
    private Actor Sebas = Actor.named("sebas");

    //Se crea el metodo que contendra las habilidades del actor
    @Before
    public void setUp(){
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Sebas want to reserve a product$")
    public void sebasWantToReserveAProduct() {
       Sebas.wasAbleTo(OpenThePage.in());
    }

    @When("^she selects a product and fills in all the data on the form in the Outlet interface$")
    public void sheSelectsAProductAndFillsInAllTheDataOnTheFormInTheOutletInterface() throws InterruptedException {
        Sebas.wasAbleTo(LoginUserTask.on());
        Sebas.wasAbleTo(GoToOutlet.of());
        Sebas.wasAbleTo(SelectionOfProduct.in());
        Sebas.wasAbleTo(ReserveOfProducto.in());

    }

    @Then("^she should see on the screen the text reservation successful")
    public void sheShouldSeeOnTheScreenTheTextReservationSuccessful(){
        System.out.println("Product reservation success? "+ SuccessfulReserve.in().answeredBy(Sebas));
    }

}
