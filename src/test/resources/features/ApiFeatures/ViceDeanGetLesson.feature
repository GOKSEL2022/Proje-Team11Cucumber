@ApiViceDeanController @vicedean
Feature: Vice_Dean_GetAll01

  Scenario Outline: Vice_Dean_GetAll01
    Given Mdogan Send query to get guest user by lessonId="<lessonId>"
    Then Mdogan body should be like : lessonId="<lessonId>" lessonName="<lessonName>" creditScore="<creditScore>" compulsory="<compulsory>"

    Examples:
      | lessonId | lessonName | creditScore | compulsory |
      | 209      | Arapça     | 4           | false      |





