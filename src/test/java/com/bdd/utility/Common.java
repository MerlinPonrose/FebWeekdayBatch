package com.bdd.utility;

import org.openqa.selenium.By;

public class Common extends TestExecutor{
	
	
	public void ElementClick(By loc)
	{
		driver.findElement(loc).click();
	}
	
	
	public void sendValue(By loc,String value)
	{
		driver.findElement(loc).click();
		driver.findElement(loc).clear();
		driver.findElement(loc).sendKeys(value);
		
	}
	
	
	public void validateRadioButton(By loc)
	{
	if(	driver.findElement(loc).isSelected())
	{
		System.out.println("Radio button selected");
	}
	else
	{
		System.out.println("not selcted");
	}
	}

	
	public void validatePageTitle(String expectedValue)
	{
		String currentTitle = driver.getTitle();
		
		if(currentTitle.equalsIgnoreCase(expectedValue))
		{
			System.out.println("Page title is displayed as expected");
		}
		
		else
		{
			System.out.println("not expected");
		}
	}
}
