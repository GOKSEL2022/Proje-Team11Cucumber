@US09_TC02
Feature: US09_TC02

  Scenario: US09_TC02
    Given Kullanici "https://www.managementonschools.com/" url ye gider
    And Kullanici bir saniye bekler
    And Kullanici anasayfa login butonuna tiklar
    And Kullanici bir saniye bekler
    And Kullanici username "john.wick" girer
    And  Kullanici password "78947894" girer
    And Kullanici login butonuna tiklar
    And Kullanici bir saniye bekler
    And Kullanici Lessons a tiklar
    And Kullanici eklenen Lesson lari gorur
    Then Kullanici Ders Listesindeki Sil Butonuna Tiklar