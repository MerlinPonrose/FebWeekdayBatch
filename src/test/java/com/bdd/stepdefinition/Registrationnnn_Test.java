package com.bdd.stepdefinition;

import com.bdd.utility.TestExecutor;

import cucumber.api.java.en.When;

public class Registrationnnn_Test extends TestExecutor{
	
	
	@When("user clicks on the firstname and enter the value {string}")
	public void user_clicks_on_the_firstname_and_enter_the_value(String string) {
	  reg.enterFirstName();
	}

	@When("user clicks on the lastname and enters the value {string}")
	public void user_clicks_on_the_lastname_and_enters_the_value(String string) {
	   reg.enterLastName();
	}

	@When("user click on the address field and enters the value {string}")
	public void user_click_on_the_address_field_and_enters_the_value(String string) {
	  
		reg.enterAdd();
	}


}
