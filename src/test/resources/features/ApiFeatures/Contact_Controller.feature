@team11Regression
Feature:Contact_Controller

  Scenario:US03_TC01 Post Message Positive Testing
    Given Set the Url post message
    And   Set the expected data post message
    When  Send the request and get the response post message
  #Then  Do assertion post message


  Scenario Outline: US07_TC01 Contact Message Get All
    Given Set the Url contact_message_getAll
    When  Send the request and get the response contact_message_getAll
    Then  Do assertion body name="<name>", email="<email>", subject="<subject>", message="<message>", date="<date>"
    Examples:
      | name   | email            | subject     | message   | date       |
      | asdafds | sdfasdfasf@ksjs.com | qweqwewqer | qewrqerwrewerwrwetwtwtertreyre | 2023-05-07|


  Scenario: US07_TC02 Contact Message Get_searchByEmail
    Given Set the Url contact_message_get_searchByEmail
    When  Send the request and get the response contact_message_get_searchByEmail
    Then  Do assertion contact_message_get_searchByEmail

  Scenario: US07_TC03 Contact Message Get_searchBySubject
    Given Set the Url contact_message_get_searchBySubject
    When  Send the request and get the response contact_message_get_searchBySubject
    Then  Do assertion contact_message_get_searchBySubject


  Scenario: US22_TC01 Admin Controller Save Admin
    Given Set the Url admin_controller_postAdmin
    And   Set the expected data admin_controller_postAdmin
    When  Send the request and get the response admin_controller_postAdmin
    Then  Do assertion admin_controller_postAdmin

  Scenario: US22_TC02 Admin Controller Get All
    Given Set the Url admin_controller_getAll
    When  Send the request and get the response admin_controller_getAll
    Then  Do assertion admin_controller_getAll
#    Then Do assertion this body username="<username>" ssn="<ssn>" name="<name>" surname="<surname>" birthDay="<birthDay>" birthPlace="<birthPlace>" phoneNumber="<phoneNumber>" gender="<gender>" built_in="<built_in>"
#
#    Examples:
#      | username      | ssn         | name     | surname | birthDay   | birthPlace   | phoneNumber  | gender | built_in |
#      | donnell.bauch | 460-91-5996 | aaaaaaaa | Kub     | 2020-02-02 | North Shonna | 850-987-1345 | MALE   | false







