package com.mudraLoan.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FirstPage {

	WebDriver ldriver;

	public FirstPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "/html/body/app-root/app-basic-details/app-requirements/div/div/div/div[2]/mat-card/mat-card-actions/button")
	WebElement proceedBtn;

	public void clickProceedButton() {
		proceedBtn.click();
	}

}
