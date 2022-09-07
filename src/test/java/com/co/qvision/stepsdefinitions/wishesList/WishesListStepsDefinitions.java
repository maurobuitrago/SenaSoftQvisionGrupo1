package com.co.qvision.stepsdefinitions.wishesList;

import com.co.qvision.questions.WishesList;
import com.co.qvision.tasks.Login.LoginUserTask;
import com.co.qvision.tasks.OpenThePage;
import com.co.qvision.tasks.wishesList.AddAWishesList;
import com.co.qvision.tasks.wishesList.GoToHandbag;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class WishesListStepsDefinitions {
    //Instaciamos el driver chromeDriver
    @Managed(driver = "chrome")
    private WebDriver hisBrowser;

    //Creación del actor
    private Actor Sebas = Actor.named("Sebas");

    //Se crea el metodo que contendra las habilidades del actor
    @Before
    public void setUp(){
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Sebas want to save a product$")
    public void sebasWantToSaveAProduct() {
       Sebas.wasAbleTo(OpenThePage.in());
    }


    @When("^He Go to the bag interface and save the product in the wish list\\.$")
    public void heGoToTheBagInterfaceAndSaveTheProductInTheWishList() {
        Sebas.wasAbleTo(LoginUserTask.on());
        Sebas.wasAbleTo(GoToHandbag.in());
        Sebas.wasAbleTo(AddAWishesList.at());

    }

    @Then("^He should see your saved product on the screen$")
    public void heShouldSeeYourSavedProductOnTheScreen() {
        System.out.println("Is the product in the wish list? "+ WishesList.at().answeredBy(Sebas));
    }

}
