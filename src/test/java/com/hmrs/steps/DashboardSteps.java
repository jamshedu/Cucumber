package com.hmrs.steps;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.hrms.utels.CommonMethods;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;

public class DashboardSteps extends CommonMethods{
	
	@Then("user see dashboard menu is displayed")
	public void user_see_dashboard_menu_is_displayed(DataTable dataTable) {
		
		List<String>expected=dataTable.asList();
		List<String>actual=new ArrayList<>();
	   for (WebElement el :dashboard.dashMenu) {
		   actual.add(el.getText());
		
	}
	   System.out.println(expected);
	   System.out.println(actual);
	   Assert.assertTrue(actual.equals(expected));
	}


}
