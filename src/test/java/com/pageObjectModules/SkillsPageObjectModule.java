package com.pageObjectModules;

import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;
import com.InterfaceElement.SkillsInterfaceElements;
import com.pageObjectManager.PageObjectManager;

public class SkillsPageObjectModule extends BaseClass implements SkillsInterfaceElements {

	public SkillsPageObjectModule() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath = editSkillBtn_xpath)
	private WebElement editSkillBtn;

	@FindBy(xpath = pillContainer_xpath)
	private WebElement pillContainer;

	@FindBy(xpath = textFieldSkill_xpath)
	private WebElement textFieldSkill;

	@FindBy(xpath = textFiedSkillDropdown_xpath)
	private List<WebElement> textFiedSkillDropdown;

	@FindBy(xpath = saveBtn_xpath)
	private WebElement saveBtn;

	PageObjectManager pageObjectManager = new PageObjectManager();

	public void clickEditSkillsBtn() {
		clickSelenium(editSkillBtn);
	}

	public void scrollBySkillsContainer() {
		scrollToBottom(pillContainer);
	}

	public void cancelSkill() {
		clickSelenium(textFieldSkill);
		pressKey(KeyEvent.VK_BACK_SPACE);
		localWait(3000);
		pressKey(KeyEvent.VK_BACK_SPACE);
		localWait(3000);
		pressKey(KeyEvent.VK_BACK_SPACE);
	}
	public void clickTextbox() {
		clickSelenium(textFieldSkill);
	}
	
	
	public void setSkills() {
		sendkeys(textFieldSkill, pageObjectManager.getFileReaderManager().getDataProperty("skills1"));
		localWait(3000);
		pressKey(KeyEvent.VK_ENTER);
		localWait(3000);
		sendkeys(textFieldSkill, pageObjectManager.getFileReaderManager().getDataProperty("skills2"));
		localWait(3000);
		pressKey(KeyEvent.VK_ENTER);
		localWait(3000);
		sendkeys(textFieldSkill, pageObjectManager.getFileReaderManager().getDataProperty("skills3"));
		localWait(3000);
		pressKey(KeyEvent.VK_ENTER);
		localWait(3000);
	}

	public void saveBtn() {
		clickSelenium2(saveBtn);
		localWait(3000);

	}
}
