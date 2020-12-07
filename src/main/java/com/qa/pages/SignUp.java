package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.base.TestBase;
import com.qa.excelutil.Xls_Reader;

public class SignUp extends TestBase {
	
	Xls_Reader reader = new Xls_Reader("D:\\FrameWorks\\DataDrivenProj\\src\\main\\java\\com\\qa\\testdata\\OracleTestData.xlsx");

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
    
    public SignUp()
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void formData_1()
    {   //reader = new Xls_Reader("D:\\FrameWorks\\DataDrivenProj\\src\\main\\java\\com\\qa\\testdata\\OracleTestData.xlsx");
    	emailText.sendKeys(reader.getCellData("OracleReg", "emailaddress", 2));
    	pwdText.sendKeys(reader.getCellData("OracleReg", "password", 2));
        repwdText.sendKeys(reader.getCellData("OracleReg", "retypepassword", 2));   
    }
    public void formData_2()
    {   //reader = new Xls_Reader("D:\\FrameWorks\\DataDrivenProj\\src\\main\\java\\com\\qa\\testdata\\OracleTestData.xlsx");
    	Select sel = new Select(selCountry);
    	sel.selectByVisibleText(reader.getCellData("OracleReg", "country", 2));
    }
    public void formData_3()
    {   //reader = new Xls_Reader("D:\\FrameWorks\\DataDrivenProj\\src\\main\\java\\com\\qa\\testdata\\OracleTestData.xlsx");
    	fName.sendKeys(reader.getCellData("OracleReg", "name", 2));
    	LName.sendKeys(reader.getCellData("OracleReg", "lastname", 2));
    } 
    public void formData_4()
    {  // reader = new Xls_Reader("D:\\FrameWorks\\DataDrivenProj\\src\\main\\java\\com\\qa\\testdata\\OracleTestData.xlsx");
    	jTitle.sendKeys(reader.getCellData("OracleReg", "jobTitle", 2));
    	wNo.sendKeys(reader.getCellData("OracleReg", "workPhone", 2));
    }
    public void formData_5()
    {   //reader = new Xls_Reader("D:\\FrameWorks\\DataDrivenProj\\src\\main\\java\\com\\qa\\testdata\\OracleTestData.xlsx");
    	compName.sendKeys(reader.getCellData("OracleReg", "compName", 2));
    	addLinl.sendKeys(reader.getCellData("OracleReg", "add1", 2));
    }	
    public void formData_6()
    {   //reader = new Xls_Reader("D:\\FrameWorks\\DataDrivenProj\\src\\main\\java\\com\\qa\\testdata\\OracleTestData.xlsx");
    	addLin2.sendKeys(reader.getCellData("OracleReg", "add2", 2));
    	city.sendKeys(reader.getCellData("OracleReg", "city", 2));   	
    }
    public void formData_7()
    {   //reader = new Xls_Reader("D:\\FrameWorks\\DataDrivenProj\\src\\main\\java\\com\\qa\\testdata\\OracleTestData.xlsx");
    	Select sel1 = new Select(state);
    	sel1.selectByVisibleText(reader.getCellData("OracleReg", "state", 2));
    	postalCode.sendKeys(reader.getCellData("OracleReg", "postalcode", 2));
    }  
    public void click_CreateAccount()
    {
    	clickCreateAccount.click();
    }
    
 }
