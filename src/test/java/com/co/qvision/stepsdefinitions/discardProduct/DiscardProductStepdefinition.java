package com.co.qvision.stepsdefinitions.discardProduct;

import com.co.qvision.tasks.AddProduct.AddProductTask;
import com.co.qvision.tasks.AddProduct.ConfirmProductTask;
import com.co.qvision.tasks.Login.LoginUserTask;
import com.co.qvision.tasks.OpenThePage;
import com.co.qvision.tasks.discardProduct.AddShopping;
import com.co.qvision.tasks.discardProduct.DiscartProduct;
import com.co.qvision.userinterfaces.discardProduct.ShoppingCart;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class DiscardProductStepdefinition {
    @Managed(driver = "chrome")
    private WebDriver hisBrowser;


    //Creacion del actor
    private Actor Sebas = Actor.named("Sebas");
    //Creacion del metodo que tendra la habilidad del mentor
    @Before
    public void setUp(){
        hisBrowser.manage().deleteAllCookies();
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }


    @Given("^Sebas wants to add a product to the shopping cart$")
    public void sebasWantsToAddAProductToTheShoppingCart() {
        Sebas.wasAbleTo(OpenThePage.in());
    }

    @When("^He discard the product from the shopping cart$")
    public void heDiscardTheProductFromTheShoppingCart() {
        Sebas.wasAbleTo(LoginUserTask.on());
        Sebas.wasAbleTo(AddProductTask.add());
        Sebas.wasAbleTo(AddShopping.cart());
        Sebas.wasAbleTo(DiscartProduct.fromShoppingCart());

    }

    @Then("^He should see an empty shopping cart$")
    public void heShouldSeeAnEmptyShoppingCart() {

    }

}
