@US22_AC06,@team11
Feature: Admin_ekleme

  Background: Admin olarak login olma durumu
    Given Kullanıcı "https://www.managementonschools.com" gider.
    When Kullanıcı admin olarak giris yapar.
    When Kullanıcı  Add Admin bölümünün oldugunu dogrular.

  @US22_AC06_TC01
  Scenario: AC06_TC01 Phone bölümüne  valid bir değer girme durumu
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

  @US22_AC06_TC02
  Scenario: AC06_TC02 Phone bölümüne  12 rakamdan oluşan bir değer girme durumu
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
    And Kullanıcı Phone kutusuna oniki rakamdan olusan deger gırer
    And Kullanıcı bir saniye bekler
    And Kullanıcı SSN kutusuna SSN gırer
    And Kullanıcı bir saniye bekler
    And Kullanıcı username kutusuna "username" gırer.
    And Kullanıcı bir saniye bekler
    And Kullanıcı Password kutusuna "password" gırer
    And Kullanıcı bir saniye bekler
    And Kullanıcı submit butonuna tıklar.
    Then Kullanıcı please enter valid phone number uyarısı aldıgını dogrular.
    Then Kullanıcı sayfayı kapatır.

  @US22_AC06_TC03
  Scenario: AC06_TC03 Phone bölümüne  11 rakamdan oluşan bir değer girme durumu
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
    And Kullanıcı Phone kutusuna onbir rakamdan olusan deger gırer
    And Kullanıcı bir saniye bekler
    And Kullanıcı SSN kutusuna SSN gırer
    And Kullanıcı bir saniye bekler
    And Kullanıcı username kutusuna "username" gırer.
    And Kullanıcı bir saniye bekler
    And Kullanıcı Password kutusuna "password" gırer
    And Kullanıcı bir saniye bekler
    And Kullanıcı submit butonuna tıklar.
    Then Kullanıcı phone kutusu altında Minimum 12 character (XXX-XXX-XXXX) yazısının görünür oldugunu dogrular
    Then Kullanıcı sayfayı kapatır.

  @US22_AC06_TC04
  Scenario: AC06_TC04 Phone bölümüne  13 rakamdan oluşan bir değer girme durumu
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
    And Kullanıcı Phone kutusuna onüç rakamdan olusan deger gırer
    And Kullanıcı bir saniye bekler
    And Kullanıcı SSN kutusuna SSN gırer
    And Kullanıcı bir saniye bekler
    And Kullanıcı username kutusuna "username" gırer.
    And Kullanıcı bir saniye bekler
    And Kullanıcı Password kutusuna "password" gırer
    And Kullanıcı bir saniye bekler
    And Kullanıcı submit butonuna tıklar.
    #And Kullanıcı phone kutusu altında Minimum 12 character (XXX-XXX-XXXX) yazısının görünür oldugunu dogrular
    Then Kullanıcı please enter valid phone number uyarısı aldıgını dogrular.
    Then Kullanıcı sayfayı kapatır.

  @US22_AC06_TC05
  Scenario: AC06_TC05 Phone bölümüne ( - karakteri bulunmadan) 10 rakamdan oluşan bir değer girme durumu

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
    And Kullanıcı Phone kutusuna ( - karakteri bulunmadan) on rakamdan oluşan bir deger gırer
    And Kullanıcı bir saniye bekler
    And Kullanıcı SSN kutusuna SSN gırer
    And Kullanıcı bir saniye bekler
    And Kullanıcı username kutusuna "username" gırer.
    And Kullanıcı bir saniye bekler
    And Kullanıcı Password kutusuna "password" gırer
    And Kullanıcı bir saniye bekler
    And Kullanıcı submit butonuna tıklar.
    And Kullanıcı phone kutusu altında Minimum 12 character (XXX-XXX-XXXX) yazısının görünür oldugunu dogrular
    Then Kullanıcı sayfayı kapatır.

  @US22_AC06_TC06
  Scenario: AC06_TC06 Phone bölümüne  daha önce sistemde ekli olan bir phone girme durumu

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
    And Kullanıcı Phone kutusuna daha önce sistemde ekli olan bir deger gırer
    And Kullanıcı bir saniye bekler
    And Kullanıcı SSN kutusuna SSN gırer
    And Kullanıcı bir saniye bekler
    And Kullanıcı username kutusuna "username" gırer.
    And Kullanıcı bir saniye bekler
    And Kullanıcı Password kutusuna "password" gırer
    And Kullanıcı bir saniye bekler
    And Kullanıcı submit butonuna tıklar.
    Then Kullanıcı" User with phone number 533-695-4588 already register" uyarısı alır
    Then Kullanıcı sayfayı kapatır.