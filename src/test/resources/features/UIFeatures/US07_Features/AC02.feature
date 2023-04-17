@US07_AC02
Feature: Dean mesajları silebilmelidir.

  Background: Kullanıcı contact_getAll sayfasına erişir

    Given Kullanıcı ana sayfaya gider.
    When Kullanıcı dean olarak giris yapar
    And Kullanıcı menu butonuna tıklar.
    And Kullanıcı açılan sekmede Contact Get All linkine tıklar.
    And Kullanıcı contact-getAll sayfasındadır.

    Scenario: TC01 Dean'in mesajları silebilmesi durumu

    Then Kullanıcı sayfada Contact message bölümünü dogrular.
    Then Kullanıcı sayfada delete butonu olduğunu dogrular.
    Then Kullanıcı mesajı siler.
    Then Kullanıcı mesajın silindiğini doğrular.
