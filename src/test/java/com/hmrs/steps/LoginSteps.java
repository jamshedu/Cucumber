package com.hmrs.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.hrms.utels.CommonMethods;
import com.hrms.utels.ConfigsReader;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends CommonMethods {
	
	@Given("user is logged with valid admin credentials")
	public void user_is_logged_with_valid_admin_credentials() {
	  sendText(login.username, ConfigsReader.getProperty("username"));
	  sendText(login.password, ConfigsReader.getProperty("password"));
	  click(login.loginBtn);
	}
	
	
	@When("user enter valild admin username and password")
	public void user_enter_valild_admin_username_and_password() {
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		
	   
	}

	@When("user enter login on button")
	public void user_enter_login_on_button() {
		click(login.loginBtn);
	   
	}

	@Then("admin user is successfully logged in")
	public void admin_user_is_successfully_logged_in() {
	   String expected="Welcome Admin";
	   String actual=dashboard.welcome.getText();
	   Assert.assertEquals("Welcome message is not displyed",expected, actual);
	}

	@When("user enter valid jamshed99 username and password")
	public void user_enter_valid_jamshed99_username_and_password() {
	   sendText(login.username, "jamshed99");
	   sendText(login.password, "Umarov88$");
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
	 click(login.loginBtn);
	}

	@Then("jamshed99 user is successfully logged in")
	public void jamshed99_user_is_successfully_logged_in() {
	   String expected="Welcome Jamshed";
	   String actual=dashboard.welcomJames.getText();
	   Assert.assertEquals(expected, actual,"The actual message is not displyed");
	}
	
	@When("user enter valid {string} and {string}")
	public void user_enter_valid_and(String string, String string2) {
	   
	}

	@Then("{string} is successfully logged in")
	public void is_successfully_logged_in(String string) {
	    
	}
	@When("User enter valid username and invalid password")
	public void user_enter_valid_username_and_invalid_password() {
	  sendText(login.username, "Orzu1988");
	  sendText(login.password, "jamshed88$");
	}

	@Then("User see Invalid Credentials text on login page")
	public void user_see_Invalid_Credentials_text_on_login_page() {
	   
	}
	@When("I enter invalid username and password and see error message")
	public void i_enter_invalid_username_and_password_and_see_error_message(DataTable inavalidCredentials) {
		List<Map<String, String>> list = inavalidCredentials.asMaps();
		for(Map<String, String> map:list) {
			sendText(login.username, map.get("UserName"));
			sendText(login.password, map.get("Password"));
			click(login.loginBtn);
			
			Assert.assertEquals("Not correct error message is displayed", map.get("ErrorMessage"), login.errorMsg.getText());
		
		}
	}
}
	
	
	
	
	
//	@Given("user is logged with valid admin credentials")
//	public void user_is_logged_with_valid_admin_credentials() {
//	  sendText(login.username, ConfigsReader.getProperty("username"));
//	  sendText(login.password, ConfigsReader.getProperty("password"));
//	  click(login.loginBtn);
//	}
//
//	@When("user enter valid admin username and password")
//	public void user_enter_valid_admin_username_and_password() {
//		 sendText(login.username, ConfigsReader.getProperty("username"));
//		  sendText(login.password, ConfigsReader.getProperty("password"));
//	}
//
//	@When("user click on login button")
//	public void user_click_on_login_button() {
//	  click(login.loginBtn);
//	}
//
//	@Then("admin user is successfully logged in")
//	public void admin_user_is_successfully_logged_in() {
//		String expected = "Welcome Admin";
//		String actual = dashboard.welcome.getText();
//		Assert.assertEquals("Welcome message is not displayed or not correct ", expected, actual );
//		System.out.println(actual);
//	}
//
//	@When("user enter valid ess username and password")
//	public void user_enter_valid_ess_username_and_password() {
//		 sendText(login.username, "Gince123");
//		 sendText(login.password, "SyntaxHrm123!");
//	}
//
//	@Then("ess user is successfully logged in")
//	public void ess_user_is_successfully_logged_in() {
//		String expected = "Welcome Elvira";
//		String actual = dashboard.welcome.getText();
//		Assert.assertEquals("Welcome text is NOT displayed correctly", expected, actual);
//	}
//
//	@When("User enter valid username and invalid password")
//	public void user_enter_valid_username_and_invalid_password() {
//		 sendText(login.username, "Elvira");
//		 sendText(login.password, "Syntax123.....");
//	}
//
//	@Then("User see Invalid Credentials text on login page")
//	public void user_see_Invalid_Credentials_text_on_login_page() {
//	    
//	}
//	
//	@When("I enter invalid username and password and see error message")
//	public void i_enter_invalid_username_and_password_and_see_error_message(DataTable inavalidCredentials) {
//		List<Map<String, String>> list = inavalidCredentials.asMaps();
//		for(Map<String, String> map:list) {
//			sendText(login.username, map.get("UserName"));
//			sendText(login.password, map.get("Password"));
//			click(login.loginBtn);
//			
//			Assert.assertEquals("Not correct error message is displayed", map.get("ErrorMessage"), login.errorMsg.getText());
//		
//		}
	

//
//	@When("user loged in with valid username")
//	public void user_loged_in_with_valid_username() {
//	    sendText(login.username, ConfigsReader.getProperty("username"));
//	}
//
//	@When("user enters invalid password")
//	public void user_enters_invalid_password() {
//	   sendText(login.password, "Admin123"); 
//	}
//
//	@When("click on login button")
//	public void click_on_login_button() {
//	   click(login.loginBtn);
//	}
//
//	@Then("user see {string} error message")
//	public void user_see_error_message(String expected) {
//		
//		String actual=dashboard.invalidPassword.getText();
//		Assert.assertEquals("The message is not there",expected, actual);
//	   
//	}
//
//	@When("user enters valid username")
//	public void user_enters_valid_username() {
//	  sendText(login.username, ConfigsReader.getProperty("username"));
//	}
//
//	@When("user enters empty password")
//	public void user_enters_empty_password() {
//	   sendText(login.password, "");
//	}
//
//	@Then("user see {string}")
//	public void user_see(String expected) {
//	  String actual=dashboard.passEmpty.getText(); 
//	}
//
//	@When("user enters empety username")
//	public void user_enters_empety_username() {
//	   sendText(login.username, "");
//	}
//
//	@When("user enters valid password")
//	public void user_enters_valid_password() {
//	   sendText(login.password, ConfigsReader.getProperty("password")); 
//	}
//
//	@When("click on ligin button")
//	public void click_on_ligin_button() {
//	click(login.loginBtn);
//	}


