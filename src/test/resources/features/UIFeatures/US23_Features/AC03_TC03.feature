@US23_TC03 @team11
Feature: Admin Vice Dean hesabi olusturabilmelidir

  Background:Managementon_Schools_sayfasina_git
    Given "https://www.managementonschools.com/" url'ine git
    Given Home sayfasindaki Login buttonuna tikla
    Given Admin olarak User Name'i gir
    Given Admin olarak Password'u gir
    Given Login buttonuna tikla
    Given Vice Dean Management sayfasinda oldugunu dogrula

  Scenario Outline:US23_TC03_Surname_alaninin_testi
    When Surname alanina "<Surname>" girmeyerek bos birak
    And Birth Place alanina tikla
    And Surname alani altinda Required mesajini gor
    And Surname alanina valid bir "<Surname>" gir
    And Surname alani altinda hata mesaji goruntulenmemeli

    Examples: Admin_Vice_Dean_Bilgileri
      | Surname |
      |         |
      | Ozkul   |