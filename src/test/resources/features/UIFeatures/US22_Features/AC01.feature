@US22_AC01 @team11 @US22
Feature: Admin_ekleme

  Background: Admin olarak login olma durumu
    Given rabia "https://www.managementonschools.com" gider.
    When rabia admin olarak giris yapar.
    When rabia  Add Admin bölümünün oldugunu dogrular.

  @US22_AC01_TC02
  Scenario: AC01_TC02 Name kutusuna değer girilmesi durumu
    And rabia namee kutusuna tıklar.
    And rabia name kutusuna "name" girer.
    And rabia bir saniye bekler
    And rabia surnamee kutusuna "surname" girer
    And rabia bir saniye bekler
    #And rabia surname kutusu altında required yazısının kaltıgını gorur.
    And rabia birthPLacee kutusuna "birth Place" girer.
    And rabia bir saniye bekler
    #And rabia birtPlace kutusu altında required yazısının kaltıgını gorur.
    And rabia gender secer.
    And rabia bir saniye bekler
    And rabia Date Of Birth kutusuna "Date Of Birth" gırer.
    And rabia bir saniye bekler
    #And rabia date of birth kutusu altında required yazısının kaltıgını gorur.
    And rabia Phone kutusuna "Phone" gırer
    And rabia bir saniye bekler
    #And rabia phone kutusu altında required yazısının kaltıgını gorur.
    And rabia SSN kutusuna SSN gırer
    And rabia bir saniye bekler
    #And rabia ssn kutusu altında required yazısının kaltıgını gorur.
    And rabia username kutusuna "username" gırer.
    And rabia bir saniye bekler
    #And rabia username kutusu altında required yazısının kaltıgını gorur.
    And rabia Password kutusuna "password" gırer
    And rabia bir saniye bekler
    #And rabia password kutusu altında required yazısının kaltıgını gorur.
    And rabia submit butonuna tıklar.
    And rabia bir saniye bekler
    Then Add Admin işlemi başarılı bir şekilde gerceklesir.
    Then rabia sayfayı kapatır.


  @US22_AC01_TC03
  Scenario: AC01_TC03 Name kutusunun bos bırakılması durumu
    And rabia namee kutusuna tıklar.
    And rabia name kutusuna "" girer.
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
    And rabia name kutusu altında required yazısının oldugunu gorur.
    Then rabia sayfayı kapatır.


  @US22_AC01_TC04
  Scenario: AC01_TC04 Name kutusuna space karakteri girme durumu
    And rabia namee kutusuna tıklar.
    And rabia name kutusuna " " girer.
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
    And rabia admin ekleme isleminin gerçeklesmediğini dogrular.
    Then rabia sayfayı kapatır.