@Admin_Controller @gokselAPI @admin
Feature: Admin_Controller

  Scenario: TC01_Validate_Admin_Post
    Given Set the Url admin_post
    And   Set the expected data admin_post
    When  Send the request and get the response admin_post
    Then  Do assertion admin_post

  Scenario Outline: TC02_Validate_Admin_GetAll
    Given Send Adminn_GetAll request by id "<id>"
    Then Admin_GetAll body should be: username="<username>" ssn="<ssn>" name="<name>" surname="<surname>" birthDay="<birthDay>" birthPlace="<birthPlace>" phoneNumber="<phoneNumber>" gender="<gender>" built_in="<built_in>"
    Examples:
      | id | username | ssn         | name    | surname | birthDay   | birthPlace | phoneNumber  | gender | built_in |
      | 45 | Mustafa  | 188-11-9380 | Atatürk | Kemal   | 1881-05-05 | selanik    | 938-938-3838 | MALE   | false    |


  Scenario: TC03_Validate_Admin_Delete

      Given Set the url Admin_Delete
      When   Set the expected data Admin_Delete
      And Send the request and get the response Admin_Delete
      Then  Do assertion Admin_Delete

 # {
 # "id": 45,
 # "username": "Mustafa",
 # "ssn": "188-11-9380",
 # "name": "Atatürk",
 # "surname": "Kemal",
 # "birthDay": "1881-05-05",
 # "birthPlace": "selanik",
#  "phoneNumber": "938-938-3838",
 # "gender": "MALE",
#  "built_in": false
 # }

