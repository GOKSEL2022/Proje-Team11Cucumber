@US06_TC09 @team11 @smoke
Feature: Dean Vice Dean hesabi olusturabilmelidir

  Background:Managementon_Schools_sayfasina_git
    Given Nilufer "https://www.managementonschools.com/" url'ine gider
    Given Nilufer Home sayfasindaki Login buttonuna tiklar
    Given Nilufer Dean olarak User Name'i girer
    Given Nilufer Dean olarak Password'u girer
    Given Nilufer Login buttonuna tiklar
    Given Nilufer "Vice Dean Management" sayfasinda oldugunu dogrular

  Scenario Outline:US06_TC09_User_Name_alaninin_testi_alaninin_testi
    When Nilufer Kullanici User Name alanina "<User Name>" girmeyerek bos birakir
    And Nilufer Kullanici Password alanina tiklar
    And Nilufer Kullanici User Name alani altinda Required mesajini gorur
    And Nilufer Kullanici User Name alanina valid bir "<User Name>" girer
    And Nilufer Kullanici User Name alani altinda hata mesaji goruntulenmemelidir
    Then Nilufer Menu buttonuna tiklar
    Then Nilufer Logout yapar

    Examples: Dean_Vice_Dean_Bilgileri
      | User Name |
      |           |
      | niloz     |