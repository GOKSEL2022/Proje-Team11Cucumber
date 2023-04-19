@US03_AC04,@team11
Feature: AC04 Kullanıcı mesaj yazmalıdır
  Background: ana sayfaya git
    Given Kullanıcı ana sayfaya gider.
    When Kullanıcı Contact butonuna tıklar.

  @US03_AC04_TC01
  Scenario: TC01 Message kutucuğuna valid girilmesi durumu

  And Kullanıcı name kutusuna "rabia" girer.
  And Kullanıcı mail kutusuna "valid bir mail" girer
  And Kullanıcı subject kutusuna "subject" girer.
  And Kullanıcı message kutusuna "mesaj" girer.
  And Kullanıcı send message butonuna tıklar
  And Kullanıcı bir saniye bekler
  And Mesaj gönderim işlemi gerçekleşir.
    And Kullanıcı sayfayı kapatır.

  @US03_AC04_TC02
  Scenario: TC02 Message kutucuğunun boş bırakılması durumu

    And Kullanıcı name kutusuna "rabia" girer.
    And Kullanıcı mail kutusuna "valid bir mail" girer
    And Kullanıcı subject kutusuna "subject" girer.
    And Kullanıcı message kutusunu bos birakir.
    And Kullanıcı send message butonuna tıklar
    And Kullanıcı bir saniye bekler
    And Kullanıcı mesajın iletilemediğini doğrular.
    And Kullanıcı sayfayı kapatır.