@ders_oğrenci_ve_dönem_sec
Feature: Ders_Öğrenci_ve_dönem_seç

  Scenario: Ders, Ögrenci ve dönem seçmelidir
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
