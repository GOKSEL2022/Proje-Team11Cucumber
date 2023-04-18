@US23_TC05 @team11
Feature: Admin Vice Dean hesabi olusturabilmelidir

  Background:Managementon_Schools_sayfasina_git
    Given "https://www.managementonschools.com/" url'ine git
    Given Home sayfasindaki Login buttonuna tikla
    Given Admin olarak User Name'i gir
    Given Admin olarak Password'u gir
    Given Login buttonuna tikla
    Given Vice Dean Management sayfasinda oldugunu dogrula

  Scenario Outline:US23_TC05_Password_alaninin_testi
    When Name alanina valid bir "<Name>" gir
    And Surname alanina valid bir "<Surname>" gir
    And Birth Place alanina valid bir "<Birth Place>" gir
    And Gender alanini bos birak
    And Date Of Birth alanina valid bir "<Date Of Birth>" gir
    And Phone alanina valid bir "<Phone>" gir
    And Ssn alanina valid bir "<Ssn>" gir
    And User Name alanina valid bir "<User Name>" gir
    And Password alanina valid bir "<Password>" gir
    And Submit butonuna tiklayama



    Examples: Admin_Vice_Dean_Bilgileri
      | Name    | Surname | Birth Place | Date Of Birth | Phone        | Ssn         | User Name | Password |
      | Nilufer | Ozkul   | Izmir       | 06.08.1965    | 552-919-2222 | 103-13-1031 | niloz     |          |