package com.runner;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Base.BaseClass;
import com.ITestListener.ExtentReport_Test;
import com.ITestListener.ITestListenerClass;
import com.aventstack.extentreports.ExtentTest;
import com.pageObjectManager.PageObjectManager;


@Listeners(ITestListenerClass.class)
public class RunnerClass extends BaseClass {

	PageObjectManager pageObjectManager = new PageObjectManager();

	@BeforeSuite
	public void extentReportStart() {
		extentReportStart(System.getProperty("user.dir") + "/ExtentReports/");
	}

	//@Parameters({"browser","url"})
	@BeforeTest
	public void setUp() {
		launchBrowser(pageObjectManager.getFileReaderManager().getDataProperty("browser"));
		launchUrl(pageObjectManager.getFileReaderManager().getDataProperty("url"));
		//launchBrowser(browser);	
		//launchUrl(url);
	}

	@Test(priority=1)
	public void loginPage() {
		ExtentReport_Test.extenttest = extentReports
				.createTest(
						"FOUNDIT WEB APPLICATION TEST" + " : " + Thread.currentThread().getStackTrace()[1].getMethodName().toString())
				.info("LOGIN PAGE TEST");
		ExtentReport_Test.extenttest.info("User Should enter Email ID");
		pageObjectManager.getLoginPage().setEmail();
		ExtentReport_Test.extenttest.info("User Should Click on Login Via Password Button");
		pageObjectManager.getLoginPage().loginViaPassword();
		ExtentReport_Test.extenttest.info("User Should enter Password");
		pageObjectManager.getLoginPage().setPassword();
		ExtentReport_Test.extenttest.info("User Should Validate Profile Message");
		pageObjectManager.getLoginPage().validatecreateProfileMessage();
		ExtentReport_Test.extenttest.info("User Should Validate Login Page Image");
		pageObjectManager.getLoginPage().validateLoginPageImage();
		ExtentReport_Test.extenttest.info("User Should Click Show Password Button");
		pageObjectManager.getLoginPage().clickPasswordShow();
		ExtentReport_Test.extenttest.info("User Should Click on Login Button");
		pageObjectManager.getLoginPage().clickOnLoginBtn();
		localWait(10000);
	}
	
	@Test(priority = 2)
	public void profilePage() {
		ExtentReport_Test.extenttest = extentReports
				.createTest("FOUNDIT WEB APPLICATION TEST" + " : " + Thread.currentThread().getStackTrace()[1].getMethodName().toString())
				.info("PROFILE PAGE MODULE");
		pageObjectManager.getUpdateProfilePage().clickProfile();
		pageObjectManager.getUpdateProfilePage().clickViewProfile();
	}
	
	
	@Test(priority = 3)
	public void profileSummaryPage() {
		ExtentReport_Test.extenttest = extentReports
				.createTest("FOUNDIT WEB APPLICATION TEST"+ " : "+ Thread.currentThread().getStackTrace()[1].getMethodName().toString())
				.info("PROFILE SUMMARY PAGE MODULE");
		pageObjectManager.getProfileSummaryPage().clickEditProfileSummary();
		pageObjectManager.getProfileSummaryPage().clickTextBox();
		pageObjectManager.getProfileSummaryPage().clickEditSaveButton();
	}
	
	@Test(priority = 4)
	public void uploadResumePage() {
		ExtentReport_Test.extenttest = extentReports
				.createTest("FOUNDIT WEB APPLICATION TEST" + " : " + Thread.currentThread().getStackTrace()[1].getMethodName().toString())
				.info("UPLOAD RESUME MODULE");
		pageObjectManager.getResumeUploadPage().clickUploadResume();
		pageObjectManager.getResumeUploadPage().uploadResumeFile();
	}
	
