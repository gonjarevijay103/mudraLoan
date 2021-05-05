package com.mudraLoan.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.api.robot.Key;

public class BasicCustomerDetails {

	WebDriver ldriver;
	

	public BasicCustomerDetails(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id = "mat-select-value-33")
	WebElement salutationMr;
	
	
	@FindBy(xpath = "//*[@id=\"mat-option-2297\"]/span")
	WebElement selectMr;
	
	@FindBy(xpath = "//*[@id=\"mat-datepicker-2\"]/div")
	WebElement clickCalender;
	
	@FindBy(xpath = "//*[@id=\"mat-datepicker-2\"]/div/mat-month-view/table/tbody/tr[1]/td[2]/div[1]")
	WebElement clickCalenderOneMay;
	
	
	@FindBy(id = "mat-input-38")
	WebElement valueOfAssetsOwned;
	
	@FindBy(id = "mat-select-value-49")
	WebElement residentStatus;
	
	@FindBy(id = "mat-input-47")
	WebElement nameOfBusinessUnit;
	
	@FindBy(xpath = "//*[@id=\"mat-select-value-37\"]/span")
	WebElement msmeCategoryDD;
	
	
	@FindBy(xpath = "//*[@id=\"mat-option-4577\"]/span")
	WebElement msmeCategorySmall;
	
	@FindBy(id = "mat-select-value-39")
	WebElement typeOfActivity;
	
	@FindBy(xpath = "//*[@id=\"mat-option-4579\"]/span")
	WebElement typeOfActivityService;
	
	@FindBy(id = "mat-input-39")
	WebElement enterDetailOfActivity;
	
	@FindBy(xpath = "//*[@id=\"mat-option-4959\"]/span")
	WebElement enterDetailOfActivityCivilContractor;
	
	@FindBy(xpath = "//*[@id=\"mat-datepicker-3\"]/div/mat-month-view/table/tbody/tr[1]/td[1]")
	WebElement clickDateOfEncorporation;

	@FindBy(xpath = "//*[@id=\"mat-datepicker-3\"]/div/mat-month-view/table/tbody/tr[1]/td[2]/div[1]")
	WebElement clickDateOfEncorporationOneMay;
	
	@FindBy(id = "mat-input-41")
	WebElement numberOfEmployee;
	
	@FindBy(id = "mat-input-42")
	WebElement salesLastTwelveMonth;	
	
	@FindBy(id = "mat-input-43")
	WebElement salesNextTwelveMonth;
	
	@FindBy(id = "mat-input-44")
	WebElement busnAddLineOne;
	
	@FindBy(id = "mat-input-45")
	WebElement busnAddLineTwo;
	
	@FindBy(id = "mat-input-46")
	WebElement pinCode;
	
	@FindBy(id = "mat-select-value-31")
	WebElement selectBankBranch;
	
	@FindBy(xpath = "//*[@id=\"mat-option-5082\"]/span")
	WebElement domWest;
	
	@FindBy(xpath = "/html/body/app-root/app-user-input/app-customer-details/div/form/div/div/div[2]/div[2]/button")
	WebElement proceedButton;

	public void clicksalutationMr() {
		salutationMr.click();
	}

	public void clickselectMr() {
		selectMr.click();
	}
	
	public void clickCalenderMethod() {
		clickCalender.click();
	}
	
	
	public void clickCalenderOneMay() {
		clickCalenderOneMay.click();
	}
	
	public void valueOfAssetsOwned(String valOfAsst) {
		valueOfAssetsOwned.sendKeys(String.valueOf(valOfAsst));
	}
	
	public void nameOfUnit(String nameOfUnit) {
		nameOfBusinessUnit.sendKeys(nameOfUnit);
	}
	

	public void msmeCategoryDDMethod() {
		msmeCategoryDD.click();
	}
	
	public void msmeCategorySmallMethod() {
		msmeCategorySmall.click();
	}
	
	public void typeOfActivityMethod() {
		typeOfActivity.click();
	}
	
	public void typeOfActivityServiceMethod() {
		typeOfActivityService.click();
	}
	
	public void enterDetailOfActivityMethod() {
		enterDetailOfActivity.click();
	}
	
	public void enterDetailOfActivityCivilContractorMethod() {
		enterDetailOfActivityCivilContractor.click();
	}
	
	public void clickDateOfEncorporationMethod() {
		clickDateOfEncorporation.click();
	}
	
	public void clickDateOfEncorporationOneMayMethod() {
		clickDateOfEncorporationOneMay.click();
	}
	
	public void numberOfEmployeeMethod(String noOFEmp) {
		numberOfEmployee.sendKeys(String.valueOf(noOFEmp));
	}
	
	public void salesLastTwelveMonthMethod(String saleLTwelveMon) {
		salesLastTwelveMonth.sendKeys(String.valueOf(saleLTwelveMon));
	}
	
	public void salesNextTwelveMonthMethod(String saleNTwelveMon) {
		salesNextTwelveMonth.sendKeys(String.valueOf(saleNTwelveMon));
	}
	
	public void busnAddLineOneMethod(String busnAddOne) {
		busnAddLineOne.sendKeys(busnAddOne);
	}
	
	public void busnAddLineTwoMethod(String busnAddTwo) {
		busnAddLineTwo.sendKeys(busnAddTwo);
	}
	
	public void pinCodeMethod(String pin) throws InterruptedException {
		pinCode.sendKeys(String.valueOf(pin));
		pinCode.sendKeys(Key.TAB);
		Thread.sleep(2000);
	}
	
	public void selectBankBranchMethod() {
		selectBankBranch.click();
	}
	
	public void selectBankBranchDomWest() {
		domWest.click();
	}
	
	public void clickProceedBtn() {
		proceedButton.click();
	}
	
}
