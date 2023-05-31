package io.cucumber.skeleton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
    @Given("I have {int} cakes in my belly")
    public void I_have_cakes_in_my_belly(int cukes) {
        Belly belly = new Belly();
        belly.eat(cukes);
    }
    @When("I wait {int} hour")
    public void i_wait_hour(Integer int1) {
        System.out.println("Wait 1 hour");
    }
    @Then("my belly should growl")
    public void my_belly_should_growl() {
        System.out.println("Belly Grows");
    }
}
