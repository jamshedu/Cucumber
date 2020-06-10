package com.hmrs.steps;

import org.junit.Assert;

import com.hrms.utels.CommonMethods;
import com.hrms.utels.ConfigsReader;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends CommonMethods {

	@When("user loged in with valid username")
	public void user_loged_in_with_valid_username() {
	    sendText(login.username, ConfigsReader.getProperty("username"));
	}

	@When("user enters invalid password")
	public void user_enters_invalid_password() {
	   sendText(login.password, "Admin123"); 
	}

	@When("click on login button")
	public void click_on_login_button() {
	   click(login.loginBtn);
	}

	@Then("user see {string} error message")
	public void user_see_error_message(String expected) {
		
		String actual=dashboard.invalidPassword.getText();
		Assert.assertEquals("The message is not there",expected, actual);
	   
	}

	@When("user enters valid username")
	public void user_enters_valid_username() {
	  sendText(login.username, ConfigsReader.getProperty("username"));
	}

	@When("user enters empty password")
	public void user_enters_empty_password() {
	   sendText(login.password, "");
	}

	@Then("user see {string}")
	public void user_see(String expected) {
	  String actual=dashboard.passEmpty.getText(); 
	}

	@When("user enters empety username")
	public void user_enters_empety_username() {
	   sendText(login.username, "");
	}

	@When("user enters valid password")
	public void user_enters_valid_password() {
	   sendText(login.password, ConfigsReader.getProperty("password")); 
	}

	@When("click on ligin button")
	public void click_on_ligin_button() {
	click(login.loginBtn);
	}

}
