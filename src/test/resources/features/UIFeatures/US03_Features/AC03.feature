@US03_AC03,@team11
Feature: AC03 Kullanıcı yazacağı mesaj hakkında bir Subject girmelidir.
  Background: ana sayfaya git
    Given Kullanıcı ana sayfaya gider.
    When Kullanıcı Contact butonuna tıklar.
    And Kullanıcı Subject kutusuna tıklar.

  @US03_AC03_TC01
  Scenario: TC01 Subject kutucuğunun boş bırakılması durumu

  And Kullanıcı subject kutusunu boş bırakır.
  And Kullanıcı name kutusuna "rabia" girer.
  And Kullanıcı mail kutusuna "valid bir mail" girer
  And Kullanıcı message kutusuna "mesajını" girer.
  And Kullanıcı send message butonuna tıklar
  And Kullanıcı bir saniye bekler
    And Kullanıcı mesajın iletilemediğini doğrular.
    And Kullanıcı sayfayı kapatır.

  @US03_AC03_TC02
  Scenario: TC02 Subject kutucuğuna  bir değer girilmesi durumu

  And Kullanıcı subject kutusuna "subject" girer.
  And Kullanıcı name kutusuna "rabia" girer.
  And Kullanıcı mail kutusuna "valid bir mail" girer
  And Kullanıcı message kutusuna "mesajını" girer.
  And Kullanıcı send message butonuna tıklar
  And Kullanıcı bir saniye bekler
  Then Mesaj gönderim işlemi gerçekleşir.
    And Kullanıcı sayfayı kapatır.