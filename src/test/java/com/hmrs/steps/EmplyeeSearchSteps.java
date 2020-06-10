package com.hmrs.steps;

import com.hrms.utels.CommonMethods;
import com.hrms.utels.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmplyeeSearchSteps extends CommonMethods {

	@When("user is logged with valid admin credentials")
	public void loginCreden() {
		login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
	}

	@Given("user navigate to employee list page")
	public void user_navigate_to_employee_list_page() {
		jsClick(dashboard.PIM);
		jsClick(dashboard.empListPage);

	}

	@When("user enters valid employee id")
	public void user_enters_valid_employee_id() {
		sendText(viewEmp.employeeID, "1453");

	}

	@When("click on search button")
	public void click_on_search_button() {
		jsClick(viewEmp.searchBotton);
	}

	@Then("user see employee information is displayed")
	public void user_see_employee_information_is_displayed() {
		System.out.println("employee is displayed");
		
      tearDown();
	}
	@When("user enters valid employee name and last name")
	public void user_enters_valid_employee_name_and_last_name() {
	    
	}


	
}
