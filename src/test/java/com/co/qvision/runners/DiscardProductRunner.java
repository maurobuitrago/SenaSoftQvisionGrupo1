package com.co.qvision.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/discard_product.feature",
        glue = "com.co.qvision.stepsdefinitions.discardProduct",
        tags = "@DiscardProduct",
        snippets = SnippetType.CAMELCASE
)
public class DiscardProductRunner {
}
