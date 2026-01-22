package com.pageObjectModules;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;
import com.InterfaceElement.UpdateProfileInterfaceElement;

public class UpdateProfilePageObjectModule extends BaseClass implements UpdateProfileInterfaceElement{
	
	public UpdateProfilePageObjectModule() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(css = clickOnProfile_css)
	private WebElement clickOnProfile;
	
	@FindBy(xpath = clickOnViewProfile_xpath)
	private WebElement clickOnViewProfile;
	
	
	public void clickProfile() {
		localWait(3000);
		clickSelenium(clickOnProfile);
	}
	
	public void clickViewProfile() {
		
		clickSelenium(clickOnViewProfile);
		localWait(3000);
		
	}
	
	

}
