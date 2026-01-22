package com.InterfaceElement;

public interface LoginPageInterfaceElements {
	
		String email_css = "#signInName";
		String password_css = "input[placeholder='Enter your password']";
		String passwordShow_css = "#child";
		String imageDisplayed_xpath = "(//img[contains(@src,'images')])[1]";   // isDisplayed
		String CreateProfileMessage_xpath = "//p[normalize-space()='Create your profile now and be visible to the top recruiters in the world']";
		String loginViaPassword_xpath = "//div[@class='loginWith']";
		String loginBtn_css = "#signInbtn";
		
		

}
