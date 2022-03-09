package com.e2eTests.automatedTests.directory.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTests.automatedTests.directory.pageObjects.DirectoryPageObjects;
import com.e2eTests.automatedTests.posts.pageObjects.PostsPage;
import com.e2eTests.automatedTests.utils.CommonMethods;
import com.e2eTests.automatedTests.utils.SetUp;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DirectoryStepDefinitions {

	public WebDriver driver;
	private DirectoryPageObjects directoryPageObjects = new DirectoryPageObjects();

	public DirectoryStepDefinitions() {
		WebDriver driver = SetUp.driver;
		PageFactory.initElements(driver, DirectoryPageObjects.class);

	}

	@When("^je clique sur Directory$")
	public void jeCliqueSurDirectory() throws Throwable {
		directoryPageObjects.clickDirectory();
	}

	@When("^je selectionne les jobs title QA Engineer$")
	public void jeSelectionneLesJobsTitleQAEngineer() throws Throwable {
		directoryPageObjects.selectJob();

	}

	@When("^je clique sur Search$")
	public void jeCliqueSurSearch() throws Throwable {
		directoryPageObjects.clickSearch();

	}

	@Then("^je vérifis l affichage de liste des jobs$")
	public void jeVérifisLAffichageDeListeDesJobs() throws Throwable {
		Assert.assertTrue(directoryPageObjects.checkTableResults());
	}

}
