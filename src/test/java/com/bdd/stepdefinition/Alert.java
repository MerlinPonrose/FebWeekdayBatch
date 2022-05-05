package com.bdd.stepdefinition;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.bdd.pages.Alert_Page;
import com.bdd.utility.TestExecutor;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Alert extends TestExecutor{
	
	
	
	
	@Given("User launches chrome browser and open alert page URL {string}")
	public void launchBrowser(String url) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karen Amy\\eclipse-workspace\\FebSeleniumProject\\exe\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize(); //maximize window
		driver.get(url); 
		
	}

	@When("User clicks on the button to open alert")
	public void user_clicks_on_the_button_to_open_alert() throws InterruptedException {
		
		alert.clickAlertBoxButton();
	
	}

	@When("User switches to alert")
	public void user_switches_to_alert() throws InterruptedException {
	 alert.switchToalert();
	
	}

	@When("User click ok button in alert")
	public void user_click_ok_button_in_alert() {
		
	alert.accept_alert();
	}

	@Then("User verifies the title of alert page is {string}")
	public void user_verifies_the_title_of_alert_page(String expectedTile) {
	   
		alert.validatePageTitle(expectedTile);
		
	}
	
	
	@Then("validate last step {string}")
	public void test(String value)
	{
		System.out.println("Last step"+value);
	}


}
