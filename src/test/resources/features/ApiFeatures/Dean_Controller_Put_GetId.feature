@DeanPutGetId  @admin
Feature: US02_Guest_User

#US04'ün aynısı
  Scenario Outline: US05 AC01 TC01 Admin Guest User List, Name, Phone Number, SSN, User Name bilgilerini görebilmeli

    Given Ali guncelledigin deani by id ile al id="<id>"
    Then Ali body should be:id="<id>" username="<username>" name="<name>" surname="<surname>" birthDay="<birthDay>" ssn="<ssn>" birthPlace="<birthPlace>" phoneNumber="<phoneNumber>" gender="<gender>"

    Examples:
      | id  | username | name   | surname |  birthDay  |      ssn     | birthPlace  | phoneNumber  | gender |
      | 29  | hasanPut |veliPut |tarikPut | 2000-01-01 | 415-48-6721  |    van      | 230-545-2974 | MALE   |


