@US23_TC02 @team11
Feature: Admin Vice Dean hesabi olusturabilmelidir

  Background:Managementon_Schools_sayfasina_git
    Given "https://www.managementonschools.com/" url'ine git
    Given Home sayfasindaki Login buttonuna tikla
    Given Admin olarak User Name'i gir
    Given Admin olarak Password'u gir
    Given Login buttonuna tikla
    Given Vice Dean Management sayfasinda oldugunu dogrula

  Scenario Outline:US23_TC02_Name_alaninin_testi
    When Name alanina "<Name>" girmeyerek bos birak
    And Surname alanina tikla
    And Name alani altinda Required mesajini gor
    And Name alanina valid bir "<Name>" gir
    And Name alani altinda hata mesaji goruntulenmemeli

    Examples: Admin_Vice_Dean_Bilgileri
      | Name    |
      |         |
      | Nilufer |