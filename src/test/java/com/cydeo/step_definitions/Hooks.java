package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

//    @Before is coming from cucumber. It is running before each scenario
    @Before
    public void setUpScenario(){
        System.out.println("--> It is coming from @Before in Hooks");
    }

//   @After is coming from cucumber. It is running after each scenario
    @After
    public void tearDownScenario(){
        System.out.println("--> It is coming from @After in Hooks");

        byte [] screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

        Driver.closeDriver();
    }

}
