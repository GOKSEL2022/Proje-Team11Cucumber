@US23_TC09 @team11 @smoke
Feature: Admin Vice Dean hesabi olusturabilmelidir

  Background:Managementon_Schools_sayfasina_git
    Given Nilufer "https://www.managementonschools.com/" url'ine git
    Given Nilufer Home sayfasindaki Login buttonuna tikla
    Given Nilufer Admin olarak User Name'i gir
    Given Nilufer Admin olarak Password'u gir
    Given Nilufer Login buttonuna tikla
    Given Nilufer Vice Dean Management sayfasinda oldugunu dogrula

  Scenario Outline:US06_TC09_User_Name_alaninin_testi_alaninin_testi
    When Nilufer User Name alanina "<User Name>" girmeyerek bos birak
    And Nilufer Password alanina tikla
    And Nilufer User Name alani altinda Required mesajini gor
    And Nilufer User Name alanina valid bir "<User Name>" gir
    And Nilufer User Name alani altinda hata mesaji goruntulenmemeli
    Then Nilufer Menu buttonuna tiklar
    Then Nilufer Logout yapar

    Examples: Admin_Vice_Dean_Bilgileri
      | User Name |
      |           |
      | niloz     |