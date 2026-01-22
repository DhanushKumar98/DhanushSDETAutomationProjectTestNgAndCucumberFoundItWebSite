package com.pageObjectModules;

import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;
import com.InterfaceElement.JobPreferencesInterfaceElement;
import com.pageObjectManager.PageObjectManager;

public class JobPreferencePageObjectModule extends BaseClass implements JobPreferencesInterfaceElement {

	public JobPreferencePageObjectModule() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = jobPreferenceEditButton_xpath)
	private WebElement jobPreferenceEditButton;


	@FindBy(css = enterPreferredJobTitle_css)
	private WebElement enterPreferredJobTitle;


	@FindBy(css = enterPreferredLocation_css)
	private WebElement enterPreferredLocation;

	@FindBy(xpath = saveBtn_xpath)
	private WebElement saveBtn;

	PageObjectManager pageObjectManager = new PageObjectManager();

	public void clickEditJobPreferenceBtn() {
		clickJS(jobPreferenceEditButton);
	}

	public void deletePreferreJobTile() {
		clickSelenium(enterPreferredJobTitle);
		ActionsPerform(enterPreferredJobTitle, null, "doubleclick");
		localWait(5000);
		pressKey(KeyEvent.VK_BACK_SPACE);
	}

	public void deletePreferreJobLocation() {
		clickSelenium(enterPreferredLocation);
		ActionsPerform(enterPreferredLocation, null, "doubleclick");
		pressKey(KeyEvent.VK_BACK_SPACE);
		localWait(3000);
		pressKey(KeyEvent.VK_BACK_SPACE);
		localWait(3000);
		pressKey(KeyEvent.VK_BACK_SPACE);
	}

	public void setPreferredJobTitle() {
		sendkeys(enterPreferredJobTitle, pageObjectManager.getFileReaderManager().getDataProperty("preferredJobTitle"));
		pressKey(KeyEvent.VK_DOWN);
		localWait(3000);
		pressKey(KeyEvent.VK_ENTER);

	}

	public void setPreferredLocation() {
		sendkeys(enterPreferredLocation,
				pageObjectManager.getFileReaderManager().getDataProperty("preferredJobLocation1"));
		pressKey(KeyEvent.VK_DOWN);
		localWait(3000);
		pressKey(KeyEvent.VK_ENTER);
		localWait(3000);
		ActionsPerform(enterPreferredLocation, null, "doubleclick");
		localWait(3000);
		pressKey(KeyEvent.VK_BACK_SPACE);

		sendkeys(enterPreferredLocation,
				pageObjectManager.getFileReaderManager().getDataProperty("preferredJobLocation2"));
		pressKey(KeyEvent.VK_DOWN);
		localWait(3000);
		pressKey(KeyEvent.VK_ENTER);
		localWait(3000);
		ActionsPerform(enterPreferredLocation, null, "doubleclick");
		localWait(3000);
		pressKey(KeyEvent.VK_BACK_SPACE);

		sendkeys(enterPreferredLocation,
				pageObjectManager.getFileReaderManager().getDataProperty("preferredJobLocation3"));
		pressKey(KeyEvent.VK_DOWN);
		localWait(3000);
		pressKey(KeyEvent.VK_ENTER);
		localWait(3000);
	}

	public void clickOnSaveBtn() {
		clickSelenium(saveBtn);
	}
}
