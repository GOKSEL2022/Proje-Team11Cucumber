@US22_AC07 @team11 @US22
Feature: Admin_ekleme

  Background: Admin olarak login olma durumu
    Given rabia "https://www.managementonschools.com" gider.
    When rabia admin olarak giris yapar.
    When rabia  Add Admin bölümünün oldugunu dogrular.

  @US22_AC07_TC01
  Scenario: AC07_TC01 SSN bölümüne  valid bir değer girme durumu
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
    Then Add Admin işlemin başarılı bir şekilde gerceklestigini dogrular.
    Then rabia sayfayı kapatır.

  @US22_AC07_TC02
  Scenario: AC07_TC02 SSN bölümüne daha önceden kayıtlı bir SSN girme durumu
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
    And rabia SSN kutusuna daha önceden kayıtlı "333-33-3333" gırer
    And rabia bir saniye bekler
    And rabia username kutusuna "username" gırer.
    And rabia bir saniye bekler
    And rabia Password kutusuna "password" gırer
    And rabia bir saniye bekler
    And rabia submit butonuna tıklar.
    Then rabia "Error: User with ssn 333-33-3333 already register" uyarısını aldıgını dogrular
    Then rabia sayfayı kapatır.

  @US22_AC07_TC03
  Scenario: AC07_TC03 SSN bölümüne  bir karakter fazla değer girme durumu
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
    And rabia SSN kutusuna invalid deger "333-33-33331" gırer
    And rabia bir saniye bekler
    And rabia username kutusuna "username" gırer.
    And rabia bir saniye bekler
    And rabia Password kutusuna "password" gırer
    And rabia bir saniye bekler
    And rabia submit butonuna tıklar.
    Then rabia Please enter valid SSN number uyarısını gorur
    Then rabia sayfayı kapatır.

  @US22_AC07_TC04
  Scenario: AC07_TC04 SSN bölümüne  bir karakter eksik değer girme durumu
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
    And rabia SSN kutusuna invalid deger "333-33-333" gırer
    And rabia bir saniye bekler
    And rabia username kutusuna "username" gırer.
    And rabia bir saniye bekler
    And rabia Password kutusuna "password" gırer
    And rabia bir saniye bekler
    And rabia submit butonuna tıklar.
    Then rabia "Minimum 11 character (XXX-XX-XXXX)" uyarısını gorur
    Then rabia sayfayı kapatır.

  @US22_AC07_TC05
  Scenario: AC07_TC05 SSN bölümüne  bir karakter harf girme durumu
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
    And rabia SSN kutusuna invalid deger "333-33-333h" gırer
    And rabia bir saniye bekler
    And rabia username kutusuna "username" gırer.
    And rabia bir saniye bekler
    And rabia Password kutusuna "password" gırer
    And rabia bir saniye bekler
    And rabia submit butonuna tıklar.
    Then rabia Please enter valid SSN number uyarısını gorur
    Then rabia sayfayı kapatır.

  @US22_AC07_TC06
  Scenario: AC07_TC06 SSN bölümünün boş bırakılması durumu
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
    And rabia SSN kutusuna invalid deger "" gırer
    And rabia bir saniye bekler
    And rabia username kutusuna "username" gırer.
    And rabia bir saniye bekler
    And rabia Password kutusuna "password" gırer
    And rabia bir saniye bekler
    And rabia submit butonuna tıklar.
    And rabia ssn kutusu altında required yazısının görünür oldugunu dogrular.
    Then rabia sayfayı kapatır.

  @US22_AC07_TC07
  Scenario: AC07_TC07 SSN bölümüne format dışı( -/- olmadan) rakam girme durumu
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
    And rabia SSN kutusuna invalid deger "12334456723" gırer
    And rabia bir saniye bekler
    And rabia username kutusuna "username" gırer.
    And rabia bir saniye bekler
    And rabia Password kutusuna "password" gırer
    And rabia bir saniye bekler
    And rabia submit butonuna tıklar.
    Then rabia Please enter valid SSN number uyarısını gorur
    Then rabia sayfayı kapatır.
