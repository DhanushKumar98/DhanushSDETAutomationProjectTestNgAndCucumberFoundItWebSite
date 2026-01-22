package com.pageObjectModules;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;
import com.InterfaceElement.WindowHandlesInterfaceElements;

public class WindowHandlesPageObjectModule extends BaseClass implements WindowHandlesInterfaceElements{
	
	public WindowHandlesPageObjectModule() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath = instagramLink_xpath)
	private WebElement instagramLink;
	
	@FindBy(xpath = linkedLink_xpath)
	private WebElement linkedLink;
	
	@FindBy(xpath = twitterLink_xpath)
	private WebElement twitterLink;
	
	@FindBy(xpath = faceBookLink_xpath)
	private WebElement faceBookLink;
	
	
	public void instagramLinkWindowHandling() {
		String parent = getParentWindow();
		scrollByElement(instagramLink);
		clickSelenium(instagramLink);
		switchToChildWindow(parent);
	}
	
	
	
	
	
	
	
	
	
	

}
