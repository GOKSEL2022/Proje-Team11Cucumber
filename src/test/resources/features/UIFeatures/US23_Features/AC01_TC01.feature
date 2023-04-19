@US23_TC01 @team11 @smoke
Feature: Admin Vice Dean hesabi olusturabilmelidir

  Background:Managementon_Schools_sayfasina_git
    Given Nilufer "https://www.managementonschools.com/" url'ine git
    Given Nilufer Home sayfasindaki Login buttonuna tikla
    Given Nilufer Admin olarak User Name'i gir
    Given Nilufer Admin olarak Password'u gir
    Given Nilufer Login buttonuna tikla
    Given Nilufer Vice Dean Management sayfasinda oldugunu dogrula

  Scenario Outline:US23_TC01_Tum_alanlarin_dogru_bir_sekilde_girilmesi
    When Nilufer Name alanina valid bir "<Name>" gir
    And Nilufer Surname alanina valid bir "<Surname>" gir
    And Nilufer Birth Place alanina valid bir "<Birth Place>" gir
    And Nilufer Gender alanina valid bir Gender sec
    And Nilufer Date Of Birth alanina valid bir "<Date Of Birth>" gir
    And Nilufer Phone alanina valid bir "<Phone>" gir
    And Nilufer Ssn alanina valid bir "<Ssn>" gir
    And Nilufer User Name alanina valid bir "<User Name>" gir
    And Nilufer Password alanina valid bir "<Password>" gir
    And Nilufer Submit butonuna tikla
    And Nilufer Admin olarak Vice Dean olusturdugunu dogrula
    Then Nilufer Menu buttonuna tikla
    Then Nilufer Logout yap

    Examples: Admin_Vice_Dean_Bilgileri
      | Name    | Surname | Birth Place | Date Of Birth | Phone        | Ssn         | User Name | Password |
      | Nilufer | Ozkul   | Izmir       | 06.08.1965    | 552-919-2222 | 103-13-1031 | niloz     | Nil.1234 |