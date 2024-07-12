package com.MyStore.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MyAccountCreation {

	WebDriver ldriver;

	public MyAccountCreation(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(css = "#uniform-id_gender1")
	WebElement title;

	@FindBy(css = "#customer_firstname")
	WebElement firstName;

	@FindBy(css = "#customer_lastname")
	WebElement lastName;

	@FindBy(css = "#passwd")
	WebElement password;

	@FindBy(xpath = "//select[@id='days']")
	WebElement days;

	@FindBy(xpath = "//select[@id='months']")
	WebElement months;

	@FindBy(xpath = "//select[@id='years']")
	WebElement years;

	@FindBy(css = "#submitAccount")
	WebElement register;

	public void getTitle() {
		title.click();
	}

	public void firstName(String firstname) {
		firstName.sendKeys(firstname);
	}

	public void lastName(String lastname) {
		lastName.sendKeys(lastname);
	}

	public void password(String passWord) {
		password.sendKeys(passWord);
	}

	public void selectDate(String day, String month, String year) throws InterruptedException {

		Select selectDay = new Select(days);
		selectDay.selectByValue(day);
		
		Thread.sleep(5000);

		Select selectMonth = new Select(months);
		selectMonth.selectByValue(month);
		Thread.sleep(5000);

		Select selectYear = new Select(years);
		selectYear.selectByValue(year);
		Thread.sleep(5000);

	}
	
	public void clickOnRegister() {
		register.click();
	}

}
