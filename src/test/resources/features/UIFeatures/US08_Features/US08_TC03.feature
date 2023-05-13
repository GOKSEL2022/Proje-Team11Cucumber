@US08_AC03,@team11 @team11Regression
Feature: US08_TC03

  Scenario: US08_TC03
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
    And MDogan Lesson name "yunanca" girer
    And MDogan Compulsory kutucugunu tiklar
    And MDogan Credit Score Kutusuna tiklar
    And MDogan Credit score "95" girer
    Then Kullanici Submit butonuna tiklar
    Then close the application


