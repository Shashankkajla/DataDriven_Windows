package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.util.TestUtil;

public class TestBase {

	
	public static Properties prop;
	public static WebDriver driver;

	public TestBase()
	{
		prop = new Properties();
		
		try{
		FileInputStream ip = new FileInputStream("D:\\FrameWorks\\DataDrivenProj\\src\\main\\java\\com"
				+ "\\qa\\config\\config.properties");
		prop.load(ip);
		}
	    catch(FileNotFoundException e){
	    e.printStackTrace();
	    }
	    catch(IOException e){
	    e.printStackTrace();
	    }
	}

	public static void initilization()
	{
		String browsername = prop.getProperty("browser");
	   
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", ".\\browser\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if(browsername.equals("FF"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Driv\\geckodriver.exe");
			//driver = new FireFoxDriver();
			
		}

		  driver.manage().deleteAllCookies();
		  driver.manage().window().maximize();
		  driver.get(prop.getProperty("url"));
		  driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUTS, TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICITLY_WAIT, TimeUnit.SECONDS);
		
		
	}
}

