package com.MyStore.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount {
	
	WebDriver ldriver;
	
	public MyAccount(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//input[@id='email_create']")
	WebElement createEmailId;
	
	@FindBy(id = "SubmitCreate")
	WebElement submitCreate;
	
	public void enterCreateEmailAddress(String email) {
		createEmailId.sendKeys(email);
	}
	
	public void clickSubmitCreate() {
		submitCreate.click();
	}

}
