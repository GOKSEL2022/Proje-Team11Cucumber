@US06_TC05 @team11 @smoke
Feature: Dean Vice Dean hesabi olusturabilmelidir

  Background:Managementon_Schools_sayfasina_git
    Given Nilufer "https://www.managementonschools.com/" url'ine gider
    Given Nilufer Home sayfasindaki Login buttonuna tiklar
    Given Nilufer Dean olarak User Name'i girer
    Given Nilufer Dean olarak Password'u girer
    Given Nilufer Login buttonuna tiklar
    Given Nilufer "Vice Dean Management" sayfasinda oldugunu dogrular

  Scenario Outline:US06_TC05_Password_alaninin_testi
    When Nilufer Kullanici Name alanina valid bir "<Name>" girer
    And Nilufer Kullanici Surname alanina valid bir "<Surname>" girer
    And Nilufer Kullanici Birth Place alanina valid bir "<Birth Place>" girer
    And Nilufer Kullanici Gender alanini bos birakir
    And Nilufer Kullanici Date Of Birth alanina valid bir "<Date Of Birth>" girer
    And Nilufer Kullanici Phone alanina valid bir "<Phone>" girer
    And Nilufer Kullanici Ssn alanina valid bir "<Ssn>" girer
    And Nilufer Kullanici User Name alanina valid bir "<User Name>" girer
    And Nilufer Kullanici Password alanina valid bir "<Password>" girer
    And Nilufer Kullanici Submit butonuna tiklayamaz
    Then Nilufer Menu buttonuna tiklar
    Then Nilufer Logout yapar



    Examples: Dean_Vice_Dean_Bilgileri
      | Name    | Surname | Birth Place | Date Of Birth | Phone        | Ssn         | User Name | Password |
      | Nilufer | Ozkul   | Izmir       | 06.08.1965    | 552-919-2222 | 103-13-1031 | niloz     |          |
