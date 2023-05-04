@AC15_student
Feature:

  Scenario: US15_student_as_a_admin_post
    Given Fatih admin sends the student data_POST
    Then Fatih admin gets the student data and assert_POST


  Scenario: TC15_student_as_a_admin_put
    Given Fatih admin sends the student data_PUT
    Then Fatih admin gets the student data and assert_PUT


  Scenario Outline: TC15_student_as_a_admin_GET
    Given Fatih admin sends the student data_GET userId "<userId>"
    Then Fatih admin gets the student data and and assert_GET username="<username>" name="<name>" surname="<surname>" birthDay="<birthDay>" birthPlace="<birthPlace>" phoneNumber="<phoneNumber>" gender="<gender>" studentNumber="<studentNumber>" motherName ="<motherName>" fatherName = "<fatherName>" email="<email>" active="<active>"
    Examples:
      | userId | username      | name     | surname | birthDay   | birthPlace | phoneNumber  | gender | studentNumber | motherName | fatherName | email                | active |
      | 662    | kalmelikatmet | username | kaskkc  | 1999-09-12 | konya      | 235-524-8872 | MALE   | 1658          | ummu       | aliosman   | fatih987@hotmail.com | true   |

      #     {
      #    "object": {
      #        "userId": 662,
      #        "username": "kalmelikatmet",
      #        "name": "username",
      #        "surname": "kaskkc",
      #        "birthDay": "1999-09-12",
      #        "birthPlace": "konya",
      #        "phoneNumber": "235-524-8872",
      #        "gender": "MALE",
      #        "studentNumber": 1658,
      #        "motherName": "ummu",
      #        "fatherName": "aliosman",
      #        "email": "fatih987@hotmail.com",
      #        "active": true
      #    },
      #    "message": "Student saved Successfully"

  Scenario: TC15_student_as_a_admin_DELETE
    Given Fatih admin sends the student data_DELETE
    Then Fatih admin gets the student data and assert_DELETE