Feature:  Kullanıcı admin ekleyebilmelidir.(Contact)

  Scenario Outline:
    Given Database icin contact saglanir
    Then Rabia user creates message
    Then body should be like: id="<id>" date="<date>" email="<email>" message="<message>" name="<name>" subject="<subject>"
    Examples:
      | id | date | email | message | name | subject |
      | id | date | email | message | name | subject |
