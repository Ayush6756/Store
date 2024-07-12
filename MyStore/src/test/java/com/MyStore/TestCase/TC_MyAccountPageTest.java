package com.MyStore.TestCase;

import org.testng.annotations.Test;

import com.MyStore.PageObject.IndexPage;
import com.MyStore.PageObject.MyAccount;
import com.MyStore.PageObject.MyAccountCreation;

public class TC_MyAccountPageTest extends BaseClass {
	
	@Test
	public void verifyRegistrationAndLogin() throws InterruptedException {
		
		driver.get(url);
		IndexPage ip = new IndexPage(driver);
		ip.clickOnSignIn();
		
		MyAccount ma = new MyAccount(driver);
		ma.enterCreateEmailAddress("Ayush123@gmail.com");
		ma.clickSubmitCreate();
		
		MyAccountCreation accCreation = new MyAccountCreation(driver);
		accCreation.getTitle();
		accCreation.firstName("Ayush");
		accCreation.lastName("Srivastava");
		accCreation.password("Ayush1234");
		accCreation.selectDate("7", "May", "1998");
		accCreation.clickOnRegister();
	}

}
