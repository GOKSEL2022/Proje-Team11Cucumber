@US07_AC01,@team11
Feature: Dean, mesajları, yazarlarını, e-maillerini, gönderilme tarihi ve  subject bilgilerini görüntüleyebilmelidir

  Background: Kullanıcı contact_getAll sayfasına erişir

    Given Kullanıcı ana sayfaya gider.
    When Kullanıcı dean olarak giris yapar
    And Kullanıcı bir saniye bekler
    And Kullanıcı dean olarak giris yaptığını dogrular.
    And Kullanıcı menu butonuna tıklar.
    And Kullanıcı bir saniye bekler
    And Kullanıcı açılan sekmede Contact Get All linkine tıklar.
    And Kullanıcı bir saniye bekler
    And Kullanıcı contact-getAll sayfasındadır.



    Scenario: TC02 Dean'in mesajları görüntüleyebilmesi durumu
      And Kullanıcı bir saniye bekler
      Then Kullanıcı sayfada mesajları görüntüler.
      And Kullanıcı sayfayı kapatır.



    Scenario: TC03 Dean'in, mesajların yazarlarını görüntüleyebilmesi durumu
      And Kullanıcı bir saniye bekler
      Then Kullanıcı sayfada mesajların yazarlarını göründügünü dogrular
      And Kullanıcı sayfayı kapatır.


  Scenario: TC04 Dean'in, mesajların yazarlarının e-maillerini görüntüleyebilmesi durumu
    And Kullanıcı bir saniye bekler
    Then Kullanıcı sayfada mesajları  mesaj gönderenlerin emaillerinin görüntülendigini dogrular
    And Kullanıcı sayfayı kapatır.



  Scenario: TC05 Dean'in, mesajların gönderilme tarihini görüntüleyebilmesi durumu
    And Kullanıcı bir saniye bekler
    Then Dean'in, mesajların gönderilme tarihini görüntüledigini dogrular
    And Kullanıcı sayfayı kapatır.



  Scenario: TC06 Dean'in, mesajların subject bilgilerini görüntüleyebilmesi durumu
    And Kullanıcı bir saniye bekler
    Then Kullanıcı sayfada mesajların subject bilgilerini görüntüledigini dogrular
    And Kullanıcı sayfayı kapatır.