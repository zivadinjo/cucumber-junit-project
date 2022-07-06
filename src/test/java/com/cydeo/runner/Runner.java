package com.cydeo.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-report.html",
        features = "src/test/resources/features",
        glue = "com/cydeo/step_definitions",
        dryRun = true,
        tags = "@wip"  //it will run only tags that are included here ex. "@wip"  , ex."@wip or @smoke" , ex."@wip and @smoke" , ex. "@wip and not @smoke"
)

public class Runner {
}


