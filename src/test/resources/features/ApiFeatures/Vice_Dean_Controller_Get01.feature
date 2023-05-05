@ApiViceDeanController @admin
Feature: Vice_Dean_Controller_GetAll

  Scenario Outline: Vice_Dean_Controller_GetAll
    #Tüm Dean öğeleri içinden groovy ile eleme yaparak istediğim Dean'e ulaşabilirim. Yada id ile de request gönderebilirim.
    Given Nilufer Get request ile tum Deanleri al
    Then Nilufer bodyi dogrula: userId="<userId>", username="<username>", name="<name>", surname="<surname>", birthDay="<birthDay>", ssn="<ssn>", birthPlace="<birthPlace>", phoneNumber="<phoneNumber>", gender="<gender>"
    Examples:
      | userId | username     | name   | surname | birthDay   | ssn         | birthPlace | phoneNumber  | gender |
      | 360    | yildizselcuk | Selcuk | Yildiz  | 1995-01-01 | 211-11-8904 | Istanbul   | 211-110-8904 | MALE   |
