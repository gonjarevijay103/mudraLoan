package com.mudraLoan.testCases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mudraLoan.pageObjects.FirstPage;

public class TC001_FirstPage extends BaseClass {

	@Test
	public void TC001() throws InterruptedException, IOException {



		FirstPage fp = new FirstPage(driver);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,600)");

		Thread.sleep(2000);
		fp.clickProceedButton();
//		try {
//			captureScreen(driver);
//			
//			System.out.println("Screenshot taken 1");
//			}
//			catch(Exception e)
//			{
//				System.out.println(e.getMessage());
//			}
		Thread.sleep(1000);

		if (driver.getTitle().equals("MudraLoans")) {
			Assert.assertTrue(true);
		} else {
			captureScreen(driver,"TC001_FirstPage");
			Assert.assertTrue(false);
		}

	}

}
