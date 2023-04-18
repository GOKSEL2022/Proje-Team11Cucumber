@US23_TC06 @team11 @smoke
Feature: Admin Vice Dean hesabi olusturabilmelidir
  Background:Managementon_Schools_sayfasina_git
    Given Nilufer "https://www.managementonschools.com/" url'ine git
    Given Nilufer Home sayfasindaki Login buttonuna tikla
    Given Nilufer Admin olarak User Name'i gir
    Given Nilufer Admin olarak Password'u gir
    Given Nilufer Login buttonuna tikla
    Given Nilufer Vice Dean Management sayfasinda oldugunu dogrula

  Scenario Outline:US23_TC06_Date_Of_Birth_alaninin_testi
    When Nilufer Date Of Birth alanina "<Date Of Birth>" girmeyerek bos birak
    And Nilufer Phone alanina tikla
    And Nilufer Date Of Birth alani altinda Required mesajini gor
    And Nilufer Date Of Birth alanina valid bir "<Date Of Birth>" gir
    And Nilufer Date Of Birth alani altinda hata mesaji goruntulenmemeli
    Then Nilufer Menu buttonuna tiklar
    Then Nilufer Logout yapar

    Examples: Admin_Vice_Dean_Bilgileri
      | Date Of Birth |
      |               |
      | 06.08.1965    |