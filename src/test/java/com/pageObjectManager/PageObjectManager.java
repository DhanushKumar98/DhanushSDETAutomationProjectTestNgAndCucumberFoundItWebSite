package com.pageObjectManager;

import org.openqa.selenium.WebDriver;

import com.pageObjectModules.CoursesAndCertificationPageObjectModul;
import com.pageObjectModules.EducationPageObjectModule;
import com.pageObjectModules.JobPreferencePageObjectModule;
import com.pageObjectModules.LoginPageObjectModule;
import com.pageObjectModules.ProfileSummaryPageObjectModule;
import com.pageObjectModules.ResumeUploadPageObjectModule;
import com.pageObjectModules.SkillsPageObjectModule;
import com.pageObjectModules.UpdateProfilePageObjectModule;
import com.pageObjectModules.WindowHandlesPageObjectModule;
import com.pageObjectModules.WorkExperiencePageObjectModule;
import com.utility.FileReaderManager;

public class PageObjectManager {
	
	private FileReaderManager fileReaderManager;
	private LoginPageObjectModule loginPage;
	private UpdateProfilePageObjectModule updateProfilePage;
	private ProfileSummaryPageObjectModule profileSummaryPage;
	private ResumeUploadPageObjectModule resumeUploadPage;
	private WorkExperiencePageObjectModule workExperiencePage;
	private SkillsPageObjectModule skillsPage;
	private EducationPageObjectModule educationPage;
	private JobPreferencePageObjectModule jobPreferrence;
	private CoursesAndCertificationPageObjectModul coursesAndCertificationPage;
	private WindowHandlesPageObjectModule windowHandlesPage;
	
	
	
	public FileReaderManager getFileReaderManager() {
		if(fileReaderManager == null) {
			fileReaderManager = new FileReaderManager();
		}
		return fileReaderManager;
	}
	
	public LoginPageObjectModule getLoginPage() {
		if(loginPage == null) {
			loginPage = new LoginPageObjectModule();
		}
		return loginPage;
	}
	
	public UpdateProfilePageObjectModule getUpdateProfilePage() {
		if(updateProfilePage == null) {
			updateProfilePage = new UpdateProfilePageObjectModule();
		}
		return updateProfilePage;
	}
	
	public ProfileSummaryPageObjectModule getProfileSummaryPage() {
		if(profileSummaryPage == null) {
			profileSummaryPage = new ProfileSummaryPageObjectModule();
		}
		return profileSummaryPage;
	}
	
	public ResumeUploadPageObjectModule getResumeUploadPage() {
		if(resumeUploadPage == null) {
			resumeUploadPage = new ResumeUploadPageObjectModule();
		}
		return resumeUploadPage;
	}
	
	public WorkExperiencePageObjectModule getWorkExperiencePage() {
		if(workExperiencePage == null) {
			workExperiencePage = new WorkExperiencePageObjectModule();
		}
		return workExperiencePage;
	}
	
	public SkillsPageObjectModule getSkillsPage() {
		if(skillsPage == null) {
			skillsPage = new SkillsPageObjectModule();
		}
		return skillsPage;
	}
	
	public EducationPageObjectModule getEducationPage() {
		if(educationPage == null) {
			educationPage = new EducationPageObjectModule();
		}
		return educationPage;
	}
	
	public JobPreferencePageObjectModule getJobPreferencePage() {
		if(jobPreferrence == null) {
			jobPreferrence = new JobPreferencePageObjectModule();
		}
		return jobPreferrence;
	}
	
	public CoursesAndCertificationPageObjectModul getCoursesAndCertificationPage() {
		if(coursesAndCertificationPage == null) {
			coursesAndCertificationPage = new CoursesAndCertificationPageObjectModul();
		}
		return coursesAndCertificationPage;
	}
	
	
	
	public WindowHandlesPageObjectModule getWindowHandlesPage() {
		if(windowHandlesPage == null) {
			windowHandlesPage = new WindowHandlesPageObjectModule();
		}
		return windowHandlesPage;
	}
	

}
