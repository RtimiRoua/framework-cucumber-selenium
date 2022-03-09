package com.e2eTests.automatedTests.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class CommonMethods {

	public CommonMethods() {
		driver = SetUp.driver;
	}

	public static WebDriver driver;
	public static Properties prop;

	public void readFileConfig() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream("src/test/resources/configs/config.properties");
		prop.load(fis);
		driver.get(prop.getProperty("url"));
	}
	public void refreshNavigator() {
		driver.navigate().refresh();
	}
}
