@Dean_ControllerPostGetAll @team11Regression  @team11Smoke @admin @sunum
Feature:Admin Dean ekleyebilmeli
  Scenario Outline: US04_AC01_TC01 Oluşan Dean'i doğrula (Api)
    #Tüm Dean öğeleri içinden groovy ile eleme yaparak istediğim Dean'e ulaşabilirim. Yada id ile de request gönderebilirim.
    Given Ali Get request ile tum Deanleri al
    Then Ali bodyi dogrula: userId="<userId>", username="<username>", name="<name>", surname="<surname>", birthDay="<birthDay>", ssn="<ssn>", birthPlace="<birthPlace>", phoneNumber="<phoneNumber>", gender="<gender>"

    Examples:
      | userId | username | name    | surname | birthDay   | ssn         | birthPlace  | phoneNumber  | gender |
      | 48     | hasan    | veli    | tarik   | 2000-01-01 | 405-48-6721 | van         | 130-545-2974 | MALE   |









#
# {
# "userId": 200,
# "username": "hasan36",
# "name": "veli",
# "surname": "tarik",
# "birthDay": "2000-01-01",
# "ssn": "405-47-6721",
# "birthPlace": "van",
# "phoneNumber": "230-545-2004",
# "gender": "MALE"
# },
    #
 #{
 #"userId": 48,
 #"username": "hasan",
 #"name": "veli",
 #"surname": "tarik",
 #"birthDay": "2000-01-01",
 #"ssn": "405-48-6721",
 #"birthPlace": "van",
 #"phoneNumber": "130-545-2974",
 #"gender": "MALE"
 #},
#{delete yaptigim veriler
#"userId": 42,
#"username": "VeliAli",
#"name": "veli",
#"surname": "kim",
#"birthDay": "2000-01-01",
#"ssn": "415-58-6721",
#"birthPlace": "van",
#"phoneNumber": "090-545-1974",
#"gender": "MALE"
#},{ gelen mesaj silme
#    "message": "Dean Deleted",
#    "httpStatus": "OK"
#}
#
#