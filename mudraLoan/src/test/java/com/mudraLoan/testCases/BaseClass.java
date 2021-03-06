package com.mudraLoan.testCases;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.mudraLoan.utilities.ReadConfig;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class BaseClass {

	ReadConfig readconfig = new ReadConfig();

	public String baseurl = readconfig.getBaseUrl();
	public static WebDriver driver;
	public static Logger logger;

	@Parameters("browser")
	@BeforeTest
	public void setup(String br) {
		logger = Logger.getLogger("mudraLoan");
		PropertyConfigurator.configure("log4j.properties");

		if (br.equals("chrome")) {

			ChromeOptions handlingSSL = new ChromeOptions();
			handlingSSL.addArguments("--incognito");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setCapability(ChromeOptions.CAPABILITY, handlingSSL);

			handlingSSL.setAcceptInsecureCerts(true);

			System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
			driver = new ChromeDriver(handlingSSL);
			driver.manage().window().maximize();

		}

		else if (br.equals("ie")) {
			System.setProperty("webdriver.ie.driver", readconfig.getiePath());
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();

		}

		else if (br.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", readconfig.getFirefoxPath());
			driver = new FirefoxDriver();
			driver.manage().window().maximize();

		}

		driver.get(baseurl);
		logger.info("Browser opened");

	}

	@AfterTest
	public void teardown() {
		driver.quit();
	}

	public void captureScreen(WebDriver driver, String tname) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(
				"C:\\Users\\Aniruddha\\eclipse-workspace\\mudraLoan\\Screenshots\\" + tname + screenShotCountOfDay() + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");

	}

	public String randomestring() {
		String generatedstring = RandomStringUtils.randomAlphabetic(8);
		return (generatedstring);
	}

	public static String randomeNum() {
		String generatedString2 = RandomStringUtils.randomNumeric(4);
		return (generatedString2);
	}

	public static String screenShotCountOfDay() {
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());// time stamp
		String repName = "SS" + timeStamp ;
		return (repName);
	}

}
