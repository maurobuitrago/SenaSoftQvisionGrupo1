package com.co.qvision.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/order_confirmation.feature",
        glue = "com.co.qvision.stepsdefinitions.orderconfirmation",
        tags = "@payment",
        snippets = SnippetType.CAMELCASE
)
public class OrderConfirmationRunner {
}
