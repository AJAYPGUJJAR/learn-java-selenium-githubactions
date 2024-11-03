package com.apsg.uitests.stepdefs;

import com.apsg.uitests.utils.WebdriverFactory;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.WebDriver;

public class StepDefinitions {

    public static WebDriver driver;

    @BeforeAll
    public static void setUp() {
        WebdriverFactory webdriverFactory = new WebdriverFactory();
        driver = webdriverFactory.getWebDriver();
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }

}
