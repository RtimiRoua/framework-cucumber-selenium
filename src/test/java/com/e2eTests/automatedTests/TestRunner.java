package com.e2eTests.automatedTests;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/specs/features/directory/Directory.feature" }, plugin = { "pretty", "html:target/cucumber-html-report", 
		"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/OrangeHRM.html", "json:target/cucumber.json" },
		// glue = {""},
		tags = { ("@directory") }, 
				//tags = { ("@bouletcorp, @test") }, 
		snippets = SnippetType.CAMELCASE, monochrome = true)



public class TestRunner {
	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File("src/test/resources/configs/extent-config.xml"));

	}

}
