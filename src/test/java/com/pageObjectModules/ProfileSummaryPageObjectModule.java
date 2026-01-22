package com.pageObjectModules;

import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;
import com.InterfaceElement.ProfileSummaryInterfaceElement;
import com.pageObjectManager.PageObjectManager;

public class ProfileSummaryPageObjectModule  extends BaseClass implements ProfileSummaryInterfaceElement{
	
	public ProfileSummaryPageObjectModule() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath = clickOnEditProfileSummary_xpath)
	private WebElement clickOnEditProfileSummary;
	
	@FindBy(xpath = clickOnEditTextBoxProfileSummary_xpath)
	private WebElement clickOnEditTextBoxProfileSummary;
	
	@FindBy(xpath = clickOnSaveButton_xpath)
	private WebElement clickOnSaveButton;
	
	PageObjectManager pageObjectManager = new PageObjectManager();
	
	public void clickEditProfileSummary() {
		clickSelenium(clickOnEditProfileSummary);
	}
	
	public void clickTextBox() {
		clickSelenium(clickOnEditTextBoxProfileSummary);
		pressCtrlKey(KeyEvent.VK_A);
		pressCtrlKey(KeyEvent.VK_BACK_SPACE);
		sendkeys(clickOnEditTextBoxProfileSummary, pageObjectManager.getFileReaderManager().getDataProperty("profileSummary"));
	}
	
	public void clickEditSaveButton() {
		clickSelenium(clickOnSaveButton);
	}
	
	
	

}
