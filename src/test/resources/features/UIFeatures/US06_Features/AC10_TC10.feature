@US06_TC10 @team11 @smoke
Feature: Dean Vice Dean hesabi olusturabilmelidir

  Background:Managementon_Schools_sayfasina_git
    Given Nilufer "https://www.managementonschools.com/" url'ine gider
    Given Nilufer Home sayfasindaki Login buttonuna tiklar
    Given Nilufer Dean olarak User Name'i girer
    Given Nilufer Dean olarak Password'u girer
    Given Nilufer Login buttonuna tiklar
    Given Nilufer "Vice Dean Management" sayfasinda oldugunu dogrular

  Scenario Outline:US06_TC10_Password_alaninin_testi
    When Nilufer Name alanina valid bir "<Name>" girer
    And Nilufer Surname alanina valid bir "<Surname>" girer
    And Nilufer Birth Place alanina valid bir "<Birth Place>" girer
    And Nilufer Gender alanina valid bir Gender secer
    And Nilufer Date Of Birth alanina valid bir "<Date Of Birth>" girer
    And Nilufer Phone alanina valid bir "<Phone>" girer
    And Nilufer Ssn alanina valid bir "<Ssn>" girer
    And Nilufer User Name alanina valid bir "<User Name>" girer
    And Nilufer Password alanina "<Password>" girmeyerek bos birakir
    And Nilufer Submit butonuna tiklayamaz
    And Nilufer Password alani altinda Required mesajini gorur
    And Nilufer Name alanina valid bir "<Name>" girer
    And Nilufer Surname alanina valid bir "<Surname>" girer
    And Nilufer Birth Place alanina valid bir "<Birth Place>" girer
    And Nilufer Gender alanina valid bir Gender secer
    And Nilufer Date Of Birth alanina valid bir "<Date Of Birth>" girer
    And Nilufer Phone alanina valid bir "<Phone>" girer
    And Nilufer Ssn alanina valid bir "<Ssn>" girer
    And Nilufer User Name alanina valid bir "<User Name>" girer
    And Nilufer Password alanina "<Password>" olarak yedi karakter veri girer
    And Nilufer Submit butonuna tiklayamaz
    And Nilufer Password alani altinda Minimum 8 character mesajini gorur
    Then Nilufer Menu buttonuna tiklar
    Then Nilufer Logout yapar

    Examples: Dean_Vice_Dean_Bilgileri
      | Name    | Surname | Birth Place | Date Of Birth | Phone        | Ssn         | User Name | Password |
      | Nilufer | Ozkul   | Izmir       | 06.08.1965    | 552-919-2222 | 103-13-1031 | niloz     |          |
      | Nilufer | Ozkul   | Izmir       | 06.08.1965    | 552-919-2222 | 103-13-1031 | niloz     | Nil.123  |