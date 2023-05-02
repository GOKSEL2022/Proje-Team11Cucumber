@ApiViceDeanController @admin
Feature: Vice_Dean_Controller_Get01

  Scenario Outline: Vice_Dean_Controller_Get01
    Given Nilufer Send query to get guest user by userId="<iduserId>"
    Then Nilufer body should be like : username="<username>" name="<name>" surname="<surname>" birthDay="<birthDay>" sss="<ssn>" birthPlace="<birthPlace>" phoneNumber"<phoneNumber>" gender="<gender>"
    Examples:
      | userId | username         | name    | surname | birthDay   | ssn         | birthPlace  | phoneNumber  | gender |
      | 2      | roderick.okuneva | Nicolle | Haley   | 2000-01-01 | 890-96-3848 | Dominictown | 240-640-1805 | MALE   |