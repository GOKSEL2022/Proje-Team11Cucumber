@US03_AC04 @team11 @US03 @US22 @team11Regression
Feature: AC04 rabia mesaj yazmalıdır
  Background: ana sayfaya git
    Given rabia ana sayfaya gider.
    When rabia Contact butonuna tıklar.

  @US03_AC04_TC01 @team11Smoke
  Scenario: TC01 Message kutucuğuna valid girilmesi durumu

  And rabia name kutusuna "rabia" girer.
  And rabia mail kutusuna "valid bir mail" girer
  And rabia subject kutusuna "subject" girer.
  And rabia message kutusuna "mesaj" girer.
  And rabia send message butonuna tıklar
  And rabia bir saniye bekler
  And Mesaj gönderim işlemi gerçekleşir.

    And rabia sayfayı kapatır.

  @US03_AC04_TC02
  Scenario: TC02 Message kutucuğunun boş bırakılması durumu

    And rabia name kutusuna "rabia" girer.
    And rabia mail kutusuna "valid bir mail" girer
    And rabia subject kutusuna "subject" girer.
    And rabia message kutusunu bos birakir.
    And rabia send message butonuna tıklar
    And rabia bir saniye bekler
    And bos bırakılan kutunun altında required yazısı oldugunu doğrular.
    And rabia sayfayı kapatır.