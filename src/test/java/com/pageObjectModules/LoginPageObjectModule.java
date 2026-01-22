package com.pageObjectModules;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;
import com.InterfaceElement.LoginPageInterfaceElements;
import com.aventstack.extentreports.Status;
import com.pageObjectManager.PageObjectManager;

public class LoginPageObjectModule extends BaseClass implements LoginPageInterfaceElements{
	
	public LoginPageObjectModule() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(css = email_css)
	private WebElement email;
	
	@FindBy(css = password_css)
	private WebElement password;
	
	@FindBy(css = passwordShow_css)
	private WebElement passwordShow;
	
	@FindBy(xpath = imageDisplayed_xpath)
	private WebElement imageDisplayed;
	
	@FindBy(xpath = CreateProfileMessage_xpath)
	private WebElement createProfileMessage;
	
	@FindBy(xpath = loginViaPassword_xpath)
	private WebElement loginViaPassword;
	
	@FindBy(css = loginBtn_css)
	private WebElement loginBtn;
	
	
	PageObjectManager pageObjectManager = new PageObjectManager();
	
	public void setEmail() {
		sendkeys(email,pageObjectManager.getFileReaderManager().getDataProperty("email"));
	}
	
	public void setPassword() {
		sendkeys(password, pageObjectManager.getFileReaderManager().getDataProperty("password"));
	}
	
	public void clickPasswordShow() {
		clickSelenium(passwordShow);
	}
	
	public void validateLoginPageImage() {
		if(imageDisplayed.isDisplayed()) {
		System.out.println("Image is Presented ");

		}else {
			System.out.println("Image is Not Displayed");
		}
	}
	
	public void validatecreateProfileMessage() {
		if(createProfileMessage.isDisplayed()) {
			System.out.println("Message is Displayed : "+createProfileMessage.getText());
			
		}else {
			System.out.println("Message is Not Displayed : "+createProfileMessage.getText());
			
		}
	}
	
	public void loginViaPassword() {
		clickSelenium(loginViaPassword);
	}

	public void clickOnLoginBtn() {
		clickSelenium(loginBtn);
		localWait(3000);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
