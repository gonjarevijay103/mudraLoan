package com.mudraLoan.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties prop;

	public ReadConfig() {

		File src = new File("./Configuration\\config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);

			prop = new Properties();
			prop.load(fis);

		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}

	}

	public String getBaseUrl() {
		String url = prop.getProperty("baseurl");
		return url;
	}

	public String getChromePath()

	{

		String chromepath = prop.getProperty("chromepath");
		return chromepath;
	}
	
	
	public String getiePath()

	{

		String iepath = prop.getProperty("iepath");
		return iepath;
	}

	
	public String getFirefoxPath()

	{

		String ffpath = prop.getProperty("firefoxpath");
		return ffpath;
	}
}
