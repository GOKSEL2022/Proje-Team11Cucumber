@Api_contact_message
Feature:Contact Controller
  Scenario: TC01 Post Message Positive Testing
    Given Set the Url post message
    And   Set the expected data post message
    When  Send the request and get the response post message
    Then  Do assertion post message

  Scenario: TC02 Post Message Negative Testing
    Given Set the Url post message
    And   Set the expected data post message
    When  Send the request and get the response post message
    Then  Do assertion post message