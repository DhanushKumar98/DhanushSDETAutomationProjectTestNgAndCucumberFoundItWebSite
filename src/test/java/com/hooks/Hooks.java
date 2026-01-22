package com.hooks;

import com.Base.BaseClass;
import com.pageObjectManager.PageObjectManager;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass{
	
	PageObjectManager pageObjectManager = new PageObjectManager();
	
	@Before
	public void setUp() {
		launchBrowser(pageObjectManager.getFileReaderManager().getDataProperty("browser"));
		launchUrl(pageObjectManager.getFileReaderManager().getDataProperty("url"));
		pageObjectManager.getLoginPage().loginViaPassword();
		pageObjectManager.getLoginPage().setEmail();
		pageObjectManager.getLoginPage().setPassword();
		pageObjectManager.getLoginPage().clickOnLoginBtn();		
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}

}
