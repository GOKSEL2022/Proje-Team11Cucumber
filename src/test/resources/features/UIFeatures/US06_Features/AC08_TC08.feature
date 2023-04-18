@US06_TC08 @team11 @smoke
Feature: Dean Vice Dean hesabi olusturabilmelidir

  Background:Managementon_Schools_sayfasina_git
    Given Nilufer "https://www.managementonschools.com/" url'ine gider
    Given Nilufer Home sayfasindaki Login buttonuna tiklar
    Given Nilufer Dean olarak User Name'i girer
    Given Nilufer Dean olarak Password'u girer
    Given Nilufer Login buttonuna tiklar
    Given Nilufer "Vice Dean Management" sayfasinda oldugunu dogrular

  Scenario Outline:US06_TC08_Ssn_alaninin_testi_alaninin_testi
    When Nilufer Kullanici Ssn alanina "<Ssn>" girmeyerek bos birakir
    And Nilufer Kullanici User Name alanina tiklar
    And Nilufer Kullanici Ssn alani altinda Required mesajini gorur
    And Nilufer Kullanici Ssn alanina valid bir "<Ssn>" girer
    And Nilufer Kullanici Ssn alani altinda hata mesaji goruntulenmemelidir
    Then Nilufer Menu buttonuna tiklar
    Then Nilufer Logout yapar

    Examples: Dean_Vice_Dean_Bilgileri
      | Ssn         |
      |             |
      | 103-13-1031 |