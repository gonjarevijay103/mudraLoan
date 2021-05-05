package com.mudraLoan.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.mudraLoan.pageObjects.MobileEntry;
import com.mudraLoan.utilities.XLUtils;

public class TC001_LoginMBNumber extends BaseClass {

	@Test(dataProvider="dPMBNumber")
	public void loginDDT(String mBNum, String pWD) throws IOException, InterruptedException
	{
	
		MobileEntry mE = new MobileEntry(driver);
		mE.acceptMobileNumber(mBNum);
		
		Thread.sleep(2000);
		mE.acceptOTP(pWD);	
		Thread.sleep(1000);
		mE.clickprivacyPolicyRadioBtn();
		Thread.sleep(1000);
		mE.clicksubmitOTPBtn();
		Thread.sleep(2000);
		
		
		if (driver.getTitle().equals("MudraLoans")) {
			Assert.assertTrue(true);
		} else {
			captureScreen(driver,"TC001_LoginMBNumber");
			Assert.assertTrue(false);
		}

		
	}
	
	
	
	
	@DataProvider(name="dPMBNumber")
	String[][] dataProviderMBNumber() throws IOException
	{
		
		String path = "C:\\Users\\Aniruddha\\eclipse-workspace\\mudraLoan\\src\\test\\java\\com\\mudraLoan\\testData\\LoginMobileNumber.xlsx";
		
		int rowNumber = XLUtils.getRowCount(path, "Sheet1");
		int colNumber = XLUtils.getCellCount(path, "Sheet1", 1);
		
		
		String logindata[][]= new String[rowNumber][colNumber];
		for(int i=1;i<=rowNumber;i++)
		{
			for(int j=0;j<colNumber;j++)
			{
				logindata[i-1][j] = XLUtils.getCellData(path, "Sheet1",i,j);
				
			}
				
		}
	return 	logindata;
	}
	
	
	
}
