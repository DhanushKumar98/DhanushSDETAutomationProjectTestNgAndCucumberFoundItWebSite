package com.InterfaceElement;

public interface EducationInterfaceElements {
	String educationEditBtn_xpath = "//div[@class='flex items-center justify-between gap-0 md:gap-2 md:!justify-start']//button[@id='SECTION_EDIT_BUTTON']";
	String qualificationTextBox_css = "#highestQualification";
	String qualificationDropdown_xpath = "//input[@id='highestQualification']/following::ul//li";
	String specilization_css = "#specialization";
	String specilizationDropdown_xpath = "//input[@id='specialization']/following::ul//li";
	String university_css = "#institute";
	String universityDropDown_xpath = "//input[@id='institute']/following::ul//li";
	String enterUnivertyName_css = "#university";
	String passingYear_css = "#passingYear";
	String passingYearDropdown_xpath = "//input[@id='passingYear']/following::ul//li";
	String educationType_xpath = "//p[text()='Full time']";
	String saveBtn_xpath = "//*[text()='Save']";

}
