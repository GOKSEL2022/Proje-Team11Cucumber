@US06_TC07 @team11 @smoke
Feature: Dean Vice Dean hesabi olusturabilmelidir

  Background:Managementon_Schools_sayfasina_git
    Given Nilufer "https://www.managementonschools.com/" url'ine gider
    Given Nilufer Home sayfasindaki Login buttonuna tiklar
    Given Nilufer Dean olarak User Name'i girer
    Given Nilufer Dean olarak Password'u girer
    Given Nilufer Login buttonuna tiklar
    Given Nilufer "Vice Dean Management" sayfasinda oldugunu dogrular

  Scenario Outline:US06_TC07_Phone_alaninin_testi_alaninin_testi
    When Nilufer Kullanici Phone alanina "<Phone>" girmeyerek bos birakir
    And Nilufer Kullanici Ssn alanina tiklar
    And Nilufer Kullanici Phone alani altinda Required mesajini gorur
    And Nilufer Kullanici Phone alanina valid bir "<Phone>" girer
    And Nilufer Kullanici Phone alani altinda hata mesaji goruntulenmemelidir
    Then Nilufer Menu buttonuna tiklar
    Then Nilufer Logout yapar

    Examples: Dean_Vice_Dean_Bilgileri
      | Phone        |
      |              |
      | 552-919-2222 |