	@Test(priority = 5)
	public void workExperiencePage() {
		ExtentReport_Test.extenttest = extentReports
				.createTest("FOUNDIT WEB APPLICATION TEST" + " : " +Thread.currentThread().getStackTrace()[1].getMethodName().toString())
				.info("WORK EXPERIENCE MODULE");
		pageObjectManager.getWorkExperiencePage().clickeditBtnWorkExperience();
		pageObjectManager.getWorkExperiencePage().setJobTitle();
		pageObjectManager.getWorkExperiencePage().setCompany();
		pageObjectManager.getWorkExperiencePage().startYearDropdown();
		pageObjectManager.getWorkExperiencePage().startMonthDropdown();
		pageObjectManager.getWorkExperiencePage().setSalary();
		pageObjectManager.getWorkExperiencePage().noticePeriod();
		pageObjectManager.getWorkExperiencePage().industriesType();
		pageObjectManager.getWorkExperiencePage().clickSaveBtn();
	}
	
	@Test(priority = 6)
	public void skillsPage() {
		ExtentReport_Test.extenttest = extentReports
				.createTest("FOUNDIT WEB APPLICATION TEST" + " : " + Thread.currentThread().getStackTrace()[1].getMethodName().toString())
				.info("SKILLS MODULE");
		pageObjectManager.getSkillsPage().clickEditSkillsBtn();
		pageObjectManager.getSkillsPage().cancelSkill();
		pageObjectManager.getSkillsPage().setSkills();
		pageObjectManager.getSkillsPage().saveBtn();
	}
	
	@Test(priority = 7)
	public void educationPage() {
		ExtentReport_Test.extenttest = extentReports
				.createTest("FOUNDIT WEB APPLICATION TEST" + " : " + Thread.currentThread().getStackTrace()[1].getMethodName().toString())
				.info("EDUCATION MODULE");
		pageObjectManager.getEducationPage().clicEditEducationBtn();
		pageObjectManager.getEducationPage().setQualification();
		pageObjectManager.getEducationPage().setSpecilization();
		pageObjectManager.getEducationPage().setUniversity();
		pageObjectManager.getEducationPage().enterUniversity();
		pageObjectManager.getEducationPage().setYearPassingOut();
		pageObjectManager.getEducationPage().clickEducationType();
		pageObjectManager.getEducationPage().clickOnSaveBtn();
	}
	
	@Test(priority = 8)
	public void jobPreferrencesPage() {
		ExtentReport_Test.extenttest = extentReports
				.createTest("FOUNDIT WEB APPLICATION TEST" + " : " + Thread.currentThread().getStackTrace()[1].getMethodName().toString())
				.info("JOB PREFERENCES");
		pageObjectManager.getJobPreferencePage().clickEditJobPreferenceBtn();
		pageObjectManager.getJobPreferencePage().deletePreferreJobTile();
		pageObjectManager.getJobPreferencePage().deletePreferreJobLocation();
		pageObjectManager.getJobPreferencePage().setPreferredJobTitle();
		pageObjectManager.getJobPreferencePage().setPreferredLocation();
		pageObjectManager.getJobPreferencePage().clickOnSaveBtn();
	}
	
	@Test(priority = 9)
	public void coursesAndCertificationPage() {
		ExtentReport_Test.extenttest = extentReports
				.createTest("FOUNDIT WEB APPLICATION TEST" + " : " + Thread.currentThread().getStackTrace()[1].getMethodName().toString())
				.info("COURSES AND CERTIFICATION");
		pageObjectManager.getCoursesAndCertificationPage().clickOnEditBtnoursesAndCertification();
		pageObjectManager.getCoursesAndCertificationPage().enterCerterficationName();
		pageObjectManager.getCoursesAndCertificationPage().issuredBy();
		pageObjectManager.getCoursesAndCertificationPage().clickOnSaveBtn();
	}
	
	@AfterTest
	public void tearDown() {
		terminateBrowser();
	}
	
	@AfterSuite
	public void extentReportEnd() {
		extentReportTearDown();
	}

}
