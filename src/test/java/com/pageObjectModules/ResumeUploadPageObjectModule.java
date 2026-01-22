package com.pageObjectModules;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;
import com.InterfaceElement.ResumeUploadInterfaceElement;
import com.pageObjectManager.PageObjectManager;

public class ResumeUploadPageObjectModule extends BaseClass implements ResumeUploadInterfaceElement{
	
	public ResumeUploadPageObjectModule() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath = deleteBtn_xpath)
	private WebElement deleteBtn;
	
	@FindBy(xpath = replaceResume_xpath)
	private WebElement replaceResume;
	
	@FindBy(xpath = UploadResume_xpath)
	private WebElement UploadResume;
	
	
	PageObjectManager pageObjectManager = new PageObjectManager();
	
	public void clickUploadResume() {
		clickSelenium(UploadResume);
	}
	
	public void uploadResumeFile() {
		//String filepath = System.getProperty("user.dir") + "/src/test/resources/UploadResumeFile/Dhanush_Kumar.pdf";
		uploadFile("B:\\Dhanush_Kumar.pdf");
		localWait(5000);
	}
}
