@US22_AC00 @team11 @US22
Feature: Pre-Condition

  Scenario: TC01 Admin olarak giriş yapabilmesi durumu

    Given rabia ana sayfaya gider.
    When rabia Login linkine tıklar.
    Then rabia user name kutusuna tıklar.
    And rabia user name kutusuna admin username girer.
    And rabia password kutusuna tıklar.
    And rabia password kutusuna admin sifre girer.
    And rabia login butonuna tıklar.