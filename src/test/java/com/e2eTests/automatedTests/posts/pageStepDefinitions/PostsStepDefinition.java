package com.e2eTests.automatedTests.posts.pageStepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTests.automatedTests.posts.pageObjects.PostsPage;
import com.e2eTests.automatedTests.utils.CommonMethods;
import com.e2eTests.automatedTests.utils.SetUp;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PostsStepDefinition {

	public WebDriver driver;
	private PostsPage postsPage = new PostsPage();
	
	private CommonMethods commonMethods = new CommonMethods();


	public PostsStepDefinition() {
		WebDriver driver = SetUp.driver;
		PageFactory.initElements(driver, PostsPage.class);

	}

	@When("^je clique sur Buzz$")
	public void jeCliqueSurBuzz() throws Throwable {
		postsPage.clickBuzz();
	}

	@When("^je saisis le message \"([^\"]*)\"$")
	public void jeSaisisLeMessage(String md) throws Throwable {
		postsPage.fillMind(md);
	}

	@When("^je clique sur Post$")
	public void jeCliqueSurPost() throws Throwable {
		postsPage.clickPost();
	}

	@Then("^Je verifie si le message \"([^\"]*)\" est bien parmis la liste des post$")
	public void jeVerifieSiLeMessageEstBienParmisLaListeDesPost(String checkComment) throws Throwable {
		commonMethods.refreshNavigator();
		Assert.assertEquals(postsPage.getListOfCommentsPost(checkComment), checkComment);
	    
	}
	}


