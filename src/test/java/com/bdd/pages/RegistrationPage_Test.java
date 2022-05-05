package com.bdd.pages;

import org.openqa.selenium.By;

import com.bdd.utility.TestExecutor;

public class RegistrationPage_Test extends TestExecutor{
	
	
	public static String FirstName = "//input[@placeholder='First Name']";
	public static String LastName = "//input[@placeholder='Last Name']";
	public static String addr = "textarea";
	
	
	public void enterFirstName()
	{
		com.sendValue(By.xpath(FirstName), "Vcentry");
	}
	
	public void enterLastName()
	{
		com.sendValue(By.xpath(LastName), "Test");
	}
	
	public void enterAdd()
	{
		com.sendValue(By.tagName(addr), "Perungudi");
	}

}
