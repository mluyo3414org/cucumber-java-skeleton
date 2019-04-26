package io.cucumber.skeleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;


public class Stepdefs {
    @Given("^I have (\\d+) cukes in my belly$")
    public void I_have_cukes_in_my_belly(int cukes) throws Throwable {
        Belly belly = new Belly();
        belly.eat(cukes);
    }
    @When("I wait {int} hour")
    public void i_wait_hour(Integer int1) {
       System.out.println("I waited");
    }

    @Then("my belly should growl")
    public void my_belly_should_growl() {
        System.out.println("My belly is growling");
    }
    @Given("I have {int} hotdogs in my belly")
    public void i_have_hotdogs_in_my_belly(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("My still have hotdogs in my belly");
    }
}
