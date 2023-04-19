@US22_AC05,@team11
Feature: Admin_ekleme

  Background: Admin olarak login olma durumu
    Given rabia "https://www.managementonschools.com" gider.
    When rabia admin olarak giris yapar.
    When rabia  Add Admin bölümünün oldugunu dogrular.

  @US22_AC05_TC01
  Scenario: AC05_TC01 Date Of Birth seçeneğini boş bırakma durumu
    And rabia namee kutusuna tıklar.
    And rabia name kutusuna "name" girer.
    And rabia bir saniye bekler
    And rabia surnamee kutusuna "surname" girer
    And rabia bir saniye bekler
    And rabia birthPLacee kutusuna "birth Place" girer.
    And rabia bir saniye bekler
    And rabia gender olarak female secer.
    And rabia bir saniye bekler
    And rabia Date Of Birth kutusunu bos bırakır.
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
    Then rabia date of birth kutusu altında required yazısının oldugunu gorur.
    Then rabia sayfayı kapatır.

  @US22_AC05_TC02
  Scenario: AC05_TC02 Date Of Birth seçeneğine bir gün sonrasını (ileri tarih) girme durumu

    And rabia namee kutusuna tıklar.
    And rabia name kutusuna "name" girer.
    And rabia bir saniye bekler
    And rabia surnamee kutusuna "surname" girer
    And rabia bir saniye bekler
    And rabia birthPLacee kutusuna "birth Place" girer.
    And rabia bir saniye bekler
    And rabia gender olarak female secer.
    And rabia bir saniye bekler
    And rabia Date Of Birth kutusuna bir gün sonrasını (ileri tarih) girer.
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
    Then rabia "must be a past date" mesajını gorur.
    Then rabia sayfayı kapatır.


  @US22_AC05_TC03
  Scenario: AC05_TC03 Date Of Birth seçeneğine içinde bulundugu gunun tarihini girme durumu

    And rabia namee kutusuna tıklar.
    And rabia name kutusuna "name" girer.
    And rabia bir saniye bekler
    And rabia surnamee kutusuna "surname" girer
    And rabia bir saniye bekler
    And rabia birthPLacee kutusuna "birth Place" girer.
    And rabia bir saniye bekler
    And rabia gender olarak female secer.
    And rabia bir saniye bekler
    And rabia Date Of Birth kutusuna icinde bulundugu gunun tarihini girer.
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
    Then rabia "must be a past date" mesajını gorur.
    Then rabia sayfayı kapatır.

  @US22_AC05_TC04
  Scenario: AC05_TC04 Date Of Birth seçeneğine birgün öncesinin tarihini(geçmiş tarih) girme durumu

    And rabia namee kutusuna tıklar.
    And rabia name kutusuna "name" girer.
    And rabia bir saniye bekler
    And rabia surnamee kutusuna "surname" girer
    And rabia bir saniye bekler
    And rabia birthPLacee kutusuna "birth Place" girer.
    And rabia bir saniye bekler
    And rabia gender olarak female secer.
    And rabia bir saniye bekler
    And rabia Date Of Birth kutusuna birgün öncesinin tarihini(geçmiş tarih) girer.
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
    Then rabia admin ekleme isleminin gerçeklesmediğini dogrular.
    Then rabia sayfayı kapatır.

  @US22_AC05_TC05
  Scenario: AC05_TC05 Date Of Birth seçeneğine gecerli bir tarih girme durumu

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