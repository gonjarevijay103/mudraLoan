package com.mudraLoan.pageObjects;

import java.util.List;

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

	@FindBy(xpath = "//span[@class='mat-select-placeholder ng-tns-c96-13 ng-star-inserted']")
	WebElement salutationMr;
	//// *[@id="mat-option-7"]/span
	//// *[@id="mat-option-8"]/span
	//// *[@id="mat-select-value-7"]/span

	@FindBy(xpath = "//span[@class='mat-option-text' and text()=' Mr ']")
	WebElement selectMr;

	@FindBy(xpath = "/html/body/div[2]/div[1]")
	WebElement clickCalender;

	// *[@id="mat-datepicker-0"]/mat-calendar-header/div/div/div

	@FindBy(xpath = "/html/body/div[2]/div[1]")
	List<WebElement> clickCalenderOneMay;
	//// *[@id="mat-datepicker-0"]/div/mat-month-view/table/tbody/tr[2]/td[4]/div[1]

	@FindBy(xpath = "//input[@placeholder='Enter Total Value of Assets owned']")
	WebElement valueOfAssetsOwned;
	
	//

	@FindBy(id = "mat-select-value-49")
	WebElement residentStatus;

	@FindBy(xpath = "//input[@placeholder='Enter Name of the Business Unit']")
	WebElement nameOfBusinessUnit;

	@FindBy(xpath = "//span[@class='mat-select-placeholder ng-tns-c96-26 ng-star-inserted']")
	WebElement msmeCategoryDD;

	@FindBy(xpath = "//span[text()=' Small ']")
	WebElement msmeCategorySmall;
	
	////*[@id="mat-option-2287"]/span
	////*[@id="mat-option-2285"]/span

	@FindBy(xpath = "//span[text()='Select Type of Activity']")
	WebElement typeOfActivity;

	@FindBy(xpath = "//span[text()=' Services ']")
	WebElement typeOfActivityService;

	@FindBy(xpath = "//input[@placeholder='Enter Details of Activity']")
	WebElement enterDetailOfActivity;

	@FindBy(xpath = "//span[text()=' Automobile Repairing- Painting ']")
	WebElement enterDetailOfActivityCivilContractor;

	@FindBy(xpath = "//input[@placeholder='Select Date of Incorporation']")
	WebElement clickDateOfEncorporation;

	
	// /html/body/app-root/app-user-input/app-customer-details/div/form/div/div/div[2]/div[1]/mat-card[2]/mat-card-content[1]/div/div[5]/div/mat-form-field/div/div[1]/div[2]/mat-datepicker-toggle/button/span[1]/mat-icon/img
	@FindBy(xpath = "//div[text()=' 1 ']")
	WebElement clickDateOfEncorporationOneMay;

	@FindBy(xpath = "//input[@placeholder='Enter Number of Employees']")
	WebElement numberOfEmployee;

	@FindBy(xpath = "//input[@placeholder='Enter Sales during last 12 months']")
	WebElement salesLastTwelveMonth;

	@FindBy(xpath = "//input[@placeholder='Enter Estimated sales for next 12 months']")
	WebElement salesNextTwelveMonth;

	@FindBy(xpath = "//input[@placeholder='Enter Address Line 1']")
	WebElement busnAddLineOne;

	@FindBy(xpath = "//input[@placeholder='Enter Address Line 2']")
	WebElement busnAddLineTwo;

	@FindBy(xpath = "//input[@placeholder='Enter Pincode']")
	WebElement pinCode;

	@FindBy(xpath = "//span[text()='Select Bank Branch']")
	WebElement selectBankBranch;

	@FindBy(xpath = "//span[text()=' DOMBIVLI-W ']")
	WebElement domWest;

	@FindBy(xpath = "//button[@class='mat-focus-indicator primary-button mat-button mat-button-base']")
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
		for (WebElement date : clickCalenderOneMay) {

			if (date.getAttribute("class").contains("--today")) {

				date.click();
				break;

			}
		}
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
