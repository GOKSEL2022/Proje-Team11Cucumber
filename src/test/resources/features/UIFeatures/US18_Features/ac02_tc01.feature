@edit_not @team11Regression
Feature:edit_not
  Scenario:Öğrenci Not bilgisini güncelleyebilmeli
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
    And kullanici55 info note a bilgi notu girer ve gorur
    And kullanici55 submit buton a tiklar
    Then kullanici55 student Info saved succesfully popup yazisini gorur
        And kullanici55 edit buton a tiklar
    And kullanici55 edit yapacagi dersi secer
    And kullanici55 edit yapacagi donemi secer
    And kullanici55 ogrencinin guncel final notunu "99" girer
    And kullanici55 edit student Info sayfasinda submit butona tiklar
    Then kullanici55 Student Info updadet Successfully popup yazisini gorur
    Then close the application