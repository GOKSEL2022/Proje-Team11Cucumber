@US22_AC03
Feature: Admin_ekleme

  Background: Admin olarak login olma durumu
    Given Kullanıcı "https://www.managementonschools.com" gider.
    When Kullanıcı admin olarak giris yapar.
    When Kullanıcı  Add Admin bölümünün oldugunu dogrular.

  @US22_AC03_TC01
  Scenario: AC03_TC01 Birth Place kutusuna valid bir değer girilmesi durumu
    And Kullanıcı namee kutusuna tıklar.
    And Kullanıcı name kutusuna "name" girer.
    And Kullanıcı bir saniye bekler
    And Kullanıcı surnamee kutusuna "surname" girer
    And Kullanıcı bir saniye bekler
    And Kullanıcı birthPLacee kutusuna "birth Place" girer.
    And Kullanıcı bir saniye bekler
    And Kullanıcı gender secer.
    And Kullanıcı bir saniye bekler
    And Kullanıcı Date Of Birth kutusuna "Date Of Birth" gırer.
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
    And Kullanıcı bir saniye bekler
    Then Add Admin işlemi başarılı bir şekilde gerceklesir.
    Then Kullanıcı sayfayı kapatır.

  @US22_AC03_TC02
  Scenario: AC03_TC02 Birth Place kutusunun bos bırakılması durumu
    And Kullanıcı namee kutusuna tıklar.
    And Kullanıcı name kutusuna "name" girer.
    And Kullanıcı bir saniye bekler
    And Kullanıcı surnamee kutusuna "surname" girer
    And Kullanıcı bir saniye bekler
    #And Kullanıcı birthPLacee kutusuna "" girer.
    And Kullanıcı birtPlace kutusu altında required yazısının oldugunu gorur.
    And Kullanıcı bir saniye bekler
    And Kullanıcı gender secer.
    And Kullanıcı bir saniye bekler
    And Kullanıcı Date Of Birth kutusuna "Date Of Birth" gırer.
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
    And Kullanıcı bir saniye bekler

    Then Kullanıcı sayfayı kapatır.

  @US22_AC03_TC03
  Scenario: AC03_TC03 Birth Place kutusuna space karakteri girilmesi durumu
    And Kullanıcı namee kutusuna tıklar.
    And Kullanıcı name kutusuna "name" girer.
    And Kullanıcı bir saniye bekler
    And Kullanıcı surnamee kutusuna "surname" girer
    And Kullanıcı bir saniye bekler
    And Kullanıcı birthPLacee kutusuna space " " girer.
    #And Kullanıcı birtPlace kutusu altında required yazısının kaltıgını gorur.
    And Kullanıcı bir saniye bekler
    And Kullanıcı gender secer.
    And Kullanıcı bir saniye bekler
    And Kullanıcı Date Of Birth kutusuna "Date Of Birth" gırer.
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
    And Kullanıcı bir saniye bekler
    And Kullanıcı admin ekleme isleminin gerçeklesmediğini dogrular.
    Then Kullanıcı sayfayı kapatır.