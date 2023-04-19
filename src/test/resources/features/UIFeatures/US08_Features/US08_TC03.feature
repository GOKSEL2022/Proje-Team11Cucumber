@US08_TC03
Feature: US08_TC03

  Scenario: US08_TC03
    Given Kullanici "https://www.managementonschools.com/" url ye gider
    And Kullanici bir saniye bekler
    And Kullanici anasayfa login butonuna tiklar
    And Kullanici bir saniye bekler
    And Kullanici username "john.wick" girer
    And  Kullanici password "78947894" girer
    And Kullanici login butonuna tiklar
    And Kullanici bir saniye bekler
    And Kullanici Lessons a tiklar
    And Kullanici bir saniye bekler
    And Kullanici Lesson Name kismina tiklar
    And Kullanici bir saniye bekler
    And Kullanici Lesson name "yunanca" girer
    And Kullanici Compulsory kutucugunu tiklar
    And Kullanici Credit Score Kutusuna tiklar
    And Kullanici Credit score "95" girer
    Then Kullanici Submit butonuna tiklar


