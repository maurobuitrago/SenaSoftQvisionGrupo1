package com.co.qvision.stepsdefinitions.addProduct;

import com.co.qvision.questions.AddProduct.AddProductQuestion;
import com.co.qvision.tasks.AddProduct.AddProductTask;
import com.co.qvision.tasks.AddProduct.ConfirmProductTask;
import com.co.qvision.tasks.Login.LoginUserTask;
import com.co.qvision.tasks.OpenThePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class AddProductStepDefinitions {


    @Managed(driver = "chrome")
    private WebDriver hisBrowser;


    //Creacion del actor
    private Actor Sebas = Actor.named("Sebas");
    //Creacion del metodo que tendra la habilidad del mentor
    @Before
    public void setUp(){
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }



    @Given("^Sebas on the product page of the shoes category$")
    public void sebasOnTheProductPageOfTheShoesCategory() {
        Sebas.wasAbleTo(OpenThePage.in());
    }

    @When("^he selects the product$")
    public void heSelectsTheProduct() {
        Sebas.wasAbleTo(LoginUserTask.on());
        Sebas.wasAbleTo(AddProductTask.add());
        Sebas.wasAbleTo(ConfirmProductTask.ok());

    }

    @Then("^He should add to shopping cart$")
    public void heShouldAddToShoppingCart() {
        System.out.println("Add product to cart ? \n " + AddProductQuestion.confirm());

    }
}
