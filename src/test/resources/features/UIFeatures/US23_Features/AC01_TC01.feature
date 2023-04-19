@US23_TC01 @team11 @smoke
Feature: Admin Vice Dean hesabi olusturabilmelidir

  Background:Managementon_Schools_sayfasina_git
    Given Nilufer "https://www.managementonschools.com/" url'ine git
    Given Nilufer Home sayfasindaki Login buttonuna tikla
    Given Nilufer Admin olarak User Name'i gir
    Given Nilufer Admin olarak Password'u gir
    Given Nilufer Login buttonuna tikla
    Given Nilufer Vice Dean Management sayfasinda oldugunu dogrula

  Scenario US23_TC01_Tum_alanlarin_dogru_bir_sekilde_girilmesi
    When Nilufer Name alanina valid bir deger gir
    And Nilufer Surname alanina valid bir deger gir
    And Nilufer Birth Place alanina valid bir deger gir
    And Nilufer Gender alanina valid bir Gender sec
    And Nilufer Date Of Birth alanina valid bir deger gir
    And Nilufer Phone alanina valid bir deger gir
    And Nilufer Ssn alanina valid bir deger gir
    And Nilufer User Name alanina valid bir deger gir
    And Nilufer Password alanina valid bir deger gir
    And Nilufer Submit butonuna tikla
    And Nilufer Admin olarak Vice Dean olusturdugunu dogrula
    Then Nilufer Menu buttonuna tikla
    Then Nilufer Logout yap

