@US22_AC01,@team11
Feature: Admin_ekleme

  Background: Admin olarak login olma durumu
    Given Kullanıcı "https://www.managementonschools.com" gider.
    When Kullanıcı admin olarak giris yapar.
    When Kullanıcı  Add Admin bölümünün oldugunu dogrular.

  @US22_AC01_TC02
  Scenario: AC01_TC02 Name kutusuna değer girilmesi durumu
    And Kullanıcı namee kutusuna tıklar.
    And Kullanıcı name kutusuna "name" girer.
    And Kullanıcı bir saniye bekler
    And Kullanıcı surnamee kutusuna "surname" girer
    And Kullanıcı bir saniye bekler
    #And Kullanıcı surname kutusu altında required yazısının kaltıgını gorur.
    And Kullanıcı birthPLacee kutusuna "birth Place" girer.
    And Kullanıcı bir saniye bekler
    #And Kullanıcı birtPlace kutusu altında required yazısının kaltıgını gorur.
    And Kullanıcı gender secer.
    And Kullanıcı bir saniye bekler
    And Kullanıcı Date Of Birth kutusuna "Date Of Birth" gırer.
    And Kullanıcı bir saniye bekler
    #And Kullanıcı date of birth kutusu altında required yazısının kaltıgını gorur.
    And Kullanıcı Phone kutusuna "Phone" gırer
    And Kullanıcı bir saniye bekler
    #And Kullanıcı phone kutusu altında required yazısının kaltıgını gorur.
    And Kullanıcı SSN kutusuna SSN gırer
    And Kullanıcı bir saniye bekler
    #And Kullanıcı ssn kutusu altında required yazısının kaltıgını gorur.
    And Kullanıcı username kutusuna "username" gırer.
    And Kullanıcı bir saniye bekler
    #And Kullanıcı username kutusu altında required yazısının kaltıgını gorur.
    And Kullanıcı Password kutusuna "password" gırer
    And Kullanıcı bir saniye bekler
    #And Kullanıcı password kutusu altında required yazısının kaltıgını gorur.
    And Kullanıcı submit butonuna tıklar.
    And Kullanıcı bir saniye bekler
    Then Add Admin işlemi başarılı bir şekilde gerceklesir.
    Then Kullanıcı sayfayı kapatır.


  @US22_AC01_TC03
  Scenario: AC01_TC03 Name kutusunun bos bırakılması durumu
    And Kullanıcı namee kutusuna tıklar.
    And Kullanıcı name kutusuna "" girer.
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
    And Kullanıcı name kutusu altında required yazısının oldugunu gorur.
    Then Kullanıcı sayfayı kapatır.


  @US22_AC01_TC04
  Scenario: AC01_TC04 Name kutusuna space karakteri girme durumu
    And Kullanıcı namee kutusuna tıklar.
    And Kullanıcı name kutusuna " " girer.
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
    And Kullanıcı admin ekleme isleminin gerçeklesmediğini dogrular.
    Then Kullanıcı sayfayı kapatır.