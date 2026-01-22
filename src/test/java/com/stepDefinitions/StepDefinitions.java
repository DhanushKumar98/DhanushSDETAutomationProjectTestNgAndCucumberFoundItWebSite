package com.stepDefinitions;

import com.Base.BaseClass;
import com.pageObjectManager.PageObjectManager;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions extends BaseClass {
	
	PageObjectManager pom = new PageObjectManager();
	
	

	@Given("user is logged into FoundIt application")
	public void user_is_logged_into_found_it_application() {
		
	}

	@And("user is on update profile page")
	public void user_is_on_update_profile_page() {
		pom.getUpdateProfilePage().clickProfile();
		localWait(3000);
		pom.getUpdateProfilePage().clickViewProfile();

	}

	@When("user clicks edit profile summary button")
	public void user_clicks_edit_profile_summary_button() {
		pom.getProfileSummaryPage().clickEditProfileSummary();

	}

	@And("user enters profile summary details")
	public void user_enters_profile_summary_details() {
		pom.getProfileSummaryPage().clickTextBox();

	}

	@And("user saves profile summary")
	public void user_saves_profile_summary() {
		 pom.getProfileSummaryPage().clickEditSaveButton();

	}

	@When("user clicks upload resume button")
	public void user_clicks_upload_resume_button() {
		pom.getResumeUploadPage().clickUploadResume();

	}

	@And("user uploads resume file")
	public void user_uploads_resume_file() {
		pom.getResumeUploadPage().uploadResumeFile();

	}

	@When("user clicks edit work experience button")
	public void user_clicks_edit_work_experience_button() {
		 pom.getWorkExperiencePage().clickeditBtnWorkExperience();

	}

	@And("user enters job title")
	public void user_enters_job_title() {
		pom.getWorkExperiencePage().setJobTitle();

	}

	@When("user enters company name")
	public void user_enters_company_name() {
		 pom.getWorkExperiencePage().setCompany();

	}

	@And("user selects start year")
	public void user_selects_start_year() {
		pom.getWorkExperiencePage().startYearDropdown();

	}

	@And("user selects start month")
	public void user_selects_start_month() {
		 pom.getWorkExperiencePage().startMonthDropdown();

	}

	@And("user enters salary")
	public void user_enters_salary() {
		pom.getWorkExperiencePage().setSalary();

	}

	@When("user selects notice period")
	public void user_selects_notice_period() {
		 pom.getWorkExperiencePage().noticePeriod();

	}

	@And("user selects industry type")
	public void user_selects_industry_type() {
		  pom.getWorkExperiencePage().industriesType();

	}

	@And("user saves work experience")
	public void user_saves_work_experience() {
		  pom.getWorkExperiencePage().clickSaveBtn();

	}

	@When("user clicks edit skills button")
	public void user_clicks_edit_skills_button() {
		 pom.getSkillsPage().clickEditSkillsBtn();
	}

	@And("user enters skills")
	public void user_enters_skills() {
		    pom.getSkillsPage().scrollBySkillsContainer();
	        pom.getSkillsPage().cancelSkill();
	}

	@And("user saves skills")
	public void user_saves_skills() {
			pom.getSkillsPage().saveBtn();
	}
	
	@When("user enters Skils again")
	public void user_enters_skils_again() {
		pom.getSkillsPage().scrollBySkillsContainer();
		pom.getSkillsPage().clickTextbox();
	    pom.getSkillsPage().setSkills();
	}
	
	@And("user saves skills again")
	public void user_saves_skills_again() {
		pom.getSkillsPage().saveBtn();
	}

	@When("user clicks edit education button")
	public void user_clicks_edit_education_button() {
		 pom.getEducationPage().clicEditEducationBtn();

	}

	@And("user enters qualification")
	public void user_enters_qualification() {
		  pom.getEducationPage().setQualification();

	}

	@And("user enters specialization")
	public void user_enters_specialization() {
		pom.getEducationPage().setSpecilization();

	}

	@And("user selects university")
	public void user_selects_university() {
		pom.getEducationPage().setUniversity();

	}

	@And("user enters university name")
	public void user_enters_university_name() {
		pom.getEducationPage().enterUniversity();

	}

	@And("user selects passing year")
	public void user_selects_passing_year() {
		pom.getEducationPage().setYearPassingOut();

	}

	@And("user selects education type")
	public void user_selects_education_type() {
		pom.getEducationPage().clickEducationType();

	}

	@And("user saves education")
	public void user_saves_education() {
		pom.getEducationPage().clickOnSaveBtn();

	}

	@When("user clicks edit job preference button")
	public void user_clicks_edit_job_preference_button() {
		pom.getJobPreferencePage().clickEditJobPreferenceBtn();

	}

	@And("user enters job preferences")
	public void user_enters_job_preferences() {
		  pom.getJobPreferencePage().deletePreferreJobTile();
	        pom.getJobPreferencePage().deletePreferreJobLocation();
	        pom.getJobPreferencePage().setPreferredJobTitle();
	        pom.getJobPreferencePage().setPreferredLocation();

	}

	@And("user saves job preferences")
	public void user_saves_job_preferences() {
		 pom.getJobPreferencePage().clickOnSaveBtn();

	}

	@And("user clicks edit certification button")
	public void user_clicks_edit_certification_button() {
		 pom.getCoursesAndCertificationPage().clickOnEditBtnoursesAndCertification();

	}

	@When("user enters certification name")
	public void user_enters_certification_name() {
		 pom.getCoursesAndCertificationPage().enterCerterficationName();

	}

	@And("user enters issued by")
	public void user_enters_issued_by() {
		pom.getCoursesAndCertificationPage().issuredBy();

	}

	@And("user saves certification")
	public void user_saves_certification() {
		 pom.getCoursesAndCertificationPage().clickOnSaveBtn();

	}

}
