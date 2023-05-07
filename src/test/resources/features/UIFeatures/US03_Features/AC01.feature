@US03_AC01 @team11 @US03 @US22
Feature: AC01 Herhangi bir karakter içeren ve boş bırakılamayan "Name" girmelidir.

  Background: ana sayfaya git
    Given rabia ana sayfaya gider.
    When rabia Contact butonuna tıklar.
    Then  rabia Name kutusuna tıklar.

#  @AUS03_AC01_TC01
#  Scenario: TC01 Name kutusuna harf girilmesi
#
#    And rabia name kutusuna "N" girer.
#    And rabia mail kutusuna "mail" girer
#    And rabia subject  kutusuna "subject" girer
#    And rabia message kutusuna "message" girer.
#    And rabia send message butonuna tıklar
#    And rabia bir saniye bekler
#    #And rabia mesajın iletildiğine dair pop-up mesajını görüntüler.
#    And rabia sayfayı kapatır.

  @US03_AC01_TC02
  Scenario: TC02 Name kutusuna rakam girilmesi

    And rabia name kutusuna "Ezgi12" girer.
    And rabia mail kutusuna "mail" girer
    And rabia subject  kutusuna "subject" girer
    And rabia message kutusuna "message" girer.
    And rabia send message butonuna tıklar
    And rabia bir saniye bekler
    Then rabia mesajın iletildiğine dair pop-up mesajını görüntüler.
    And rabia sayfayı kapatır.


  @US03_AC01_TC03
  Scenario: TC03 Name kutusuna özel karakter girilmesi

    And rabia name kutusuna "$" girer.
    And rabia mail kutusuna "mail" girer
    And rabia subject  kutusuna "subject" girer
    And rabia message kutusuna "message" girer.
    And rabia send message butonuna tıklar
    And rabia bir saniye bekler
    And rabia mesajın iletildiğine dair pop-up mesajını görüntüler.
    And rabia sayfayı kapatır.

  @US03_AC01_TC04
  Scenario: TC04 Name kutusunun boş bırakılması

    And rabia name kutusuna "" girer.
    And rabia mail kutusuna "mail" girer
    And rabia subject  kutusuna "subject" girer
    And rabia message kutusuna "message" girer.
    And rabia send message butonuna tıklar
    And rabia bir saniye bekler
    And rabia mesajın iletilemediğini doğrular.
    And rabia sayfayı kapatır.

  @US03_AC01_TC05
  Scenario: TC05  "Name" kutusuna space girilmesi

    And rabia name kutusuna " " girer.
    And rabia mail kutusuna "mail" girer
    And rabia subject  kutusuna "subject" girer
    And rabia message kutusuna "message" girer.
    And rabia send message butonuna tıklar
    And rabia bir saniye bekler
    And rabia mesajın iletilemediğini doğrular.
    And rabia sayfayı kapatır.
