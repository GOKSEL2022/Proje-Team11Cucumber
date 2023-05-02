@GuestUser_Controller
Feature: GuestUser_Controller

  Scenario: TC01_Validate_GuestUser_Post
    Given Set the Url GuestUser_post
    And   Set the expected data GuestUser_post
    When  Send the request and get the response GuestUser_post
    Then  Do assertion GuestUser_post