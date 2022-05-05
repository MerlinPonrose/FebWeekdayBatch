package com.bdd.stepdefinition;

import com.bdd.utility.TestExecutor;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends TestExecutor{
	
	//global
	@Before(order=2)
	public void test1()
	{
		System.out.println("data set up");
	}

	@Before(order=1)
	public void test3()
	{
		System.out.println("DB connectivty");
	}
	
	@After(order=2)
	public void test2()
	{
		System.out.println("post condition 2");
		driver.quit();
	}
	
	
	@After(order=1)
	public void test4()
	{
		System.out.println("post condition 1");
	}
	
	@Before("@smoke")
	public void test5()
	{
		System.out.println("pre condition to smoke test case");
	}
}
