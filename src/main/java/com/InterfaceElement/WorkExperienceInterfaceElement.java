package com.InterfaceElement;

public interface WorkExperienceInterfaceElement {

	String editBtnWorkExperience_xpath = "(//button[@id='SECTION_EDIT_BUTTON'])[4]";
	String jobTitle_css = "#jobTitle";
	String company_css = "#company";
	String startYearInputTag_css = "#startYear";
	String dropdownStartYear_xpath = "//input[@id='startYear']/following::div[4]/child::li"; //// input[@id='startYear']/following::ul//child::li
	String startmonth_xpath = "//input[@id='startMonth']";
	String dropdownStartMonth_xpath = "//input[@id='startMonth']/following::ul//child::div/li";
	String checkBoxCurrentWorking_xpath = "//input[@id='checkbox']";
	String enterSalary_xpath = "//input[@placeholder='Enter Salary']";
	String noticePeriod_xpath = "//input[@id='notice']";
	String noticePeriodDropdown_xpath = "//input[@id='notice']/following::ul//child::li";
	String industries_css = "#industries";
	String industriesDropDown_xpath = "//input[@id='industries']/following::ul//div/li";
	String saveBtn_xpath = "//*[text()='Save']";

}
