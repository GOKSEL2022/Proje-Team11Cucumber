@edit_not
Feature:edit_not

  Scenario:Öğrenci Not bilgisini güncelleyebilmeli

    When kullanici ana sayfada login butonuna tiklar
    And kullanici menu butonuna tiklar
    And kullanici teacher olarak username girer
    And kullanici teacher olarak password girer
    And kullanici login sayfasinda login butona tiklar
    And kullanici student info management yazisini gorur
    And kullanici choose lesson dan bir ders secer
    And  kullaninin sectigi dersi gorur
    And kullanici choose student den bir ogrenci secer ve gorur
    And  kullanici choose education term den donem secer ve gorur
    Then kullanici absentee ye devamsizlik girer ve gorur
    And kullanici midterm exam a not girer ve gorur
    And kullanici final exam a not girer ve gorur
    And kullanici info note a bilgi notu girer ve gorur
    And kullanici submit buton a tiklar
    Then kullanici student Info saved succesfully popup yazisini gorur
    And kullanici edit buton a tiklar
    And kullanici edit yapacagi dersi secer
    And kullanici edit yapacagi donemi secer
    And kullanici ogrencinin guncel notunu "100" girer
    And kullanici edit student Info sayfasinda submit butona tiklar
    Then kullanici Student Info updadet Successfully popup yazisini gorur