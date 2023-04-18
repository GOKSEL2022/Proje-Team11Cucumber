@US08_TC01
Feature: US08_TC01

  Scenario: US08_TC01
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
    Then Kullanici Lesson name "string" girer
