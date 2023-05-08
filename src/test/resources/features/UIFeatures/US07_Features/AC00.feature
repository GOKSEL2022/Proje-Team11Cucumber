@US07_AC00 @team11 @US07 @US22 @team11Regression
Feature: Dean olarak login olma

  Scenario: TC01 rabianın dean olarak giriş yapabilmesi durumu

    Given rabia ana sayfaya gider.
    When rabia Login linkine tıklar.
    Then rabia user name kutusuna tıklar.
    And rabia user name kutusuna dean username girer.
    And rabia password kutusuna tıklar.
    And rabia password kutusuna dean sifre girer.
    And rabia login butonuna tıklar.
    And rabia sayfayı kapatır.

