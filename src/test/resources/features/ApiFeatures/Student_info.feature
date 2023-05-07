@studentInfo
Feature: Add_Student_info
  Scenario: TC17_Add_Student_info_POST
    Given teacher sends the student info data_POST
    Then teacher gets the student info data and assert_POST


  Scenario: TC17_Add_Student_info_PUT
    Given teacher sends the student info data_PUT
    Then teacher gets the student info data and assert_PUT

  Scenario: TC17_Add_Student_info_DELETE
    Given teacher sends the student info data_DELETE
    Then teacher gets the student info data and assert_DELETE

  @smoke
  Scenario: TC17_Add_Student_info_GET
    Given teacher sends the student info data_GET
   Then teacher gets the student info data and assert_GET