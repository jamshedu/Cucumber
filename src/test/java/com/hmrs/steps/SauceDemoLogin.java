
package com.hmrs.steps;

import com.hrms.utels.CommonMethods;
import com.hrms.utels.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SauceDemoLogin extends CommonMethods{
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		ConfigsReader.getProperty("url");
	}

//	@When("user enter username")
//	public void user_enter_username() {
//	  sendText(sauceLogin.userName, "Admin");
//	}

	@When("user enter invalid password")
	public void user_enter_invalid_password() {
	   sendText(sauceLogin.password, "jamshed88");
	}

	@When("click on login button")
	public void click_on_login_button() {
	    click(sauceLogin.LoginBTN);
	}

	@Then("user should see the error message")
	public void user_should_see_the_error_message() {
		System.err.println("error message displayed");
	}
	@When("user enter invalid username {string}")
	public void user_enter_invalid_username(String userNM) {
		sendText(sauceLogin.userName, userNM);
		  
	}

	@When("user enter invalid invalid password {string}")
	public void user_enter_invalid_invalid_password(String passWord) {
		sendText(sauceLogin.password, passWord);
	}

}