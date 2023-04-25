@ApiGetTeacher
Feature: Get_Teacher

  Scenario: TC05_Validate_Teacher
    Given get a token with "Admin" username and "485424698" password
    And send get request to get teacher
    Then validate body