@US22_AC07
Feature: Admin_ekleme

  Background: Admin olarak login olma durumu
    Given Kullanıcı "https://www.managementonschools.com" gider.
    When Kullanıcı admin olarak giris yapar.
    When Kullanıcı  Add Admin bölümünün oldugunu dogrular.

  @US22_AC07_TC01
  Scenario: AC07_TC01 SSN bölümüne  valid bir değer girme durumu
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
    Then Add Admin işlemin başarılı bir şekilde gerceklestigini dogrular.
    Then Kullanıcı sayfayı kapatır.

  @US22_AC07_TC02
  Scenario: AC07_TC02 SSN bölümüne daha önceden kayıtlı bir SSN girme durumu
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
    And Kullanıcı SSN kutusuna daha önceden kayıtlı "333-33-3333" gırer
    And Kullanıcı bir saniye bekler
    And Kullanıcı username kutusuna "username" gırer.
    And Kullanıcı bir saniye bekler
    And Kullanıcı Password kutusuna "password" gırer
    And Kullanıcı bir saniye bekler
    And Kullanıcı submit butonuna tıklar.
    Then Kullanıcı "Error: User with ssn 333-33-3333 already register" uyarısını aldıgını dogrular
    Then Kullanıcı sayfayı kapatır.

  @US22_AC07_TC03
  Scenario: AC07_TC03 SSN bölümüne  bir karakter fazla değer girme durumu
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
    And Kullanıcı SSN kutusuna invalid deger "333-33-33331" gırer
    And Kullanıcı bir saniye bekler
    And Kullanıcı username kutusuna "username" gırer.
    And Kullanıcı bir saniye bekler
    And Kullanıcı Password kutusuna "password" gırer
    And Kullanıcı bir saniye bekler
    And Kullanıcı submit butonuna tıklar.
    Then Kullanıcı Please enter valid SSN number uyarısını gorur
    Then Kullanıcı sayfayı kapatır.

  @US22_AC07_TC04
  Scenario: AC07_TC04 SSN bölümüne  bir karakter eksik değer girme durumu
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
    And Kullanıcı SSN kutusuna invalid deger "333-33-333" gırer
    And Kullanıcı bir saniye bekler
    And Kullanıcı username kutusuna "username" gırer.
    And Kullanıcı bir saniye bekler
    And Kullanıcı Password kutusuna "password" gırer
    And Kullanıcı bir saniye bekler
    And Kullanıcı submit butonuna tıklar.
    Then Kullanıcı "Minimum 11 character (XXX-XX-XXXX)" uyarısını gorur
    Then Kullanıcı sayfayı kapatır.

  @US22_AC07_TC05
  Scenario: AC07_TC05 SSN bölümüne  bir karakter harf girme durumu
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
    And Kullanıcı SSN kutusuna invalid deger "333-33-333h" gırer
    And Kullanıcı bir saniye bekler
    And Kullanıcı username kutusuna "username" gırer.
    And Kullanıcı bir saniye bekler
    And Kullanıcı Password kutusuna "password" gırer
    And Kullanıcı bir saniye bekler
    And Kullanıcı submit butonuna tıklar.
    Then Kullanıcı Please enter valid SSN number uyarısını gorur
    Then Kullanıcı sayfayı kapatır.

  @US22_AC07_TC06
  Scenario: AC07_TC06 SSN bölümünün boş bırakılması durumu
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
    And Kullanıcı SSN kutusuna invalid deger "" gırer
    And Kullanıcı bir saniye bekler
    And Kullanıcı username kutusuna "username" gırer.
    And Kullanıcı bir saniye bekler
    And Kullanıcı Password kutusuna "password" gırer
    And Kullanıcı bir saniye bekler
    And Kullanıcı submit butonuna tıklar.
    And Kullanıcı ssn kutusu altında required yazısının görünür oldugunu dogrular.
    Then Kullanıcı sayfayı kapatır.

  @US22_AC07_TC07
  Scenario: AC07_TC07 SSN bölümüne format dışı( -/- olmadan) rakam girme durumu
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
    And Kullanıcı SSN kutusuna invalid deger "12334456723" gırer
    And Kullanıcı bir saniye bekler
    And Kullanıcı username kutusuna "username" gırer.
    And Kullanıcı bir saniye bekler
    And Kullanıcı Password kutusuna "password" gırer
    And Kullanıcı bir saniye bekler
    And Kullanıcı submit butonuna tıklar.
    Then Kullanıcı Please enter valid SSN number uyarısını gorur
    Then Kullanıcı sayfayı kapatır.
