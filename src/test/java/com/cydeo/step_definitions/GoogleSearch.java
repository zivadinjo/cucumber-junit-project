package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.junit.Assert;

public class GoogleSearch {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @Given("User is on Google search page")
    public void user_is_on_google_search_page() {
        Driver.getDriver().get("https://www.google.com/");
    }
    @When("User types apple in the google search box and click enter")
    public void user_types_apple_in_the_google_search_box_and_click_enter() {
        googleSearchPage.searchBox.sendKeys("apple" + Keys.ENTER);
    }
    @Then("User sees apple - Google Search is in the google title")
    public void user_sees_apple_google_search_is_in_the_google_title() {
        Assert.assertEquals("Title verification failed!","apple - Google Search",Driver.getDriver().getTitle());

    }

}
