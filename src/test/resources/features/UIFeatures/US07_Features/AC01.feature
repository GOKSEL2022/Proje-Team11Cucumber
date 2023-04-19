@US07_AC01,@team11
Feature: Dean, mesajları, yazarlarını, e-maillerini, gönderilme tarihi ve  subject bilgilerini görüntüleyebilmelidir

  Background: rabia contact_getAll sayfasına erişir

    Given rabia ana sayfaya gider.
    When rabia dean olarak giris yapar
    And rabia bir saniye bekler
    And rabia dean olarak giris yaptığını dogrular.
    And rabia menu butonuna tıklar.
    And rabia bir saniye bekler
    And rabia açılan sekmede Contact Get All linkine tıklar.
    And rabia bir saniye bekler
    And rabia contact-getAll sayfasındadır.



    Scenario: TC02 Dean'in mesajları görüntüleyebilmesi durumu
      And rabia bir saniye bekler
      Then rabia sayfada mesajları görüntüler.
      And rabia sayfayı kapatır.



    Scenario: TC03 Dean'in, mesajların yazarlarını görüntüleyebilmesi durumu
      And rabia bir saniye bekler
      Then rabia sayfada mesajların yazarlarını göründügünü dogrular
      And rabia sayfayı kapatır.


  Scenario: TC04 Dean'in, mesajların yazarlarının e-maillerini görüntüleyebilmesi durumu
    And rabia bir saniye bekler
    Then rabia sayfada mesajları  mesaj gönderenlerin emaillerinin görüntülendigini dogrular
    And rabia sayfayı kapatır.



  Scenario: TC05 Dean'in, mesajların gönderilme tarihini görüntüleyebilmesi durumu
    And rabia bir saniye bekler
    Then Dean'in, mesajların gönderilme tarihini görüntüledigini dogrular
    And rabia sayfayı kapatır.



  Scenario: TC06 Dean'in, mesajların subject bilgilerini görüntüleyebilmesi durumu
    And rabia bir saniye bekler
    Then rabia sayfada mesajların subject bilgilerini görüntüledigini dogrular
    And rabia sayfayı kapatır.