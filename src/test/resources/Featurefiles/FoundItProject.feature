Feature: FoundIt Project End to End

  Background: 
    Given user is logged into FoundIt application
    And user is on update profile page

  Scenario: Profile Summary Functionality
    When user clicks edit profile summary button
    And user enters profile summary details
    And user saves profile summary

  Scenario: Resume Upload Functionality
    When user clicks upload resume button
    And user uploads resume file

  Scenario: Work Experience Functionality
    When user clicks edit work experience button
    And user enters job title
    And user enters company name
    And user selects start year
    And user selects start month
    And user enters salary
    And user selects notice period
    And user selects industry type
    And user saves work experience

  Scenario: Skill Functionality
    When user clicks edit skills button
    And user enters skills
    And user saves skills
    When user clicks edit skills button
    And user enters Skils again
    And user saves skills again

  Scenario: Education Functionality
    When user clicks edit education button
    And user enters qualification
    And user enters specialization
    And user selects university
    And user enters university name
    And user selects passing year
    And user selects education type
    And user saves education

  Scenario: Job Preferences Functionality
    When user clicks edit job preference button
    And user enters job preferences
    And user saves job preferences

  Scenario: Courses and Certification Functionality
    When user clicks edit certification button
    And user enters certification name
    And user enters issued by
    And user saves certification
