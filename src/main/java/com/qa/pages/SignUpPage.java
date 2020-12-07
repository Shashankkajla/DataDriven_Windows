package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.base.TestBase;

public class SignUpPage extends TestBase
  {

	    //OR
    @FindBy(xpath="//input[@name='email']")
    WebElement emailText; 
    @FindBy(xpath="//input[@name='password']")
    WebElement pwdText; 
    @FindBy(xpath="//input[@name='retypePassword']")
    WebElement repwdText; 
	
    @FindBy(xpath="//select[@name='country']") 
    WebElement selCountry; 
    @FindBy(xpath="//input[@name='firstName']") 
    WebElement fName;
    @FindBy(xpath="//input[@name='lastName']") 
    WebElement LName;   
    
    @FindBy(xpath="//input[@name='jobTitle']") 
    WebElement jTitle;   
    @FindBy(xpath="//input[@name='workPhone']") 
    WebElement wNo;
    @FindBy(xpath="//input[@name='companyName']") 
    WebElement compName;
    
    @FindBy(xpath="//input[@name='address1']") 
    WebElement addLinl;
    @FindBy(xpath="//input[@name='address2']") 
    WebElement addLin2;
    @FindBy(xpath="//input[@name='city']") 
    WebElement city;
    @FindBy(xpath="//select[@name='state']") 
    WebElement state; 
    
    @FindBy(xpath="//input[@name='postalCode']") 
    WebElement postalCode;
    @FindBy(xpath="//tbody/tr[29]/td[2]/div[1]/a[1]")
    WebElement clickCreateAccount;
    
    public SignUpPage()
    {
    	PageFactory.initElements(driver, this);
    }
    
      
    public String getTitle()
    {
    	return driver.getTitle();
    }
    
    public void formData1(String e_mail, String pwd, String repwd)
    {
    	emailText.sendKeys(e_mail);
    	pwdText.sendKeys(pwd);
        repwdText.sendKeys(repwd);
    }
    public void formData2()
    {
    	Select sel = new Select(selCountry);
    	sel.selectByVisibleText("India");
    }
    public void formData3(String f_name, String l_name)
    {
    	fName.sendKeys(f_name);
    	LName.sendKeys(l_name);
    } 	
    public void formData4(String j_titl, String w_ph)
    {
    	jTitle.sendKeys(j_titl);
    	wNo.sendKeys(w_ph);
    }
    public void formData5(String c_name, String ad_1)
    {
    	compName.sendKeys(c_name);
    	addLinl.sendKeys(ad_1);
    }	
    public void formData6(String ad_2, String city_name)
    {
    	addLin2.sendKeys(ad_2);
    	city.sendKeys(city_name);
    	
    }
    public void formData7(String post_code)
    {
    	Select sel1 = new Select(state);
    	sel1.selectByVisibleText("Delhi");
    	postalCode.sendKeys(post_code);

    }  
    public void clickCreateAccount()
    {
    	clickCreateAccount.click();
    }
    
    
    
    
    
    
    
    
    
}
