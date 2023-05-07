@US07_AC02 @team11 @US07 @US22
Feature: Dean mesajları silebilmelidir.

  Background: rabia contact_getAll sayfasına erişir

    Given rabia ana sayfaya gider.
    When rabia dean olarak giris yapar
    And rabia menu butonuna tıklar.
    And rabia açılan sekmede Contact Get All linkine tıklar.
    And rabia contact-getAll sayfasındadır.

    Scenario: TC01 Dean'in mesajları silebilmesi durumu

    Then rabia sayfada Contact message bölümünü dogrular.
    Then rabia sayfada delete butonu olduğunu dogrular.
    Then rabia mesajı siler.
    Then rabia mesajın silindiğini doğrular.
