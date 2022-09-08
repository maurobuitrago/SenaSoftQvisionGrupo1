package com.co.qvision.stepsdefinitions.productFilter;

import com.co.qvision.questions.productFilter.ProductFilter;
import com.co.qvision.tasks.Login.LoginUserTask;
import com.co.qvision.tasks.OpenThePage;
import com.co.qvision.tasks.productFilter.Filter;
import com.co.qvision.tasks.productFilter.GoToCategory;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class ProductFilterStepdefinition {
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


    @Given("^Sebas want to all filter product$")
    public void sebasWantToAllFilterProduct() {
        Sebas.wasAbleTo(OpenThePage.in());
    }

    @When("^He chose an method for filtering$")
    public void heChoseAnMethodForFiltering() {
        Sebas.wasAbleTo(LoginUserTask.on());
        Sebas.wasAbleTo(GoToCategory.of());
        Sebas.wasAbleTo(Filter.in());
    }

    @Then("^He should observe the filter on the screen$")
    public void heShouldObserveTheFilterOnTheScreen() {
        System.out.println("Successful filtering? "+ ProductFilter.with().answeredBy(Sebas));
    }
}
