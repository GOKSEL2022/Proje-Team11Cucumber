@ogrencibilgileri
Feature:ogrenci_bilgileri
  Scenario:teacher ogrenci bilgilerini gorebilmeli


    Given kullanici url e gider
    When kullanici ana sayfada login butonuna tiklar
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
