@US06_TC01 @team11 @smoke
Feature: Dean Vice Dean hesabi olusturabilmelidir

  Background:Managementon_Schools_sayfasina_git
    Given Nilufer "https://www.managementonschools.com/" url'ine gider
    Given Nilufer Home sayfasindaki Login buttonuna tiklar
    Given Nilufer Dean olarak User Name'i girer
    Given Nilufer Dean olarak Password'u girer
    Given Nilufer Login buttonuna tiklar
    Given Nilufer "Vice Dean Management" sayfasinda oldugunu dogrular

  Scenario Outline:US06_TC01_Tum_alanlarin_dogru_bir_sekilde_girilmesi
    When Nilufer Name alanina valid bir "<Name>" girer
    And Nilufer Surname alanina valid bir "<Surname>" girer
    And Nilufer Birth Place alanina valid bir "<Birth Place>" girer
    And Nilufer Gender alanina valid bir Gender secer
    And Nilufer Date Of Birth alanina valid bir "<Date Of Birth>" girer
    And Nilufer Phone alanina valid bir "<Phone>" girer
    And Nilufer Ssn alanina valid bir "<Ssn>" girer
    And Nilufer User Name alanina valid bir "<User Name>" girer
    And Nilufer Password alanina valid bir "<Password>" girer
    And Nilufer Submit butonuna tiklar
    And Nilufer Dean olarak Vice Dean olusturdugunu dogrular
    Then Nilufer Menu buttonuna tiklar
    Then Nilufer Logout yapar

    Examples: Dean_Vice_Dean_Bilgileri
      | Name | Surname | Birth Place | Date Of Birth | Phone        | Ssn         | User Name | Password |
      | Esma | Yilmaz  | Izmir       | 01.01.1998    | 542-900-2287 | 173-13-9831 | esma      | 12345678 |


















