@Admin_Controller
Feature: Admin_Controller

  Scenario: TC01_Validate_Admin_Post
    Given Set the Url admin_post
    And   Set the expected data admin_post
    When  Send the request and get the response admin_post
    Then  Do assertion admin_post

  Scenario: TC02_Validate_Admin_GetAll
    Given Set the Url admin_getAll
    And   Set the expected data admin_getAll
    When  Send the request and get the response admin_getAll
    Then  Do assertion admin_getAll

#    Scenario: TC03_Validate_Admin_Delete

 #     Given Set the url Admin_Delete
  #    And   Set the expected data Admin_Delete
   #   When  Send the request and get the response Admin_Delete
    #  Then  Do assertion Admin_Delete

