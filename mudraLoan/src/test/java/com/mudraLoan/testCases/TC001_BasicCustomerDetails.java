package com.mudraLoan.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.mudraLoan.pageObjects.BasicCustomerDetails;
import com.mudraLoan.pageObjects.individualYes;
import com.mudraLoan.utilities.XLUtils;

public class TC001_BasicCustomerDetails extends BaseClass {

	@Test
	public void BasicCustomerDetailsMethod() throws InterruptedException, IOException {

		BasicCustomerDetails bd = new BasicCustomerDetails(driver);

		bd.clicksalutationMr();
		System.out.println("Clicked salutation");
		Thread.sleep(1000);
		bd.clickselectMr();
		Thread.sleep(1000);
		bd.clickCalenderMethod();
		Thread.sleep(1000);
		bd.clickCalenderOneMay();
		Thread.sleep(1000);
		bd.valueOfAssetsOwned("500000");
		Thread.sleep(1000);
		bd.nameOfUnit("Test Business");
		Thread.sleep(1000);
		bd.msmeCategoryDDMethod();
		Thread.sleep(1000);
		bd.msmeCategorySmallMethod();
		Thread.sleep(1000);
		bd.typeOfActivityMethod();
		Thread.sleep(1000);
		bd.typeOfActivityServiceMethod();
		Thread.sleep(1000);
		bd.enterDetailOfActivityMethod();
		Thread.sleep(1000);
		bd.enterDetailOfActivityCivilContractorMethod();
		Thread.sleep(1000);
		bd.clickDateOfEncorporationMethod();
		Thread.sleep(1000);
		bd.clickDateOfEncorporationOneMayMethod();
		Thread.sleep(1000);
		bd.numberOfEmployeeMethod("12");
		Thread.sleep(1000);
		bd.salesLastTwelveMonthMethod("500000");
		Thread.sleep(1000);
		bd.salesNextTwelveMonthMethod("550000");
		Thread.sleep(1000);
		bd.busnAddLineOneMethod("Address 1");
		Thread.sleep(1000);
		bd.busnAddLineTwoMethod("Address 2");
		Thread.sleep(1000);
		bd.pinCodeMethod("421202");
		Thread.sleep(1000);
		bd.selectBankBranchMethod();
		Thread.sleep(1000);
		bd.selectBankBranchDomWest();
		Thread.sleep(1000);
		bd.clickProceedBtn();
		Thread.sleep(5000);

		if (driver.getTitle().equals("MudraLoans")) {
			Assert.assertTrue(true);
		} else {
			captureScreen(driver, "TC001_BasicCustomerDetails");
			Assert.assertTrue(false);
		}

	}

	@DataProvider(name = "dPBacisCustDetails")
	String[][] dataProviderMBNumber() throws IOException {

		String path = "C:\\Users\\Aniruddha\\eclipse-workspace\\mudraLoan\\src\\test\\java\\com\\mudraLoan\\testData\\accountNumber.xlsx";

		int rowNumber = XLUtils.getRowCount(path, "Sheet1");
		int colNumber = XLUtils.getCellCount(path, "Sheet1", 1);

		String logindata[][] = new String[rowNumber][colNumber];
		for (int i = 1; i <= rowNumber; i++) {
			for (int j = 0; j < colNumber; j++) {
				logindata[i - 1][j] = XLUtils.getCellData(path, "Sheet1", i, j);

			}

		}
		return logindata;
	}

}
