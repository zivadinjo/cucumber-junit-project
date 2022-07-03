package com.cydeo.step_definitions;

import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WebTableLoginStepDef {

    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();

    @Given("User is on web table login page")
    public void user_is_on_web_table_login_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("web.app.url"));

    }
    @When("User enters username {string}")
    public void user_enters_username(String username) {

        webTableLoginPage.inputUserName.sendKeys(username);

    }
    @When("User enters password {string}")
    public void user_enters_password(String password) {

        webTableLoginPage.inputPassword.sendKeys(password);

    }
    @Then("User should see url contains orders")
    public void user_should_see_url_contains_orders() {

        webTableLoginPage.loginBtn.click();

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("orders"));

    }
}
