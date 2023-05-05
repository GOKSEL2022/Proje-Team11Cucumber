@ApiGuestUser @Api @End2End_GuestUser
Feature: US01_Guest_User

  Scenario Outline: US01_Get_GuestUserById

    Given Send getAll request by id "<id>"
    Then body should be: username="<username>" ssn="<ssn>" name="<name>" surname="<surname>" birthDay="<birthDay>" birthPlace="<birthPlace>" phoneNumber="<phoneNumber>" gender="<gender> " built_in "<built_in>"
    Examples:
      | id  | username | ssn         | name    | surname | birthDay   | birthPlace | phoneNumber  | gender | built_in |
      | 393 | Ali123   | 234-56-1902 | Aliveli | ahmet   | 1990-10-10 | ali        | 321-435-8907 | MALE   | false    |
