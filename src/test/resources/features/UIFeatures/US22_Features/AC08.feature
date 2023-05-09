@US22_AC08 @team11 @US22 @team11Regression
Feature: Admin_ekleme

  Background: Admin olarak login olma durumu
    Given rabia "http://139.59.159.36:3000/" gider.
    When rabia admin olarak giris yapar.
    When rabia  Add Admin bölümünün oldugunu dogrular.

  @US22_AC08_TC01
  Scenario: AC09_TC01 User Name kutusunun boş bırakılması durumu
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
    And rabia username kutusunu bos bırakır
    And rabia bir saniye bekler
    And rabia Password kutusuna "password" gırer
    And rabia bir saniye bekler
    And rabia submit butonuna tıklar.
    And rabia username kutusu altında required yazısının görünür olduğunu dogrular
    Then rabia sayfayı kapatır.

  @US22_AC08_TC02
  Scenario: AC09_TC02 User Name kutusuna önceden oluşturulmuş username girme durumu
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
    And rabia username kutusuna önceden kayıtlı "AdminB103" gırer.
    And rabia bir saniye bekler
    And rabia Password kutusuna "password" gırer
    And rabia bir saniye bekler
    And rabia submit butonuna tıklar.
    Then rabia Error: User with username AdminB103 already register uyarısını gorur
    Then rabia sayfayı kapatır.

  @US22_AC08_TC03
  Scenario: AC09_TC03 User Name kutusuna valid girme durumu
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