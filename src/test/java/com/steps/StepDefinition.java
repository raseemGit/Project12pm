package com.steps;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import com.global.Library;
import com.pages.LoginPageObjects;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends Library {

	public WebDriver driver;

	@Given("user launch chrome browser")
	public void user_launch_chrome_browser() {

		System.out.println("user launch chrome browser");
		driver = launchBrowser();

	}

	@Given("user enter url")
	public void user_enter_url() {
		System.out.println("user enter url");
		 loadUrl("https://www.facebook.com/");
	}

	// 2d List

	/*
	 * @When("user enter userName and password") public void
	 * user_enter_userName_and_password(io.cucumber.datatable.DataTable twodList) {
	 * 
	 * List<List<String>> li = twodList.asLists();
	 * 
	 * LoginPageObjects obj = new LoginPageObjects();
	 * 
	 * typeValue(obj.getTxtUser(), li.get(0).get(2)); typeValue(obj.getTxtPass(),
	 * li.get(2).get(1));
	 * 
	 * }
	 */

	// 2d map
	@When("user enter userName and password")
	public void user_enter_userName_and_password(io.cucumber.datatable.DataTable twdMap) {

		List<Map<String, String>> mp = twdMap.asMaps();

		LoginPageObjects obj = new LoginPageObjects();
		
		  typeValue(obj.getTxtUser(), mp.get(2).get("name"));
		 typeValue(obj.getTxtPass(), mp.get(1).get("emailid"));
		 
		System.out.println("user enter userName and password");
	}

	/*
	 * @When("user enter valid credintial") public void
	 * user_enter_valid_credintial() {
	 * 
	 * }
	 */

	@Then("user click login button")
	public void user_click_login_button() {

		
		  LoginPageObjects obj = new LoginPageObjects();
		  
		  clickIt(obj.getLogButton());
		 

		System.out.println("user click login button");
	}

	@Then("user validate test")
	public void user_validate_test() {
		System.out.println("TEst PAss");
	}

	/*@When("user enter {string} and {string}")
	public void user_enter_and(String s1, String s2) {

		LoginPageObjects obj = new LoginPageObjects();

		typeValue(obj.getTxtUser(), s1);
		typeValue(obj.getTxtPass(), s2);

	}*/
	/*
	@Then("user validate test scenario two")
	public void user_validate_test_scenario_two() {
	    Assert.assertTrue(true);
	}*/

	/*
	 * @When("user enter invalid credintial one") public void
	 * user_enter_invalid_credintial_one() {
	 * System.out.println("user enter invalid credintial one"); }
	 * 
	 * @When("user enter invalid credintial two") public void
	 * user_enter_invalid_credintial_two() {
	 * System.out.println("user enter invalid credintial two"); }
	 */

}
