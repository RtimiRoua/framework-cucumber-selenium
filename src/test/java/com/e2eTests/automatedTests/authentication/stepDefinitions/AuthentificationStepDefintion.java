package com.e2eTests.automatedTests.authentication.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTests.automatedTests.authentication.pageObjects.AuthenticationPage;
import com.e2eTests.automatedTests.utils.CommonMethods;
import com.e2eTests.automatedTests.utils.SetUp;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AuthentificationStepDefintion {
	
	public WebDriver driver;
	private AuthenticationPage authenticationPage = new AuthenticationPage();
	private CommonMethods commonMethods = new CommonMethods();
	
	public  AuthentificationStepDefintion() {
		driver = SetUp.driver;
		PageFactory.initElements(driver, AuthenticationPage.class);
		
	}

	@Given("^je me connecte sur l'application OrangeHRM$")
	public void jeMeConnecteSurLApplicationOrangeHRM() throws Throwable {
		commonMethods.readFileConfig(); 

	}

	@When("^je saisis le username \"([^\"]*)\"$")
	public void jeSaisisLeUsername(String name) throws Throwable {
		authenticationPage.fillUserName(name);

	}

	@When("^je saisis le password \"([^\"]*)\"$")
	public void jeSaisisLePassword(String pswd) throws Throwable {
		authenticationPage.fillPassword(pswd);

	}

	@When("^je clique sur le boutton LOGIN$")
	public void jeCliqueSurLeBouttonLogin() throws Throwable {
		authenticationPage.clickLoginButton();

	}

	@Then("^je me redirige vers la page home \"([^\"]*)\"$")
	public void jeMeRedirigeVersLaPageHome(String msg) throws Throwable {
		String message = AuthenticationPage.welcomeMessage.getText();
		Assert.assertTrue(message.contains(msg));

	}

}
