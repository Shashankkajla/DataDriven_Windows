package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.SignUpPage;
import com.qa.testdata.TestData;

public class SignUpPageTest extends TestBase {
	
	SignUpPageTest signUpPageTest;
	SignUpPage  signUpPage;
	public SignUpPageTest()
	{
		
	}
	
	@BeforeMethod
	public void setUp()
	{
		initilization();
		signUpPage = new SignUpPage();
		signUpPageTest = new SignUpPageTest();
	}
	
	@Test(priority=1)
	public void titleTest()
	{
		String title = signUpPage.getTitle();
		Assert.assertEquals(title, "Oracle | Create Account");
	}
    
	@Test(priority=2)
    public void formFillTest()
    {
		signUpPage.formData1(TestData.email, TestData.password, TestData.repassword);
		signUpPage.formData2();
		signUpPage.formData3(TestData.firstName, TestData.lastName);
		signUpPage.formData4(TestData.jobTitle, TestData.work_No);
		signUpPage.formData5(TestData.compName, TestData.addLine1);
		signUpPage.formData6(TestData.addLine2, TestData.cityName);
		signUpPage.formData7(TestData.postCode);
		signUpPage.clickCreateAccount();
		
    }
	
	@Test(priority=3)
	@Parameters({"email", "pwd", "repwd"})
	//Parameters concept used for environment variables only, the data which remain same through out program ex : configuration data only
	// not for test data purpose.
	public void parameterizationTest(String email, String pwd, String repwd) // pazram used for config environments
	{
		signUpPage.formData1(email, pwd, repwd);
	}
	
	
	@AfterMethod()
	public void tearDown()
	{
		driver.quit();
	}
	

}
