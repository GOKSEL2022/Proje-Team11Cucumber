@US03_AC03,@team11
Feature: AC03 rabia yazacağı mesaj hakkında bir Subject girmelidir.
  Background: ana sayfaya git
    Given rabia ana sayfaya gider.
    When rabia Contact butonuna tıklar.
    And rabia Subject kutusuna tıklar.

  @US03_AC03_TC01
  Scenario: TC01 Subject kutucuğunun boş bırakılması durumu

  And rabia subject kutusunu boş bırakır.
  And rabia name kutusuna "rabia" girer.
  And rabia mail kutusuna "valid bir mail" girer
  And rabia message kutusuna "mesajını" girer.
  And rabia send message butonuna tıklar
  And rabia bir saniye bekler
    And rabia mesajın iletilemediğini doğrular.
    And rabia sayfayı kapatır.

  @US03_AC03_TC02
  Scenario: TC02 Subject kutucuğuna  bir değer girilmesi durumu

  And rabia subject kutusuna "subject" girer.
  And rabia name kutusuna "rabia" girer.
  And rabia mail kutusuna "valid bir mail" girer
  And rabia message kutusuna "mesajını" girer.
  And rabia send message butonuna tıklar
  And rabia bir saniye bekler
  Then Mesaj gönderim işlemi gerçekleşir.
    And rabia sayfayı kapatır.