@US03_AC01,@team11
Feature: AC01 Herhangi bir karakter içeren ve boş bırakılamayan "Name" girmelidir.

  Background: ana sayfaya git
    Given Kullanıcı ana sayfaya gider.
    When Kullanıcı Contact butonuna tıklar.
    Then  Kullanıcı Name kutusuna tıklar.

  @AUS03_AC01_TC01
  Scenario: TC01 Name kutusuna harf girilmesi

    And Kullanıcı name kutusuna "N" girer.
    And Kullanıcı mail kutusuna "mail" girer
    And Kullanıcı subject  kutusuna "subject" girer
    And Kullanıcı message kutusuna "message" girer.
    And Kullanıcı send message butonuna tıklar
    And Kullanıcı bir saniye bekler
    And Kullanıcı mesajın iletildiğine dair pop-up mesajını görüntüler.
    And Kullanıcı sayfayı kapatır.

  @US03_AC01_TC02
  Scenario: TC02 Name kutusuna rakam girilmesi

    And Kullanıcı name kutusuna "Ezgi12" girer.
    And Kullanıcı mail kutusuna "mail" girer
    And Kullanıcı subject  kutusuna "subject" girer
    And Kullanıcı message kutusuna "message" girer.
    And Kullanıcı send message butonuna tıklar
    And Kullanıcı bir saniye bekler
    Then Kullanıcı mesajın iletildiğine dair pop-up mesajını görüntüler.
    And Kullanıcı sayfayı kapatır.


  @US03_AC01_TC03
  Scenario: TC03 Name kutusuna özel karakter girilmesi

    And Kullanıcı name kutusuna "$" girer.
    And Kullanıcı mail kutusuna "mail" girer
    And Kullanıcı subject  kutusuna "subject" girer
    And Kullanıcı message kutusuna "message" girer.
    And Kullanıcı send message butonuna tıklar
    And Kullanıcı bir saniye bekler
    And Kullanıcı mesajın iletildiğine dair pop-up mesajını görüntüler.
    And Kullanıcı sayfayı kapatır.

  @US03_AC01_TC04
  Scenario: TC04 Name kutusunun boş bırakılması

    And Kullanıcı name kutusuna "" girer.
    And Kullanıcı mail kutusuna "mail" girer
    And Kullanıcı subject  kutusuna "subject" girer
    And Kullanıcı message kutusuna "message" girer.
    And Kullanıcı send message butonuna tıklar
    And Kullanıcı bir saniye bekler
    And Kullanıcı mesajın iletilemediğini doğrular.
    And Kullanıcı sayfayı kapatır.

  @US03_AC01_TC05
  Scenario: TC05  "Name" kutusuna space girilmesi

    And Kullanıcı name kutusuna " " girer.
    And Kullanıcı mail kutusuna "mail" girer
    And Kullanıcı subject  kutusuna "subject" girer
    And Kullanıcı message kutusuna "message" girer.
    And Kullanıcı send message butonuna tıklar
    And Kullanıcı bir saniye bekler
    And Kullanıcı mesajın iletilemediğini doğrular.
    And Kullanıcı sayfayı kapatır.
