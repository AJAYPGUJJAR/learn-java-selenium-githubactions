package com.apsg.uitests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/Sample.feature",
        glue = "com.apsg.uitests.stepdefs",
        plugin = {"pretty", "html:target/results/cucumber-report.html"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
