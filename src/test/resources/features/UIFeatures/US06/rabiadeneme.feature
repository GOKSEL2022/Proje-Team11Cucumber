@contact
Feature: AC01 Herhangi bir karakter içeren ve boş bırakılamayan "Name" girmelidir.

  Background: ana sayfaya git
    Given Kullanıcı ana sayfaya gider.


  Scenario: TC01 Name kutusuna harf girilmesi

    When Kullanıcı Contact butonuna tıklar.
    Then  Kullanıcı Name kutusuna tıklar.
    And Kullanıcı Name kutusuna "N" girer.
    And Kullanıcı mail kutusuna "mail" girer
    And Kullanıcı subject  kutusuna "subject" girer
    And Kullanıcı message kutusuna "message" girer.
    And Kullanıcı send message butonuna tıklar
    And Kullanıcı bir saniye bekler
    And Kullanıcı mesajın iletildiğine dair pop-up mesajını görüntüler.

