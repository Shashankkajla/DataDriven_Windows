package com.qa.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.SignUp;

public class SignUpTest extends TestBase {
	SignUp  signUp;
	SignUpTest signUpTest;

	
	public SignUpTest()
	{super();}
	
	
	@BeforeTest
	public void setUp()
	{
		initilization();
		signUp = new SignUp();
		signUpTest = new SignUpTest();
	}
	
	@Test
	public void fillForm()
	{
		signUp.formData_1();
		signUp.formData_2();
		signUp.formData_3();
		signUp.formData_4();
		signUp.formData_5();
		signUp.formData_6();
		signUp.formData_7();
		signUp.click_CreateAccount();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	

}
