package com.mudraLoan.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.mudraLoan.pageObjects.individualYes;
import com.mudraLoan.utilities.XLUtils;

public class TC001_individualYes extends BaseClass {

	@Test(dataProvider = "dPMBNumber")
	public void loginDDT(String acNum, String otp) throws IOException, InterruptedException {

		individualYes iy = new individualYes(driver);

		iy.selectBorrowerConstitution();
		Thread.sleep(2000);
		iy.selectACHolderofBank();
		Thread.sleep(1000);
		iy.acceptAccountNumber(acNum);
		Thread.sleep(1000);
		iy.enterOTP(otp);
		Thread.sleep(2000);
		iy.clickProceedBtn();
		Thread.sleep(8000);
		System.out.println("clicked proceed");
		captureScreen(driver, "TC001_individualYes");

		if (driver.getTitle().equals("MudraLoans")) {
			Assert.assertTrue(true);
		} else {
			System.out.println("Reached else");
			captureScreen(driver, "TC001_individualYes");
			Assert.assertTrue(false);
		}

	}

	@DataProvider(name = "dPMBNumber")
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
