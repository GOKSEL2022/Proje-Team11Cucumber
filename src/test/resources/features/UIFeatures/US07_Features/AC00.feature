@US07_AC00
Feature: Dean olarak login olma

  Scenario: TC01 Kullanıcının dean olarak giriş yapabilmesi durumu

    Given Kullanıcı ana sayfaya gider.
    When Kullanıcı Login linkine tıklar.
    Then Kullanıcı user name kutusuna tıklar.
    And Kullanıcı user name kutusuna dean username girer.
    And Kullanıcı password kutusuna tıklar.
    And Kullanıcı password kutusuna dean sifre girer.
    And Kullanıcı login butonuna tıklar.
    And Kullanıcı sayfayı kapatır.

