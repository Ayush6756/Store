package com.MyStore.TestCase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.MyStore.Utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig readConfig = new ReadConfig();
	String url = readConfig.getBaseURL();
	String browser = readConfig.getBrowser();
	
	public static WebDriver driver;
	
	@BeforeClass
	public void setup() {
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterClass
	public void tearDown() {
//		driver.quit();
	}
	
	
	

}
