@US03_AC02,@team11
Feature: AC02 Kullanıcı e-mail adresini girmelidir. Email adresinde "@" ve "." karakterleri olmalıdır.

  Background: ana sayfaya git
    Given Kullanıcı ana sayfaya gider.
    When Kullanıcı Contact butonuna tıklar.

  @US03_AC02_TC01
  Scenario: TC01 Email adresinde "@" ve "." karakterlerinin bulunmama durumu

    Then Kullanıcı Email kutusuna tıklar.
    And Kullanıcı mail kutusuna invalid değer olarak testmailcom girer
    And Kullanıcı name kutusuna "ayça" girer.
    And Kullanıcı subject  kutusuna "subject" girer
    And Kullanıcı message kutusuna "message" girer.
    And Kullanıcı send message butonuna tıklar
    And Kullanıcı bir saniye bekler
    And Kullanıcı mesajın iletilmediğini doğrular.
    And Kullanıcı sayfayı kapatır.

  @US03_AC02_TC02
  Scenario: TC02 Email adresinde "@"  işaretinin bulunmama ve "." karakterlerinin bulunma durumu

    Then Kullanıcı Email kutusuna tıklar.
    And Kullanıcı mail kutusuna invalid olarak testmail.com girer
    And Kullanıcı name kutusuna "ayça" girer.
    And Kullanıcı subject  kutusuna "subject" girer
    And Kullanıcı message kutusuna "message" girer.
    And Kullanıcı send message butonuna tıklar
    And Kullanıcı bir saniye bekler
    And Kullanıcı mesajın iletilmediğini doğrular.
    And Kullanıcı sayfayı kapatır.


  @US03_AC02_TC03
  Scenario: TC03 Email adresinde "@"  işaretinin bulunma ve "." karakterlerinin bulunmama durumu

    Then Kullanıcı Email kutusuna tıklar.
    And Kullanıcı mail kutusuna invalid değer olarak "test@mailcom" girer
    And Kullanıcı bir saniye bekler
    And Kullanıcı name kutusuna "ayça" girer.
    And Kullanıcı subject  kutusuna "subject" girer
    And Kullanıcı message kutusuna "message" girer.
    And Kullanıcı send message butonuna tıklar
    And Kullanıcı bir saniye bekler
    And Kullanıcı mesajın iletilmediğinii doğrular.
    And Kullanıcı sayfayı kapatır.


  @US03_AC02_TC04
  Scenario: TC04  Email adresinde "@"  işaretinin  ve "." karakterlerinin bulunma durumu

    Then Kullanıcı Email kutusuna tıklar.
    And Kullanıcı mail kutusuna valid değer olarak "test@mail.com" girer
    And Kullanıcı name kutusuna "ayça" girer.
    And Kullanıcı subject  kutusuna "subject" girer
    And Kullanıcı message kutusuna "message" girer.
    And Kullanıcı send message butonuna tıklar
    And Kullanıcı bir saniye bekler
    And Kullanıcı mesajın iletildiğine dair pop-up mesajını görüntüler.
    And Kullanıcı sayfayı kapatır.