@US06_TC02 @team11 @smoke
Feature: Dean Vice Dean hesabi olusturabilmelidir

  Background:Managementon_Schools_sayfasina_git
    Given Nilufer "https://www.managementonschools.com/" url'ine gider
    Given Nilufer Home sayfasindaki Login buttonuna tiklar
    Given Nilufer Dean olarak User Name'i girer
    Given Nilufer Dean olarak Password'u girer
    Given Nilufer Login buttonuna tiklar
    Given Nilufer "Vice Dean Management" sayfasinda oldugunu dogrular

  Scenario Outline:US06_TC02_Name_alaninin_testi
    When Nilufer Kullanici Name alanina "<Name>" girmeyerek bos birakir
    And Nilufer Kullanici Surname alanina tiklar
    And Nilufer Kullanici Name alani altinda Required mesajini gorur
    And Nilufer Kullanici Name alanina valid bir "<Name>" girer
    And Nilufer Kullanici Name alani altinda hata mesaji goruntulenmemelidir
    Then Nilufer Menu buttonuna tiklar
    Then Nilufer Logout yapar

    Examples: Dean_Vice_Dean_Bilgileri
      | Name    |
      |         |
      | Nilufer |


















