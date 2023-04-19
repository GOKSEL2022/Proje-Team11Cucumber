@US09_AC01,@team11
Feature: US09_TC01

  Scenario: US09_TC01
    Given MDogan "https://www.managementonschools.com/" url ye gider
    And MDogan bir saniye bekler
    And MDogan anasayfa login butonuna tiklar
    And MDogan bir saniye bekler
    And MDogan username "john.wick" girer
    And  MDogan password "78947894" girer
    And MDogan login butonuna tiklar
    And MDogan bir saniye bekler
    And MDogan menu butonuna tiklar
    And MDogan Lesson Managamente tiklar
    And  MDogan Lessons a tiklar
    And MDogan bir saniye bekler
    Then MDogan eklenen Lesson lari gorur