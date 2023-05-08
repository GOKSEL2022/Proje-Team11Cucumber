@team11Regression
Feature: Kullanıcılar sayfadan mesaj gönderebilmelidir.(Contact)

  Scenario Outline: US03 Mesajı doğrula (DataBase)
    #Scenario Outline ile istediğim email ile sorgu yapabilirim
    Given "<email>" ile mesaji al
    Then resultSet ile veriyi dogrula: name="<name>", email="<email>", subject="<subject>", message="<message>", date="<date>"

    Examples:
      | name      | email          | subject  | message                            | date       |
      | mehmetali | abcx@gmail.com | materyal | materyal eksiklerinin tamamlanmasi | 2023-05-07 |
    #Buraya girdiğim data test classında çağrılan data ile karşılaştırılıp doğrulanacak

