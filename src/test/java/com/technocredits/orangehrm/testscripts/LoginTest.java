package com.technocredits.orangehrm.testscripts;

import org.testng.annotations.Test;

public class LoginTest extends CommonTest{
	@Test
	public void Login()
	{
	DoLogin("https://opensource-demo.orangehrmlive.com/", "admin", "admin123");
	}
}
