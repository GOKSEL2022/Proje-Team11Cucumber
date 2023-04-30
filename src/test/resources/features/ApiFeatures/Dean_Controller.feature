@Dean_Controller
Feature: Dean_Controller

  Scenario: TC01_Validate_Dean_Post
    Given Set the Url dean_post
    And   Set the expected data dean_post
    When  Send the request and get the response dean_post
    Then  Do assertion dean_post