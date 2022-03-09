package com.e2eTests.automatedTests.posts.pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PostsPage {

	/* Locators */
	final static String BUZZ_XPATH = "//b[contains(text(),'Buzz')]";
	final static String MIND_ID = "createPost_content";
	final static String POST_ID = "postSubmitBtn";
	final static String POST_CONTENT_CLASS_NAME = "postContent";

	/* @FindBy */
	@FindBy(how = How.XPATH, using = BUZZ_XPATH)
	public static WebElement buzz;
	@FindBy(how = How.ID, using = MIND_ID)
	public static WebElement mind;
	@FindBy(how = How.ID, using = POST_ID)
	public static WebElement post;
	public static WebElement postButton;
	@FindBy(how = How.CLASS_NAME, using = POST_CONTENT_CLASS_NAME)
	public static List<WebElement> listOfcommentsPost;

	/* Methods */

	public void clickBuzz() {
		buzz.click();

	}

	public void fillMind(String md) {
		mind.sendKeys(md);
	}

	public void clickPost() {
		post.click();
	}
	public String getListOfCommentsPost(String comment) {
		String finalComment = "";
		for (WebElement msg : listOfcommentsPost) {
			if (msg.getText().equalsIgnoreCase(comment)) {
				finalComment = msg.getText();
				break;
			}

		}
		return finalComment;
}
}