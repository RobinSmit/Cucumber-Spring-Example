package com.implitest.examples.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = { "pretty", "html:target/cucumber" },
        glue = {"com.implitest.examples.cucumber.stepdefs"},
        features = {"src/test/resources/features"}
)
public class RunCukes {
}
