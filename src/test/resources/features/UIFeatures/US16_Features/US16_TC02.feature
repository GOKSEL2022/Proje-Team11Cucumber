@US16_TC01
Feature: US16_TC01

  Scenario: US16_TC01
    Given Kullanici "https://www.managementonschools.com/" url ye gider
    And Kullanici bir saniye bekler
    And Kullanici anasayfa login butonuna tiklar
    And Kullanici bir saniye bekler
    And Kullanici username "john.wick" girer
    And  Kullanici password "78947894" girer
    And Kullanici login butonuna tiklar
    And Kullanici bir saniye bekler
    And Kullanici menu butonuna tiklar
    And Kullanici bir saniye bekler
    And Kullanici Contact Get All sekmesine tiklar
    Then Kullanici delete butonuna tiklar


