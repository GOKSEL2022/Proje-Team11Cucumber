@US23_TC02 @team11 @smoke
Feature: Admin Vice Dean hesabi olusturabilmelidir

  Background:Managementon_Schools_sayfasina_git
    Given Nilufer "https://www.managementonschools.com/" url'ine git
    Given Nilufer Home sayfasindaki Login buttonuna tikla
    Given Nilufer Admin olarak User Name'i gir
    Given Nilufer Admin olarak Password'u gir
    Given Nilufer Login buttonuna tikla
    Given Nilufer Vice Dean Management sayfasinda oldugunu dogrula

  Scenario Outline:US23_TC02_Name_alaninin_testi
    When Nilufer Name alanina "<Name>" girmeyerek bos birak
    And Nilufer Surname alanina tikla
    And Nilufer Name alani altinda Required mesajini gor
    And Nilufer Name alanina valid bir "<Name>" gir
    And Nilufer Name alani altinda hata mesaji goruntulenmemeli
    Then Nilufer Menu buttonuna tiklar
    Then Nilufer Logout yapar

    Examples: Admin_Vice_Dean_Bilgileri
      | Name    |
      |         |
      | Nilufer |