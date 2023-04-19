@US22_AC09,@team11
Feature: Admin_ekleme

  Background: Admin olarak login olma durumu
    Given rabia "https://www.managementonschools.com" gider.
    When rabia admin olarak giris yapar.
    When rabia  Add Admin bölümünün oldugunu dogrular.

  @US22_AC09_TC01
  Scenario: AC09_TC01 Password kutusuna 7 karakter girme durumu
    And rabia namee kutusuna tıklar.
    And rabia name kutusuna "name" girer.
    And rabia bir saniye bekler
    And rabia surnamee kutusuna "surname" girer
    And rabia bir saniye bekler
    And rabia birthPLacee kutusuna "birth Place" girer.
    And rabia bir saniye bekler
    And rabia gender olarak female secer.
    And rabia bir saniye bekler
    And rabia Date Of Birth kutusuna gecerli bir tarih girer.
    And rabia bir saniye bekler
    And rabia Phone kutusuna "Phone" gırer
    And rabia bir saniye bekler
    And rabia SSN kutusuna SSN gırer
    And rabia bir saniye bekler
    And rabia username kutusuna "username" gırer.
    And rabia bir saniye bekler
    And rabia Password kutusuna invalid deger "1234567" gırer
    And rabia bir saniye bekler
    And rabia submit butonuna tıklar.
    And rabia password kutusu altında uyarı mesajı gördügünü dogrular
    Then rabia sayfayı kapatır.

  @US22_AC09_TC02
  Scenario: AC09_TC02 Password kutusuna 8 karakter girme durumu
    And rabia namee kutusuna tıklar.
    And rabia name kutusuna "name" girer.
    And rabia bir saniye bekler
    And rabia surnamee kutusuna "surname" girer
    And rabia bir saniye bekler
    And rabia birthPLacee kutusuna "birth Place" girer.
    And rabia bir saniye bekler
    And rabia gender olarak female secer.
    And rabia bir saniye bekler
    And rabia Date Of Birth kutusuna gecerli bir tarih girer.
    And rabia bir saniye bekler
    And rabia Phone kutusuna "Phone" gırer
    And rabia bir saniye bekler
    And rabia SSN kutusuna SSN gırer
    And rabia bir saniye bekler
    And rabia username kutusuna "username" gırer.
    And rabia bir saniye bekler
    And rabia Password kutusuna "password" gırer
    And rabia bir saniye bekler
    And rabia submit butonuna tıklar.
    Then Add Admin işlemi başarılı bir şekilde gerceklesir.
    Then rabia sayfayı kapatır.

  @US22_AC09_TC03
  Scenario: AC09_TC03 Password kutusuna 9 karakter girme durumu
    And rabia namee kutusuna tıklar.
    And rabia name kutusuna "name" girer.
    And rabia bir saniye bekler
    And rabia surnamee kutusuna "surname" girer
    And rabia bir saniye bekler
    And rabia birthPLacee kutusuna "birth Place" girer.
    And rabia bir saniye bekler
    And rabia gender olarak female secer.
    And rabia bir saniye bekler
    And rabia Date Of Birth kutusuna gecerli bir tarih girer.
    And rabia bir saniye bekler
    And rabia Phone kutusuna "Phone" gırer
    And rabia bir saniye bekler
    And rabia SSN kutusuna SSN gırer
    And rabia bir saniye bekler
    And rabia username kutusuna "username" gırer.
    And rabia bir saniye bekler
    And rabia Password kutusuna dokuz karakter "123456789" gırer
    And rabia bir saniye bekler
    And rabia submit butonuna tıklar.
    Then Add Admin işlemi başarılı bir şekilde gerceklesir.
    Then rabia sayfayı kapatır.

  @US22_AC09_TC04
  Scenario: AC09_TC04 Password kutusunun boş bırakılması durumu
    And rabia namee kutusuna tıklar.
    And rabia name kutusuna "name" girer.
    And rabia bir saniye bekler
    And rabia surnamee kutusuna "surname" girer
    And rabia bir saniye bekler
    And rabia birthPLacee kutusuna "birth Place" girer.
    And rabia bir saniye bekler
    And rabia gender olarak female secer.
    And rabia bir saniye bekler
    And rabia Date Of Birth kutusuna gecerli bir tarih girer.
    And rabia bir saniye bekler
    And rabia Phone kutusuna "Phone" gırer
    And rabia bir saniye bekler
    And rabia SSN kutusuna SSN gırer
    And rabia bir saniye bekler
    And rabia username kutusuna "username" gırer.
    And rabia bir saniye bekler
    And rabia Password kutusuna "" gırer
    And rabia submit butonuna tıklar.
    And rabia password kutusu altında required yazısının gorunur oldugunu dogrular
    Then rabia sayfayı kapatır.