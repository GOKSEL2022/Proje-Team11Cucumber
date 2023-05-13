@US08_AC01,@team11 @team11Regression @team11Smoke
Feature: US08_TC01

  Scenario: US08_TC01
    Given MDogan "https://www.managementonschools.com/" url ye gider
    And MDogan bir saniye bekler
    And MDogan anasayfa login butonuna tiklar
    And MDogan bir saniye bekler
    And MDogan username "john.wick" girer
    And  MDogan password "78947894" girer
    And MDogan login butonuna tiklar
    And MDogan bir saniye bekler
    And MDogan Lessons a tiklar
    And MDogan bir saniye bekler
    And MDogan Lesson Name kismina tiklar
    And MDogan bir saniye bekler
    Then MDogan Lesson name "string" girer
    Then close the application
