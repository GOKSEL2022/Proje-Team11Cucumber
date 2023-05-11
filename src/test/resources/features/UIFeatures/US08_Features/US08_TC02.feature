@US08_AC02,@team11 @team11Regression
Feature: US08_TC02

  Scenario: US08_TC02
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
    And MDogan Lesson name "Arapca" girer
    Then MDogan Compulsory kutucugunu tiklar
    Then close the application

