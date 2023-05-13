@exDevamsizlik @team11Regression
  Feature:valid olmayan bir devamsizlik
    Scenario:valid olmayan bir devamsizlik girer
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
      Then kullanici55 absentee ye devamsizliga buyuk deger girer "999999999" ve gorur
      And kullanici55 midterm exam a not girer ve gorur
      And kullanici55 final exam a not girer ve gorur
      And kullanici55 info note a bilgi notu girer ve gorur
      And kullanici55 submit buton a tiklar
      Then kullanici55 student Info saved succesfully popup yazisini gorur(gormez)
      Then close the application