package co.uk.zooplaa.stepDefinitions;

import co.uk.zooplaa.pages.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ForSaleSearchSteps extends BasePage

{
    @Given("I navigate to Zoopla.co.uk")
    public void i_navigate_to_Zoopla_co_uk() {
launchURL();
    }

    @Given("the To Buy tab is highlighted")
    public void the_To_Buy_tab_is_highlighted() {

    }

    @When("I enter a {string} in the search bar")
    public void i_enter_a_in_the_search_bar(String location) {

    }

    @When("I select {string} from the Min dropdown")
    public void i_select_from_the_Min_dropdown(String minimum) {

    }

    @When("I select {string} from the Max dropdown")
    public void i_select_from_the_Max_dropdown(String price) {

    }

    @When("I select {string} from the Property dropdown")
    public void i_select_from_the_Property_dropdown(String property) {

    }

    @When("I select {string} from the rooms dropdown")
    public void i_select_from_the_rooms_dropdown(String rooms) {

    }

    @When("I click on the Search button")
    public void i_click_on_the_Search_button() {

    }


    @Then("all the {string} within the selected {string} are displayed")
    public void allTheWithinTheSelectedAreDisplayed(String arg0, String arg1) {

    }

    @And("I click on any")
    public void iClickOnAny() {
    }

    @And("I accept all cookies")
    public void iAcceptAllCookies() {

    }
}
