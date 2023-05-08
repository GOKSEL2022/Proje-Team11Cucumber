@US22_AC06 @team11 @US22
Feature: Admin_ekleme

  Background: Admin olarak login olma durumu
    Given rabia "https://www.managementonschools.com" gider.
    When rabia admin olarak giris yapar.
    When rabia  Add Admin bölümünün oldugunu dogrular.

  @US22_AC06_TC01
  Scenario: AC06_TC01 Phone bölümüne  valid bir değer girme durumu
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

  @US22_AC06_TC02
  Scenario: AC06_TC02 Phone bölümüne  12 rakamdan oluşan bir değer girme durumu
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
    And rabia Phone kutusuna oniki rakamdan olusan deger gırer
    And rabia bir saniye bekler
    And rabia SSN kutusuna SSN gırer
    And rabia bir saniye bekler
    And rabia username kutusuna "username" gırer.
    And rabia bir saniye bekler
    And rabia Password kutusuna "password" gırer
    And rabia bir saniye bekler
    And rabia submit butonuna tıklar.
    Then rabia please enter valid phone number uyarısı aldıgını dogrular.
    Then rabia sayfayı kapatır.

  @US22_AC06_TC03
  Scenario: AC06_TC03 Phone bölümüne  11 rakamdan oluşan bir değer girme durumu
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
    And rabia Phone kutusuna onbir rakamdan olusan deger gırer
    And rabia bir saniye bekler
    And rabia SSN kutusuna SSN gırer
    And rabia bir saniye bekler
    And rabia username kutusuna "username" gırer.
    And rabia bir saniye bekler
    And rabia Password kutusuna "password" gırer
    And rabia bir saniye bekler
    And rabia submit butonuna tıklar.
    Then rabia phone kutusu altında Minimum 12 character (XXX-XXX-XXXX) yazısının görünür oldugunu dogrular
    Then rabia sayfayı kapatır.

  @US22_AC06_TC04
  Scenario: AC06_TC04 Phone bölümüne  13 rakamdan oluşan bir değer girme durumu
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
    And rabia Phone kutusuna onüç rakamdan olusan deger gırer
    And rabia bir saniye bekler
    And rabia SSN kutusuna SSN gırer
    And rabia bir saniye bekler
    And rabia username kutusuna "username" gırer.
    And rabia bir saniye bekler
    And rabia Password kutusuna "password" gırer
    And rabia bir saniye bekler
    And rabia submit butonuna tıklar.
    #And rabia phone kutusu altında Minimum 12 character (XXX-XXX-XXXX) yazısının görünür oldugunu dogrular
    Then rabia please enter valid phone number uyarısı aldıgını dogrular.
    Then rabia sayfayı kapatır.

  @US22_AC06_TC05
  Scenario: AC06_TC05 Phone bölümüne ( - karakteri bulunmadan) 10 rakamdan oluşan bir değer girme durumu

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
    And rabia Phone kutusuna ( - karakteri bulunmadan) on rakamdan oluşan bir deger gırer
    And rabia bir saniye bekler
    And rabia SSN kutusuna SSN gırer
    And rabia bir saniye bekler
    And rabia username kutusuna "username" gırer.
    And rabia bir saniye bekler
    And rabia Password kutusuna "password" gırer
    And rabia bir saniye bekler
    And rabia submit butonuna tıklar.
    And rabia phone kutusu altında Minimum 12 character (XXX-XXX-XXXX) yazısının görünür oldugunu dogrular
    Then rabia sayfayı kapatır.

  @US22_AC06_TC06
  Scenario: AC06_TC06 Phone bölümüne  daha önce sistemde ekli olan bir phone girme durumu

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
    And rabia Phone kutusuna daha önce sistemde ekli olan bir deger gırer
    And rabia bir saniye bekler
    And rabia SSN kutusuna SSN gırer
    And rabia bir saniye bekler
    And rabia username kutusuna "username" gırer.
    And rabia bir saniye bekler
    And rabia Password kutusuna "password" gırer
    And rabia bir saniye bekler
    And rabia submit butonuna tıklar.
    Then rabia" User with phone number 533-695-4588 already register" uyarısı alır
    Then rabia sayfayı kapatır.