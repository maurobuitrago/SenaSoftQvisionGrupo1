package com.co.qvision.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/product_reserve.feature",
        glue = "com.co.qvision.stepsdefinitions.reserveProduct",
        tags = "@ReserveProduct",
        snippets = SnippetType.CAMELCASE
)
public class ReserverProductRunner {
}
