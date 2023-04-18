@US06_TC01 @team11
Feature: Dean Vice Dean hesabi olusturabilmelidir

  Background:Managementon_Schools_sayfasina_git
    Given Kullanici "https://www.managementonschools.com/" url'ine gider
    Given Kullanici Home sayfasindaki Login buttonuna tiklar
    Given Kullanici Dean olarak User Name'i girer
    Given Kullanici Dean olarak Password'u girer
    Given Kullanici Login buttonuna tiklar
    Given Kullanici "Vice Dean Management" sayfasinda oldugunu dogrular

  Scenario Outline:US06_TC01_Tum_alanlarin_dogru_bir_sekilde_girilmesi
    When Kullanici Name alanina valid bir "<Name>" girer
    And Kullanici Surname alanina valid bir "<Surname>" girer
    And Kullanici Birth Place alanina valid bir "<Birth Place>" girer
    And Kullanici Gender alanina valid bir Gender secer
    And Kullanici Date Of Birth alanina valid bir "<Date Of Birth>" girer
    And Kullanici Phone alanina valid bir "<Phone>" girer
    And Kullanici Ssn alanina valid bir "<Ssn>" girer
    And Kullanici User Name alanina valid bir "<User Name>" girer
    And Kullanici Password alanina valid bir "<Password>" girer
    And Kullanici Submit butonuna tiklar
    And Kullanici Dean olarak Vice Dean olusturdugunu dogrular

    Examples: Dean_Vice_Dean_Bilgileri
      | Name    | Surname | Birth Place | Date Of Birth | Phone        | Ssn         | User Name | Password |
      | Nilufer | Ozkul   | Izmir       | 06.08.1965    | 552-919-2222 | 103-13-1031 | niloz     | Nil.1234 |


















