@US22_AC00
Feature: Pre-Condition

  Scenario: TC01 Admin olarak giriş yapabilmesi durumu

    Given Kullanıcı ana sayfaya gider.
    When Kullanıcı Login linkine tıklar.
    Then Kullanıcı user name kutusuna tıklar.
    And Kullanıcı user name kutusuna admin username girer.
    And Kullanıcı password kutusuna tıklar.
    And Kullanıcı password kutusuna admin sifre girer.
    And Kullanıcı login butonuna tıklar.