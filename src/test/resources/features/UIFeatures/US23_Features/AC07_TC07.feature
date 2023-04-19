@US23_TC07 @team11 @smoke
Feature: Admin Vice Dean hesabi olusturabilmelidir

  Background:Managementon_Schools_sayfasina_git
    Given Nilufer "https://www.managementonschools.com/" url'ine git
    Given Nilufer Home sayfasindaki Login buttonuna tikla
    Given Nilufer Admin olarak User Name'i gir
    Given Nilufer Admin olarak Password'u gir
    Given Nilufer Login buttonuna tikla
    Given Nilufer Vice Dean Management sayfasinda oldugunu dogrula

  Scenario Outline:US23_TC07_Phone_alaninin_testi_alaninin_testi
    When Nilufer Phone alanina "<Phone>" girmeyerek bos birak
    And Nilufer Ssn alanina tikla
    And Nilufer Phone alani altinda Required mesajini gor
    And Nilufer Phone alanina valid bir "<Phone>" gir
    And Nilufer Phone alani altinda hata mesaji goruntulenmemeli
    Then Nilufer Menu buttonuna tiklar
    Then Nilufer Logout yapar

    Examples: Admin_Vice_Dean_Bilgileri
      | Phone        |
      |              |
      | 552-919-2222 |