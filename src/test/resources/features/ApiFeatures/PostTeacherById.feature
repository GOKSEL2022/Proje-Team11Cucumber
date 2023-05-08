@teacher
  Feature: Admin teacher ekleyebilmeli

    @admin @emin
    Scenario Outline:US20_olusan teacher`i dogrula
      Given emin Get request ile tum Teacher al
      Then emin bodyi dogrula: userId="<userId>", username="<username>", name="<name>", surname="<surname>", birthDay="<birthDay>", ssn="<ssn>", birthPlace="<birthPlace>", phoneNumber="<phoneNumber>", gender="<gender>",email="<email>"

      Examples:
        | userId | username | name   | surname | birthDay | ssn        | birthPlace | phoneNumber  | gender | email          |  |
        | 1352   | mehmet   | team11 | alican  | birthDay | 2002-01-01 | alaman     | 123-145-7896 | MALE   | xcgh@gmail.com |  |

    #
    #
    #{
    #    "object": {
    #        "userId": 1352,
    #        "username": "mehmet",
    #        "name": "team11",
    #        "surname": "alican",
    #        "birthDay": "2002-01-01",
    #        "ssn": "145-45-4589",
    #        "birthPlace": "alaman",
    #        "phoneNumber": "123-145-7896",
    #        "gender": "MALE",
    #        "email": "xcgh@gmail.com"
    #    },
    #    "message": "Teacher saved successfully",
    #    "httpStatus": "CREATED"
    #}
