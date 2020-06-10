package com.hmrs.steps;

import org.junit.Assert;

import com.hrms.utels.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddEmployeeSteps extends CommonMethods{
	

@Given("user navigate to AddEmployeePage")
public void user_navigate_to_AddEmployeePage() {
	 dashboard.navigateToAddEmployee();
}

@When("user enters employees first name and last name")
public void user_enters_employees_first_name_and_last_name() {
	 sendText(addEmp.FirstName, "Navruz");
	   sendText(addEmp.lastname, "SmithJ");
}

@When("user clicks save button")
public void user_clicks_save_button() {
	click(addEmp.buttonSave);
}

@Then("employee is added successfully")
public void employee_is_added_successfully() {
	wait(3);
	String actual=addEmp.profilePic.getText();
	String expected="Navruz SmithJ";
	Assert.assertEquals(expected, actual);
}


@When("user click on create login checkbox")
public void user_click_on_create_login_checkbox() {
   jsClick(addEmp.cridentialsButtom);
}

@When("user enters login creadentials")
public void user_enters_login_creadentials() {
    sendText(addEmp.creditUserName, "Jamshed99");
    sendText(addEmp.creditPassWord, "jamsheD88$");
    sendText(addEmp.credReEnterPassWord, "jamsheD88$");
}



	
	
	
	
	
	
	
	
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
