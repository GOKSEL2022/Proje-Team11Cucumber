@US16_AC01,@team11 @team11Regression @team11Smoke
Feature: US16_TC01

  Scenario: US16_TC01
    Given MDogan "https://www.managementonschools.com/" url ye gider
    And MDogan bir saniye bekler
    And MDogan anasayfa login butonuna tiklar
    And MDogan bir saniye bekler
    And MDogan username "john.wick" girer
    And  MDogan password "78947894" girer
    And MDogan login butonuna tiklar
    And MDogan bir saniye bekler
    And MDogan menu butonuna tiklar
    And MDogan bir saniye bekler
    And MDogan Contact Get All sekmesine tiklar
    And MDogan bir saniye bekler
    And MDogan mesajlari goruntuler
    And MDogan mesaj yazarini (name) goruntuler
    And MDogan e maillerini goruntuler
    And MDogan gonderilme tarihini (date) goruntuler
    Then MDogan subject bilgilerini goruntuler
    Then close the application