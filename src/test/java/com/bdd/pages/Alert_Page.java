package com.bdd.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bdd.utility.TestExecutor;

public class Alert_Page extends TestExecutor{
	
	
	
	
	public org.openqa.selenium.Alert alert;
	
	
	public static String alertButton = "//button[@class='btn btn-danger']";
	
	
	public static void clickAlertBoxButton() throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement alertbox = driver.findElement(By.xpath(alertButton));
		alertbox.click();
	}
	
	public  void switchToalert() throws InterruptedException
	{
		Thread.sleep(6000);
	alert	 = driver.switchTo().alert();
	}
	

	
	public void accept_alert()
	{
		alert.accept(); 
	}
	
	
	public void validatePageTitle(String expectedTitle)
	{
		com.validatePageTitle(expectedTitle);
	}
}
