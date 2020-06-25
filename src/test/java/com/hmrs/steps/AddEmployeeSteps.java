package com.hmrs.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.hrms.utels.CommonMethods;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddEmployeeSteps extends CommonMethods{
	
	
	
	
	@Given("user navigates to AddEmployeePage")
	public void user_navigates_to_AddEmployeePage() {
		dashboard.navigateToAddEmployee();
	}

	// this method has hardcoded values
	@When("user enters employees first name and last name")
	public void user_enters_employees_first_name_and_last_name() {
		sendText(addEmp.FirstName, "Farid");
		sendText(addEmp.lastName, "Smith");
	}

	// this method is enhanced method and parameter values are supplied from FF
	@When("user enters employees {string} and {string}")
	public void user_enters_employees_first_name_and_last_name(String firstName, String lastName) {
		sendText(addEmp.FirstName, firstName);
		sendText(addEmp.lastName, lastName);
	}

	@When("user clicks save button")
	public void user_clicks_save_button() {
		click(addEmp.buttonSave);
	}

	// this method has hardcoded values
	@Then("employee is added successfully")
	public void employee_is_added_successfully() {
		String actual = pdetails.natiinaleDD.getText();
		String expectedName = "James Smith";
		Assert.assertEquals(expectedName, actual);
	}

	// this method is enhanced method and parameter values are supplied from FF
	@Then("{string} is added successfully")
	public void employee_is_added_successfully(String expectedName) {
		String actual =dashboard.profilePic.getText();
		Assert.assertEquals(expectedName, actual);
	}

	@When("user deletes employee id")
	public void user_deletes_employee_id() {
		addEmp.employeeId.clear();
	}

	@When("user clicks on create login checkbox")
	public void user_clicks_on_create_login_checkbox() {
		jsClick(addEmp.cridentialsButtom);
	}

	@When("user enters login credentials")
	public void user_enters_login_credentials() {
		
	}

	@When("user enter employees {string}, {string} and {string}")
	public void enteringEmployee(String fName, String mName, String lName) {
		sendText(addEmp.FirstName, fName);
		sendText(addEmp.middleName, mName);
		sendText(addEmp.lastName, lName);
	}

	@Then("{string}, {string} and {string} is added successfully")
	public void and_is_added_successfully(String fname, String middleName, String laName) {
		System.out.println("I added the employee !!!!!!!!!!!!!!!!!!!!!!!");
		wait(2);
	}

	@When("user enters employee details and click on save then employee is added")
	public void user_enters_employee_details_and_click_on_save(DataTable dataTable) {
		
		List<Map<String, String>> addEmployeeList=dataTable.asMaps();
		
		for(Map<String, String> map:addEmployeeList) {
			
			String fname=map.get("Firstname");
			String mname=map.get("MiddleName");
			String lname=map.get("LastName");
			
			sendText(addEmp.FirstName, fname);
			sendText(addEmp.middleName, mname);
			sendText(addEmp.lastName, lname);
			click(addEmp.buttonSave);
			//adding assertion
			
			String actual=addEmp.profilePic.getText();
			String expected=fname+" "+mname+" "+lname;
			Assert.assertEquals("Employee is not addedd successfully", expected, actual);
			jsClick(dashboard.addEmp);
			wait(5);
		}
	}
	
	@Then("employee is added")
	public void employee_is_added() {
		System.out.println("-----Employee is added using datatable");
	}

//@Given("user navigate to AddEmployeePage")
//public void user_navigate_to_AddEmployeePage() {
//	 dashboard.navigateToAddEmployee();
//}
//
//@When("user enters employees first name and last name")
//public void user_enters_employees_first_name_and_last_name() {
//	 sendText(addEmp.FirstName, "Navruz");
//	   sendText(addEmp.lastname, "SmithJ");
//}
//
//@When("user clicks save button")
//public void user_clicks_save_button() {
//	click(addEmp.buttonSave);
//}
//
//@Then("employee is added successfully")
//public void employee_is_added_successfully() {
//	wait(3);
//	String actual=addEmp.profilePic.getText();
//	String expected="Navruz SmithJ";
//	Assert.assertEquals(expected, actual);
//}
//
//
//@When("user click on create login checkbox")
//public void user_click_on_create_login_checkbox() {
//   jsClick(addEmp.cridentialsButtom);
//}
//
//@When("user enters login creadentials")
//public void user_enters_login_creadentials() {
//    sendText(addEmp.creditUserName, "Jamshed99");
//    sendText(addEmp.creditPassWord, "jamsheD88$");
//    sendText(addEmp.credReEnterPassWord, "jamsheD88$");
//}
//


	
	
	
	
	
	
	
	
//	
//	
//	@Given("user navigate to AddEmployeePage")
//	public void user_navigate_to_AddEmployeePage() {
//	   dashboard.navigateToAddEmployee();
//	}
//
//	@When("user enters employees first name and last name")
//	public void user_enters_employees_first_name_and_last_name() {
//	   sendText(addEmp.FirstName, "Navruz");
//	   sendText(addEmp.lastname, "SmithJ");
//	}
//
//	@When("user clicks save button")
//	public void user_clicks_save_button() {
//	  click(addEmp.buttonSave);
//	}
//
//	@Then("user is added successfully")
//	public void user_is_added_successfully() {
//		String actual=addEmp.profilePic.getText();
//		String expected="Navruz SmithJ";
//		Assert.assertEquals(expected, actual);
//	    
//	}
//
//	@Given("user logins with valid admin credentials")
//	public void user_logins_with_valid_admin_credentials() {
//	   addEmp.idEmpoyee.clear();
//	}
//
////	@Given("user navigates to AddEmployeePage")
////	public void user_navigates_to_AddEmployeePage() {
////	  addEmp.
////	}
//
//	
	
	
	

}
