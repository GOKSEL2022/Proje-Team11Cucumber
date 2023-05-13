@US09_AC02,@team11 @team11Regression
Feature: US09_TC02

  Scenario: US09_TC02
    Given MDogan "https://www.managementonschools.com/" url ye gider
    And MDogan bir saniye bekler
    And MDogan anasayfa login butonuna tiklar
    And MDogan bir saniye bekler
    And MDogan username "john.wick" girer
    And  MDogan password "78947894" girer
    And MDogan login butonuna tiklar
    And MDogan bir saniye bekler
    And MDogan Lessons a tiklar
    And MDogan eklenen Lesson lari gorur
    Then MDogan Ders Listesindeki Sil Butonuna Tiklar
    Then close the application