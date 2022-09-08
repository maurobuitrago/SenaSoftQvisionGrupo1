package com.co.qvision.stepsdefinitions.socialNetworks;

import com.co.qvision.tasks.Login.LoginUserTask;
import com.co.qvision.tasks.OpenThePage;
import com.co.qvision.tasks.socialNetworks.GoToSocialNetwork;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class SocialNetworkStepdefinitions {
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

    @Given("^Sebas wants to see the social networks$")
    public void sebasWantsToSeeTheSocialNetworks() {
        Sebas.wasAbleTo(OpenThePage.in());

    }

    @When("^He Go to their instagram social network$")
    public void heGoToTheirInstagramSocialNetwork() {
        Sebas.wasAbleTo(LoginUserTask.on());
        Sebas.wasAbleTo(GoToSocialNetwork.instagram());
    }

    @Then("^He should see your instagram social network on the screen\\.$")
    public void heShouldSeeYourInstagramSocialNetworkOnTheScreen() {

    }

}
