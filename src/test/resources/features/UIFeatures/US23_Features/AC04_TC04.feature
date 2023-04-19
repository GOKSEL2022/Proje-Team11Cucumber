@US23_TC04 @team11 @smoke
Feature: Admin Vice Dean hesabi olusturabilmelidir

  Background:Managementon_Schools_sayfasina_git
    Given Nilufer "https://www.managementonschools.com/" url'ine git
    Given Nilufer Home sayfasindaki Login buttonuna tikla
    Given Nilufer Admin olarak User Name'i gir
    Given Nilufer Admin olarak Password'u gir
    Given Nilufer Login buttonuna tikla
    Given Nilufer Vice Dean Management sayfasinda oldugunu dogrula

  Scenario Outline:US23_TC04_Birth_Place_alaninin_testi
    When Nilufer Birth Place alanina "<Birth Place>" girmeyerek bos birak
    And Nilufer Gender alanina tikla
    And Nilufer Birth Place alani altinda Required mesajini gor
    And Nilufer Birth Place alanina valid bir "<Birth Place>" gir
    And Nilufer Birth Place alani altinda hata mesaji goruntulenmemeli
    Then Nilufer Menu buttonuna tiklar
    Then Nilufer Logout yapar

    Examples: Admin_Vice_Dean_Bilgileri
      | Birth Place |
      |             |
      | Izmir       |