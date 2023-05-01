@ApiGetTeacher
Feature: Get_Teacher

  Scenario: TC05_Validate_Teacher

    Given send get request to get teacher
    Then validate body