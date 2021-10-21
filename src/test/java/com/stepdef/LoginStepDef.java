package com.stepdef;

import org.junit.Assert;
import org.openqa.selenium.TakesScreenshot;

import com.pages.LoginPage;
import com.util.TestUtil;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;


public class LoginStepDef {
	
        LoginPage login;
		@Given("user is on login page")
		public void user_is_on_login_page() {
		 login=new LoginPage();
		 login.clickEmail();
		 
		}


		

		@When("user enters {string} & {string}")
		public void user_enters(String user, String pw) {
		   login.enterUserName(user);
		   login.enterPassword(pw);
		}
		@When("user clicks on submit")
		public void user_clicks_on_submit() {
		    login.clickSubmit();
		}
		@Then("user is on same page")
		public void user_is_on_same_page() {
		   
		   Assert.assertTrue(login.getTitle().contains("Online Shopping India"));
		}
		
		@After
		public void tearDown(Scenario scenario)
		{
			boolean result=scenario.isFailed();
			if(result==true)
			{
				TestUtil.takeSS();	
			}
		}




}
