@US22_AC09
Feature: Admin_ekleme

  Background: Admin olarak login olma durumu
    Given Kullanıcı "https://www.managementonschools.com" gider.
    When Kullanıcı admin olarak giris yapar.
    When Kullanıcı  Add Admin bölümünün oldugunu dogrular.

  @US22_AC09_TC01
  Scenario: AC09_TC01 Password kutusuna 7 karakter girme durumu
    And Kullanıcı namee kutusuna tıklar.
    And Kullanıcı name kutusuna "name" girer.
    And Kullanıcı bir saniye bekler
    And Kullanıcı surnamee kutusuna "surname" girer
    And Kullanıcı bir saniye bekler
    And Kullanıcı birthPLacee kutusuna "birth Place" girer.
    And Kullanıcı bir saniye bekler
    And Kullanıcı gender olarak female secer.
    And Kullanıcı bir saniye bekler
    And Kullanıcı Date Of Birth kutusuna gecerli bir tarih girer.
    And Kullanıcı bir saniye bekler
    And Kullanıcı Phone kutusuna "Phone" gırer
    And Kullanıcı bir saniye bekler
    And Kullanıcı SSN kutusuna SSN gırer
    And Kullanıcı bir saniye bekler
    And Kullanıcı username kutusuna "username" gırer.
    And Kullanıcı bir saniye bekler
    And Kullanıcı Password kutusuna invalid deger "1234567" gırer
    And Kullanıcı bir saniye bekler
    And Kullanıcı submit butonuna tıklar.
    And Kullanıcı password kutusu altında uyarı mesajı gördügünü dogrular
    Then Kullanıcı sayfayı kapatır.

  @US22_AC09_TC02
  Scenario: AC09_TC02 Password kutusuna 8 karakter girme durumu
    And Kullanıcı namee kutusuna tıklar.
    And Kullanıcı name kutusuna "name" girer.
    And Kullanıcı bir saniye bekler
    And Kullanıcı surnamee kutusuna "surname" girer
    And Kullanıcı bir saniye bekler
    And Kullanıcı birthPLacee kutusuna "birth Place" girer.
    And Kullanıcı bir saniye bekler
    And Kullanıcı gender olarak female secer.
    And Kullanıcı bir saniye bekler
    And Kullanıcı Date Of Birth kutusuna gecerli bir tarih girer.
    And Kullanıcı bir saniye bekler
    And Kullanıcı Phone kutusuna "Phone" gırer
    And Kullanıcı bir saniye bekler
    And Kullanıcı SSN kutusuna SSN gırer
    And Kullanıcı bir saniye bekler
    And Kullanıcı username kutusuna "username" gırer.
    And Kullanıcı bir saniye bekler
    And Kullanıcı Password kutusuna "password" gırer
    And Kullanıcı bir saniye bekler
    And Kullanıcı submit butonuna tıklar.
    Then Add Admin işlemi başarılı bir şekilde gerceklesir.
    Then Kullanıcı sayfayı kapatır.

  @US22_AC09_TC03
  Scenario: AC09_TC03 Password kutusuna 9 karakter girme durumu
    And Kullanıcı namee kutusuna tıklar.
    And Kullanıcı name kutusuna "name" girer.
    And Kullanıcı bir saniye bekler
    And Kullanıcı surnamee kutusuna "surname" girer
    And Kullanıcı bir saniye bekler
    And Kullanıcı birthPLacee kutusuna "birth Place" girer.
    And Kullanıcı bir saniye bekler
    And Kullanıcı gender olarak female secer.
    And Kullanıcı bir saniye bekler
    And Kullanıcı Date Of Birth kutusuna gecerli bir tarih girer.
    And Kullanıcı bir saniye bekler
    And Kullanıcı Phone kutusuna "Phone" gırer
    And Kullanıcı bir saniye bekler
    And Kullanıcı SSN kutusuna SSN gırer
    And Kullanıcı bir saniye bekler
    And Kullanıcı username kutusuna "username" gırer.
    And Kullanıcı bir saniye bekler
    And Kullanıcı Password kutusuna dokuz karakter "123456789" gırer
    And Kullanıcı bir saniye bekler
    And Kullanıcı submit butonuna tıklar.
    Then Add Admin işlemi başarılı bir şekilde gerceklesir.
    Then Kullanıcı sayfayı kapatır.

  @US22_AC09_TC04
  Scenario: AC09_TC04 Password kutusunun boş bırakılması durumu
    And Kullanıcı namee kutusuna tıklar.
    And Kullanıcı name kutusuna "name" girer.
    And Kullanıcı bir saniye bekler
    And Kullanıcı surnamee kutusuna "surname" girer
    And Kullanıcı bir saniye bekler
    And Kullanıcı birthPLacee kutusuna "birth Place" girer.
    And Kullanıcı bir saniye bekler
    And Kullanıcı gender olarak female secer.
    And Kullanıcı bir saniye bekler
    And Kullanıcı Date Of Birth kutusuna gecerli bir tarih girer.
    And Kullanıcı bir saniye bekler
    And Kullanıcı Phone kutusuna "Phone" gırer
    And Kullanıcı bir saniye bekler
    And Kullanıcı SSN kutusuna SSN gırer
    And Kullanıcı bir saniye bekler
    And Kullanıcı username kutusuna "username" gırer.
    And Kullanıcı bir saniye bekler
    And Kullanıcı Password kutusuna "" gırer
    And Kullanıcı submit butonuna tıklar.
    And Kullanıcı password kutusu altında required yazısının gorunur oldugunu dogrular
    Then Kullanıcı sayfayı kapatır.