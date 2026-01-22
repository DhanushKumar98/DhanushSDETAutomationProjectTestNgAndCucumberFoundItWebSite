package com.pageObjectModules;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;
import com.InterfaceElement.EducationInterfaceElements;
import com.pageObjectManager.PageObjectManager;

public class EducationPageObjectModule extends BaseClass implements EducationInterfaceElements {
	
	public EducationPageObjectModule() {
		PageFactory.initElements(getDriver(), this);
	}

	
	@FindBy(xpath = educationEditBtn_xpath)
	private WebElement educationEditBtn;
	
	@FindBy(css = qualificationTextBox_css)
	private WebElement qualificationTextBox;
	
	@FindBy(xpath = qualificationDropdown_xpath)
	private List<WebElement> qualificationDropdown;
	
	@FindBy(css = specilization_css)
	private WebElement specilization;
	
	@FindBy(xpath = specilizationDropdown_xpath)
	private List<WebElement> specilizationDropdown;
	
	@FindBy(css = university_css)
	private WebElement university;
	
	@FindBy(xpath = universityDropDown_xpath)
	private List<WebElement> universityDropDown;
	
	@FindBy(css = enterUnivertyName_css)
	private WebElement enterUnivertyName;
	
	@FindBy(css = passingYear_css)
	private WebElement passingYear;
	
	@FindBy(xpath = passingYearDropdown_xpath)
	private List<WebElement> passingYearDropdown;
	
	@FindBy(xpath = educationType_xpath)
	private WebElement educationType;
	
	@FindBy(xpath = saveBtn_xpath)
	private WebElement saveBtn;
	
	PageObjectManager pageObjectManager = new PageObjectManager();
	
	public void clicEditEducationBtn() {
		clickJS(educationEditBtn);
	}
	
	public void setQualification() {
		selectCustomDropdownJSClick(qualificationTextBox, qualificationDropdown, pageObjectManager.getFileReaderManager().getDataProperty("qualication"));
	}
	
	public void setSpecilization() {
		selectCustomDropdownJSClick(specilization, specilizationDropdown, pageObjectManager.getFileReaderManager().getDataProperty("specilization"));
	}
	
	public void setUniversity() {
		selectCustomDropdownJSClick(university, universityDropDown,pageObjectManager.getFileReaderManager().getDataProperty("university"));
	}
	
	public void enterUniversity() {
		sendkeys(enterUnivertyName, pageObjectManager.getFileReaderManager().getDataProperty("universityName"));
	}
	
	public void setYearPassingOut() {
		selectCustomDropdownJSClick(passingYear, passingYearDropdown, pageObjectManager.getFileReaderManager().getDataProperty("passingYear"));
	}
	
	public void clickEducationType() {
		clickSelenium(educationType);
	}
	
	public void clickOnSaveBtn() {
		
		clickJS(saveBtn);
		localWait(5000);
		
	}
	
	
	
}
