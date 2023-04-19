@US06_TC01 @team11 @smoke
Feature: Dean Vice Dean hesabi olusturabilmelidir

  Background:Managementon_Schools_sayfasina_git
    Given Nilufer "https://www.managementonschools.com/" url'ine gider
    Given Nilufer Home sayfasindaki Login buttonuna tiklar
    Given Nilufer Dean olarak User Name'i girer
    Given Nilufer Dean olarak Password'u girer
    Given Nilufer Login buttonuna tiklar
    Given Nilufer Vice Dean Management sayfasinda oldugunu dogrular

  Scenario US06_TC01_Tum_alanlarin_dogru_bir_sekilde_girilmesi
    When Nilufer Name alanina valid bir deger girer
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
    Then Nilufer Menu buttonuna tiklar
    Then Nilufer Logout yapar



















