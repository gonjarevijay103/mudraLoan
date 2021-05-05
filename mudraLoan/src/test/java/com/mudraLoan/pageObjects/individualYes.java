package com.mudraLoan.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.Select;

import org.sikuli.api.robot.Key;

public class individualYes {
	WebDriver ldriver;
	Select bc;

	public individualYes(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id = "mat-select-value-1")
	WebElement borrowerConstitutionDD;

	@FindBy(xpath = "//*[@id=\"mat-option-1\"]/span")
	WebElement Individual;
	// individual = //*[@id="mat-option-1"]/span
	// company = //*[@id="mat-option-0"]/span
	// partnership = //*[@id="mat-option-2"]/span
	// sole propritership = //*[@id="mat-option-3"]/span

	@FindBy(xpath = "//*[@id=\"mat-select-value-3\"]/span")
	WebElement acHolderOfBankYesDD;

	@FindBy(xpath = "//*[@id=\"mat-option-5\"]/span")
	WebElement Yes;
	//yes = //*[@id="mat-option-5"]/span
	// no = //*[@id="mat-option-4"]/span

	@FindBy(xpath = "//*[@id=\"mat-input-2\"]")
	WebElement acNumber;

	@FindBy(xpath = "//*[@id=\"mat-input-3\"]")
	WebElement enterOTPBtn;

	@FindBy(xpath = "/html/body/app-root/app-basic-details/app-borrower-details/div/form/div/div/div[2]/mat-card/mat-card-actions/button/span[1]")
	WebElement ProceedBtn;

	public void selectBorrowerConstitution() throws InterruptedException {
		borrowerConstitutionDD.click();
		System.out.println("clciked BC");
		Thread.sleep(1000);

		Individual.click();
		System.out.println("clciked Individual");

	}

	public void selectACHolderofBank() throws InterruptedException {
		// acHolderOfBankYes.click();
		acHolderOfBankYesDD.click();
		System.out.println("clciked acHolderOfBankYesDD");
		Thread.sleep(1000);

		Yes.click();

	}

	public void acceptAccountNumber(String accNumber) throws InterruptedException

	{
		acNumber.sendKeys(String.valueOf(accNumber));
		Thread.sleep(500);
		acNumber.sendKeys(Key.TAB);
	}

	public void enterOTP(String acNumberOTP)

	{
		enterOTPBtn.sendKeys(String.valueOf(acNumberOTP));
	}

	public void clickProceedBtn() {
		ProceedBtn.click();
	}

}
