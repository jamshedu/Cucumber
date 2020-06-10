package com.hmrs.steps;






import com.hrms.testbase.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;




public class Hooks {
	
	@Before
	public void stard() {
		BaseClass.setUp();
	}
	@After
	public void end() {
		BaseClass.tearDown();
	}

}
