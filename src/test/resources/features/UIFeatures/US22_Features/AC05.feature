@US22_AC05
Feature: Admin_ekleme

  Background: Admin olarak login olma durumu
    Given Kullanıcı "https://www.managementonschools.com" gider.
    When Kullanıcı admin olarak giris yapar.
    When Kullanıcı  Add Admin bölümünün oldugunu dogrular.

  @US22_AC05_TC01
  Scenario: AC05_TC01 Date Of Birth seçeneğini boş bırakma durumu
    And Kullanıcı namee kutusuna tıklar.
    And Kullanıcı name kutusuna "name" girer.
    And Kullanıcı bir saniye bekler
    And Kullanıcı surnamee kutusuna "surname" girer
    And Kullanıcı bir saniye bekler
    And Kullanıcı birthPLacee kutusuna "birth Place" girer.
    And Kullanıcı bir saniye bekler
    And Kullanıcı gender olarak female secer.
    And Kullanıcı bir saniye bekler
    And Kullanıcı Date Of Birth kutusunu bos bırakır.
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
    Then Kullanıcı date of birth kutusu altında required yazısının oldugunu gorur.
    Then Kullanıcı sayfayı kapatır.

  @US22_AC05_TC02
  Scenario: AC05_TC02 Date Of Birth seçeneğine bir gün sonrasını (ileri tarih) girme durumu

    And Kullanıcı namee kutusuna tıklar.
    And Kullanıcı name kutusuna "name" girer.
    And Kullanıcı bir saniye bekler
    And Kullanıcı surnamee kutusuna "surname" girer
    And Kullanıcı bir saniye bekler
    And Kullanıcı birthPLacee kutusuna "birth Place" girer.
    And Kullanıcı bir saniye bekler
    And Kullanıcı gender olarak female secer.
    And Kullanıcı bir saniye bekler
    And Kullanıcı Date Of Birth kutusuna bir gün sonrasını (ileri tarih) girer.
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
    Then Kullanıcı "must be a past date" mesajını gorur.
    Then Kullanıcı sayfayı kapatır.


  @US22_AC05_TC03
  Scenario: AC05_TC03 Date Of Birth seçeneğine içinde bulundugu gunun tarihini girme durumu

    And Kullanıcı namee kutusuna tıklar.
    And Kullanıcı name kutusuna "name" girer.
    And Kullanıcı bir saniye bekler
    And Kullanıcı surnamee kutusuna "surname" girer
    And Kullanıcı bir saniye bekler
    And Kullanıcı birthPLacee kutusuna "birth Place" girer.
    And Kullanıcı bir saniye bekler
    And Kullanıcı gender olarak female secer.
    And Kullanıcı bir saniye bekler
    And Kullanıcı Date Of Birth kutusuna icinde bulundugu gunun tarihini girer.
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
    Then Kullanıcı "must be a past date" mesajını gorur.
    Then Kullanıcı sayfayı kapatır.

  @US22_AC05_TC04
  Scenario: AC05_TC04 Date Of Birth seçeneğine birgün öncesinin tarihini(geçmiş tarih) girme durumu

    And Kullanıcı namee kutusuna tıklar.
    And Kullanıcı name kutusuna "name" girer.
    And Kullanıcı bir saniye bekler
    And Kullanıcı surnamee kutusuna "surname" girer
    And Kullanıcı bir saniye bekler
    And Kullanıcı birthPLacee kutusuna "birth Place" girer.
    And Kullanıcı bir saniye bekler
    And Kullanıcı gender olarak female secer.
    And Kullanıcı bir saniye bekler
    And Kullanıcı Date Of Birth kutusuna birgün öncesinin tarihini(geçmiş tarih) girer.
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
    Then Kullanıcı admin ekleme isleminin gerçeklesmediğini dogrular.
    Then Kullanıcı sayfayı kapatır.

  @US22_AC05_TC05
  Scenario: AC05_TC05 Date Of Birth seçeneğine gecerli bir tarih girme durumu

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
    Then Kullanıcı admin ekleme isleminin gerçeklesmediğini dogrular.
    Then Kullanıcı sayfayı kapatır.