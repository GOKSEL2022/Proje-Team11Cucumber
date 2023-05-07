
Feature:  Dean, mesajları, yazarlarını, e-maillerini, gönderilme tarihi ve
  subject bilgilerini görüntüleyebilmelidir.
#  Background: Mesaj gonderme
#    Given Ogrenci mesaj gonderir.

  Scenario: TCO1 ogrenci mesajlari sorgulamasi ve dogrulamasi dd
    Given Database icin contact saglanir
    When Databaseden olusturulan mesajlar sorgulanir
    Then Gonderilen mesajlarin goruldugu dogrulanir

#  Scenario: TCO2 mesaji gonderenlerin isimlerinin sorgulamasi ve dogrulamasi
#    Given Database icin contact saglanir
#    When Databaseden olusturulan yazarlar sorgulanir
#    Then Gonderilen mesajlarin yazarlarinin goruldugu dogrulanir
#
#  Scenario: TCO3 mesaajlari gonderenlerin emaillerinin sorgulaması ve dogrulamasi
#    Given Database icin contact saglanir
#    When Databaseden mesaajlari gonderenlerin emailleri  sorgulanir
#    Then Gonderilen mesaajlari gonderenlerin emaillerinin goruldugu dogrulanir
#
#  Scenario: TC04 mesajların gonderilme tarihlerinin sorgulamasi ve dogrulamasi
#    Given Database icin contact saglanir
#    When Databaseden mesaajlarin gonderilme tarihi  sorgulanir
#    Then Gonderilen mesaajlarin tarihinin goruldugu dogrulanir
