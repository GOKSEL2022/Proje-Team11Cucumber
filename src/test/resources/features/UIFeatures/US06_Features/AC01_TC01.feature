@Nilufer @team11
Feature: US06
  Scenario:US06
    Given Nilufer "https://www.managementonschools.com/" url'ine gider
    When Nilufer Home sayfasindaki Login buttonuna tiklar
    And Nilufer Dean olarak User Name'i girer
    And Nilufer Dean olarak Password'u girer
    And Nilufer Login buttonuna tiklar
    And Nilufer Vice Dean Management sayfasinda oldugunu dogrular
    And Nilufer Name alanina valid bir deger girer
    And Nilufer Surname alanina valid bir deger girer
    And Nilufer Birth Place alanina valid bir deger girer
    And Nilufer Gender alanina valid bir Gender secer
    And Nilufer Date Of Birth alanina valid bir deger girer
    And Nilufer Phone alanina valid bir deger girer
    And Nilufer Ssn alanina valid bir deger girer
    And Nilufer User Name alanina valid bir deger girer
    And Nilufer Password alanina valid bir deger girer
    And Nilufer Submit butonuna tiklar
    And Nilufer Dean olarak Vice Dean olusturdugunu dogrular
    Then close the application



















