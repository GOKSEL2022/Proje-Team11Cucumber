@final_notu @team11Regression
Feature:Midterm_ve_Final_Exam

  Scenario: Midterm ve Final Exam notu girebilmelidir.

    Given kullanici55 url e gider
    When kullanici55 ana sayfada login butonuna tiklar
    And kullanici55 teacher olarak username girer
    And kullanici55 teacher olarak password girer
    And kullanici55 login sayfasinda login butona tiklar
    And kullanici55 student info management yazisini gorur
    And kullanici55 choose lesson dan bir ders secer
    And  kullaninin sectigi dersi gorur
    And kullanici55 choose student den bir ogrenci secer ve gorur
    And  kullanici55 choose education term den donem secer ve gorur
    Then kullanici55 absentee ye devamsizlik girer ve gorur
    And kullanici55 midterm exam a not girer ve gorur
    And kullanici55 final exam a not girer ve gorur
    Then close the application
