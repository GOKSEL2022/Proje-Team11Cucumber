@US22_AC02,@team11
Feature: Admin_ekleme

  Background: Admin olarak login olma durumu
    Given rabia "https://www.managementonschools.com" gider.
    When rabia admin olarak giris yapar.
    When rabia  Add Admin bölümünün oldugunu dogrular.

  @US22_AC02_TC01
  Scenario: AC02_TC01 Surname kutusuna değer girilmesi durumu
    And rabia namee kutusuna tıklar.
    And rabia name kutusuna "name" girer.
    And rabia bir saniye bekler
    And rabia surnamee kutusuna "surname" girer
    And rabia bir saniye bekler
    And rabia birthPLacee kutusuna "birth Place" girer.
    And rabia bir saniye bekler
    And rabia gender secer.
    And rabia bir saniye bekler
    And rabia Date Of Birth kutusuna "Date Of Birth" gırer.
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
    And rabia bir saniye bekler
    Then Add Admin işlemi başarılı bir şekilde gerceklesir.
    Then rabia sayfayı kapatır.

  @US22_AC02_TC02
  Scenario: AC02_TC02 Surname kutusunun bos bırakılması durumu
    And rabia namee kutusuna tıklar.
    And rabia name kutusuna "name" girer.
    And rabia bir saniye bekler
    And rabia surnamee kutusuna "" girer
    And rabia bir saniye bekler
    And rabia birthPLacee kutusuna "birth Place" girer.
    And rabia bir saniye bekler
    And rabia gender secer.
    And rabia bir saniye bekler
    And rabia Date Of Birth kutusuna "Date Of Birth" gırer.
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
    And rabia bir saniye bekler
    And rabia surname kutusu altında required yazısının oldugunu gorur.

    Then rabia sayfayı kapatır.

  @US22_AC02_TC03
  Scenario: AC02_TC03 Surname kutusuna space karakteri girilmesi durumu
    And rabia namee kutusuna tıklar.
    And rabia name kutusuna "name" girer.
    And rabia bir saniye bekler
    And rabia surnamee kutusuna " " girer
    And rabia surname kutusu altında required yazısının kaltıgını gorur.
    And rabia bir saniye bekler
    And rabia birthPLacee kutusuna "birth Place" girer.
    And rabia bir saniye bekler
    And rabia gender secer.
    And rabia bir saniye bekler
    And rabia Date Of Birth kutusuna "Date Of Birth" gırer.
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
    And rabia bir saniye bekler
    And rabia admin ekleme isleminin gerçeklesmediğini dogrular.
    Then rabia sayfayı kapatır.