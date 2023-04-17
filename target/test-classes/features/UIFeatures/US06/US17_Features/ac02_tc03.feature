
  Feature:
    Scenario:
      Given kullanici url e gider
      When kullanici ana sayfada login butonuna tiklar
      And  kullanici admin olarak username girer
      And kullanici admin olarak password girer
      And   kullanici login sayfasinda login butona tiklar
      And kullanici menu butonuna tiklar
      And   kullanici teacher management butona tiklar
      And  teacher sayfasinda add teacher yazisi gorulur
      And  kullanici add teacher alanina bilgileri girer ve submit butona tiklar
      Then kullanici teacher saved successfully pup up yazisini gorur
      And kullanici menu butonuna tiklar
      And kullanici logout butonuna tiklar ve
      And kullanici yes butona tiklayarak cikis yapar
      And kullanici teacher olarak username girer
      And kullanici teacher olarak password girer
      And kullanici login sayfasinda login butona tiklar
      And kullanici student info management yazisini gorur
      And kullanici choose lesson dan bir ders secer
      And  kullaninin sectigi dersi gorur
      And kullanici choose student den bir ogrenci secer ve gorur
      And  kullanici choose education term den donem secer ve gorur
      Then kullanici absentee ye devamsizliga buyuk deger girer "999999999" ve gorur
      And kullanici midterm exam a not girer ve gorur
      And kullanici final exam a not girer ve gorur
      And kullanici info note a bilgi notu girer ve gorur
      And kullanici submit buton a tiklar
      Then kullanici student Info saved succesfully popup yazisini gorur