package com.e2eTests.automatedTests.directory.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class DirectoryPageObjects {

	/* Locators */
	final static String DIRECTORY_XPATH = "//*[contains(text(),'Directory')]";
	final static String JOB_TITLE_ID = "searchDirectory_job_title";
	final static String SEARCH_ID = "searchBtn";
	final static String ARRAY_ID = "resultTable";
	final static String JOB_TITLE_TEXT = "QA Engineer";
	
	final static String TEST = "tr";
	
	boolean checkResults = true;
	private String arrayLineText;

	/* @FindBy */
	@FindBy(how = How.XPATH, using = DIRECTORY_XPATH)
	public static WebElement directory;
	@FindBy(how = How.ID, using = JOB_TITLE_ID)
	public static WebElement jobtitle;
	@FindBy(how = How.ID, using = SEARCH_ID)
	public static WebElement search;
	@FindBy(how = How.ID, using = ARRAY_ID)
	public static WebElement table;
	
	@FindBy(how = How.TAG_NAME, using = TEST)
	public static List<WebElement> test;

	/* Methods */
	public void clickDirectory() {
		directory.click();
	}

	public void selectJob() {
		Select select = new Select(jobtitle);
		select.selectByVisibleText(JOB_TITLE_TEXT);
	}

	public void clickSearch() {
		search.click();
	}

	public boolean checkTableResults() {

		//?
		List<WebElement> table_lines = test;

		int nb_line = table_lines.size();

		for (int i = 0; i <= nb_line - 1; i++) {
			arrayLineText = table_lines.get(i).getText();

			if (arrayLineText.isEmpty()) {
				checkResults = true;
			} else {
				checkResults = checkResults & arrayLineText.contains(JOB_TITLE_TEXT);
			}

		}

		return checkResults;
	}

}