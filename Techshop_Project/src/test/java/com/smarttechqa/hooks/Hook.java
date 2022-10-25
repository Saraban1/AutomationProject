package com.smarttechqa.hooks;

import java.io.IOException;

import com.smarttechqa.basepage.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends BaseClass {

	@Before
	public static void  initialize() throws IOException //starts browser
	{
		BaseClass.initializeProperties();
		BaseClass.setUp();
	}
	
	@After
	public static void tearDown()  //done after each scenario
	{
		driver.quit(); //will run after every scenario
	}
}
