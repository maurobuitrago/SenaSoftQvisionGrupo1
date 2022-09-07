package com.co.qvision.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/register_user.feature",
        glue = "com.co.qvision.stepsdefinitions.register",
        tags = " @Successful_register",
        snippets = SnippetType.CAMELCASE
)
public class RegisterUserRunner {
}
