@US23_TC03 @team11 @smoke
Feature: Admin Vice Dean hesabi olusturabilmelidir

  Background:Managementon_Schools_sayfasina_git
    Given Nilufer "https://www.managementonschools.com/" url'ine git
    Given Nilufer Home sayfasindaki Login buttonuna tikla
    Given Nilufer Admin olarak User Name'i gir
    Given Nilufer Admin olarak Password'u gir
    Given Nilufer Login buttonuna tikla
    Given Nilufer Vice Dean Management sayfasinda oldugunu dogrula

  Scenario Outline:US23_TC03_Surname_alaninin_testi
    When Nilufer Surname alanina "<Surname>" girmeyerek bos birak
    And Nilufer Birth Place alanina tikla
    And Nilufer Surname alani altinda Required mesajini gor
    And Nilufer Surname alanina valid bir "<Surname>" gir
    And Nilufer Surname alani altinda hata mesaji goruntulenmemeli
    Then Nilufer Menu buttonuna tiklar
    Then Nilufer Logout yapar

    Examples: Admin_Vice_Dean_Bilgileri
      | Surname |
      |         |
      | Ozkul   |