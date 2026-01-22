package com.pageObjectModules;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;
import com.InterfaceElement.CoursesAndCertification;
import com.pageObjectManager.PageObjectManager;

public class CoursesAndCertificationPageObjectModul extends BaseClass implements CoursesAndCertification{
	
	public CoursesAndCertificationPageObjectModul() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath = editBtnCoursesAndCertification_xpath)
	private WebElement editBtnCoursesAndCertification;
	
	@FindBy(css = enterCertificationName_css)
	private WebElement enterCertificationName;
	
	@FindBy(css = issuredBy_css)
	private WebElement issuredBy;
	
	@FindBy(xpath = saveBtn_xpath)
	private WebElement saveBtn;
	
	PageObjectManager pageObjectManager = new PageObjectManager();
	
	public void clickOnEditBtnoursesAndCertification() {
		clickSelenium(editBtnCoursesAndCertification);
	}
	
	public void enterCerterficationName() {
		sendkeys(enterCertificationName, pageObjectManager.getFileReaderManager().getDataProperty("certificationName"));
	}
	
	public void issuredBy() {
		sendkeys(issuredBy, pageObjectManager.getFileReaderManager().getDataProperty("issuredBy"));
	}
	
	public void clickOnSaveBtn() {
		clickSelenium(saveBtn);
	}
	

}
