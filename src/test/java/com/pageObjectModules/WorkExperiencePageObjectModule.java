package com.pageObjectModules;

import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;
import com.InterfaceElement.WorkExperienceInterfaceElement;
import com.pageObjectManager.PageObjectManager;

public class WorkExperiencePageObjectModule extends BaseClass implements WorkExperienceInterfaceElement{
	
	public WorkExperiencePageObjectModule() {
		PageFactory.initElements(getDriver(), this);
	}
	
	
	@FindBy(xpath = editBtnWorkExperience_xpath)
	private WebElement editBtnWorkExperience;
	
	@FindBy(css = jobTitle_css)
	private WebElement jobTitle;
	
	@FindBy(css = company_css)
	private WebElement company;
	
	@FindBy(css = startYearInputTag_css)
	private WebElement startYearInputTag;
	
	@FindBy(xpath = dropdownStartYear_xpath)
	private List<WebElement> dropdownStartYear;
	
	@FindBy(xpath = startmonth_xpath)
	private WebElement startmonth;
	
	@FindBy(xpath = dropdownStartMonth_xpath)
	private List<WebElement> dropdownStartMonth;
	
	@FindBy(xpath = checkBoxCurrentWorking_xpath)
	private WebElement checkBoxCurrentWorking;
	
	@FindBy(xpath = enterSalary_xpath)
	private WebElement enterSalary;
	
	@FindBy(xpath = noticePeriod_xpath)
	private WebElement noticePeriod;
	
	@FindBy(xpath = noticePeriodDropdown_xpath)
	private List<WebElement> noticePeriodDropdown;
	
	@FindBy(css = industries_css)
	private WebElement industries;
	
	@FindBy(xpath = industriesDropDown_xpath)
	private List<WebElement> industriesDropDown;
	
	@FindBy(xpath = saveBtn_xpath)
	private WebElement saveBtn;
	
	
	PageObjectManager pageObjectManager = new PageObjectManager();
	
	public void clickeditBtnWorkExperience() {
		scrollByElement(editBtnWorkExperience);
		clickSelenium(editBtnWorkExperience);
	}
	
	public void setJobTitle() {
		clearField(jobTitle);
		sendkeys(jobTitle,pageObjectManager.getFileReaderManager().getDataProperty("jobTitle"));
	}
	
	public void setCompany() {
		clearField(company);
		sendkeys(company, pageObjectManager.getFileReaderManager().getDataProperty("company"));
	}
	
	public void startYearDropdown() {
		selectCustomDropdown(startYearInputTag,dropdownStartYear,pageObjectManager.getFileReaderManager().getDataProperty("startYear"));
	}
	
	public void startMonthDropdown() {
		selectCustomDropdown(startmonth, dropdownStartMonth, pageObjectManager.getFileReaderManager().getDataProperty("startMonth"));
		pressKey(KeyEvent.VK_ENTER);
	}
	
//	public void clickCheckBoxCurrentWorking() {
//		clickJS(checkBoxCurrentWorking);
//		localWait(5000);
//		clickSelenium(checkBoxCurrentWorking);
//	}
	
	public void setSalary() {
		typeJS(enterSalary,pageObjectManager.getFileReaderManager().getDataProperty("salary"));
		localWait(5000);
	}
	
	public void noticePeriod() {
		scrollByElement(noticePeriod);
		selectCustomDropdownJSClick(noticePeriod, noticePeriodDropdown, pageObjectManager.getFileReaderManager().getDataProperty("noticePeriod"));
		pressKey(KeyEvent.VK_ENTER);
	}
	
	public void industriesType() {
		scrollByElement(industries);
		//sendkeys(industries, pageObjectManager.getFileReaderManager().getDataProperty("industries"));
//		pressKey(KeyEvent.VK_BACK_SPACE);
//		localWait(3000);
		selectCustomDropdown(industries, industriesDropDown,pageObjectManager.getFileReaderManager().getDataProperty("industries"));
	}
	
	public void clickSaveBtn() {
		scrollByElement(saveBtn);
		clickSelenium(saveBtn);
	}
	
	
	
	
	

}
