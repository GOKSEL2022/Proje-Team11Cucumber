@gokselAPI @admin
Feature: GuestUser_Controller
  #Scenario: TC02_Validate_GuestUser_Post
   # Given Set the Url GuestUser_post
   # And   Set the expected data GuestUser_post
   # When  Send the request and get the response GuestUser_post
   # Then  Do assertion GuestUser_post

  @admin @team11Smoke
    Scenario Outline: TC02_Validate_GuestUser_GetAll
      Given Send GuestUser_GetAll request by id "<id>"
      Then GuestUser_GetAll body should be: username="<username>" ssn="<ssn>" name="<name>" surname="<surname>" birthDay="<birthDay>" birthPlace="<birthPlace>" phoneNumber="<phoneNumber>" gender="<gender>"
    Examples:
      | id  | username | ssn         | name   | surname | birthDay   | birthPlace    | phoneNumber  | gender |
      | 620 | Elmer    | 169-42-9337 | 123456 | Welch   | 1941-05-13 | Domenicmouth | 563-810-5776 | MALE   |


  @admin @team11Smoke
      Scenario: TC02_Validate_GuestUser_Delete
        Given Set the url GuestUser_Delete
        When   Set the expected data GuestUser_Delete
        And Send the request and get the response GuestUser_Delete
        Then  Do assertion GuestUser_Delete