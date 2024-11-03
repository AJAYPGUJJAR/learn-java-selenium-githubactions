package com.apsg.uitests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/Sample.feature",
        glue = "com.apsg.uitests.stepdefs"
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
