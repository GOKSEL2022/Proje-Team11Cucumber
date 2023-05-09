@US22_AC03 @team11 @US22 @team11Regression
Feature: Admin_ekleme

  Background: Admin olarak login olma durumu
    Given rabia "http://139.59.159.36:3000/" gider.
    When rabia admin olarak giris yapar.
    When rabia  Add Admin bölümünün oldugunu dogrular.

  @US22_AC03_TC01
  Scenario: AC03_TC01 Birth Place kutusuna valid bir değer girilmesi durumu
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

  @US22_AC03_TC02
  Scenario: AC03_TC02 Birth Place kutusunun bos bırakılması durumu
    And rabia namee kutusuna tıklar.
    And rabia name kutusuna "name" girer.
    And rabia bir saniye bekler
    And rabia surnamee kutusuna "surname" girer
    And rabia bir saniye bekler
    #And rabia birthPLacee kutusuna "" girer.
    And rabia birtPlace kutusu altında required yazısının oldugunu gorur.
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

    Then rabia sayfayı kapatır.

  @US22_AC03_TC03
  Scenario: AC03_TC03 Birth Place kutusuna space karakteri girilmesi durumu
    And rabia namee kutusuna tıklar.
    And rabia name kutusuna "name" girer.
    And rabia bir saniye bekler
    And rabia surnamee kutusuna "surname" girer
    And rabia bir saniye bekler
    And rabia birthPLacee kutusuna space " " girer.
    #And rabia birtPlace kutusu altında required yazısının kaltıgını gorur.
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
    And rabia Your birth place must consist of the characters yazısını görür.
    Then rabia sayfayı kapatır.