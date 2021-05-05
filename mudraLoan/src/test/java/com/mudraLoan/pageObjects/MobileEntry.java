package com.mudraLoan.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.api.robot.Key;

public class MobileEntry {

	WebDriver ldriver;

	public MobileEntry(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	

	@FindBy(xpath = "//*[@id=\"mat-input-0\"]")
	WebElement mobileNumber;

	@FindBy(xpath = "//*[@id=\"mat-input-1\"]")
	WebElement mobileNumberOTP;

	@FindBy(xpath = "//*[@id=\"mat-checkbox-1\"]/label/div")
	WebElement privacyPolicyRadioBtn;

	@FindBy(xpath = "/html/body/app-root/app-basic-details/app-login/div/form/div/div/div[2]/mat-card/mat-card-actions/button/span[1]")
	WebElement submitOTPBtn;

	public void acceptMobileNumber(String mNumber) throws InterruptedException

	{
		
		mobileNumber.sendKeys(String.valueOf(mNumber));
		Thread.sleep(500);
		mobileNumber.sendKeys(Key.TAB);
	}

	public void acceptOTP(String mNumberOTP)

	{
		mobileNumberOTP.sendKeys(String.valueOf(mNumberOTP));
	}

	public void clickprivacyPolicyRadioBtn() {
		privacyPolicyRadioBtn.click();
	}

	public void clicksubmitOTPBtn() {
		submitOTPBtn.click();
	}

}
