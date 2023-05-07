@US03_AC02 @team11 @US03 @US22
Feature: AC02 rabia e-mail adresini girmelidir. Email adresinde "@" ve "." karakterleri olmalıdır.

  Background: ana sayfaya git
    Given rabia ana sayfaya gider.
    When rabia Contact butonuna tıklar.

  @US03_AC02_TC01
  Scenario: TC01 Email adresinde "@" ve "." karakterlerinin bulunmama durumu

    Then rabia Email kutusuna tıklar.
    And rabia mail kutusuna invalid değer olarak testmailcom girer
    And rabia name kutusuna "ayça" girer.
    And rabia subject  kutusuna "subject" girer
    And rabia message kutusuna "message" girer.
    And rabia send message butonuna tıklar
    And rabia bir saniye bekler
    And rabia mesajın iletilmediğini doğrular.
    And rabia sayfayı kapatır.

  @US03_AC02_TC02
  Scenario: TC02 Email adresinde "@"  işaretinin bulunmama ve "." karakterlerinin bulunma durumu

    Then rabia Email kutusuna tıklar.
    And rabia mail kutusuna invalid olarak testmail.com girer
    And rabia name kutusuna "ayça" girer.
    And rabia subject  kutusuna "subject" girer
    And rabia message kutusuna "message" girer.
    And rabia send message butonuna tıklar
    And rabia bir saniye bekler
    And rabia mesajın iletilmediğini doğrular.
    And rabia sayfayı kapatır.


  @US03_AC02_TC03
  Scenario: TC03 Email adresinde "@"  işaretinin bulunma ve "." karakterlerinin bulunmama durumu

    Then rabia Email kutusuna tıklar.
    And rabia mail kutusuna invalid değer olarak "test@mailcom" girer
    And rabia bir saniye bekler
    And rabia name kutusuna "ayça" girer.
    And rabia subject  kutusuna "subject" girer
    And rabia message kutusuna "message" girer.
    And rabia send message butonuna tıklar
    And rabia bir saniye bekler
    And rabia mesajın iletilmediğinii doğrular.
    And rabia sayfayı kapatır.


  @US03_AC02_TC04
  Scenario: TC04  Email adresinde "@"  işaretinin  ve "." karakterlerinin bulunma durumu

    Then rabia Email kutusuna tıklar.
    And rabia mail kutusuna valid değer olarak "test@mail.com" girer
    And rabia name kutusuna "ayça" girer.
    And rabia subject  kutusuna "subject" girer
    And rabia message kutusuna "message" girer.
    And rabia send message butonuna tıklar
    And rabia bir saniye bekler
    And rabia mesajın iletildiğine dair pop-up mesajını görüntüler.
    And rabia sayfayı kapatır.