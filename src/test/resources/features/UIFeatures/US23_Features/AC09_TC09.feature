@US23_TC09 @team11
Feature: Admin Vice Dean hesabi olusturabilmelidir

  Background:Managementon_Schools_sayfasina_git
    Given "https://www.managementonschools.com/" url'ine git
    Given Home sayfasindaki Login buttonuna tikla
    Given Admin olarak User Name'i gir
    Given Admin olarak Password'u gir
    Given Login buttonuna tikla
    Given Vice Dean Management sayfasinda oldugunu dogrula

  Scenario Outline:US06_TC09_User_Name_alaninin_testi_alaninin_testi
    When User Name alanina "<User Name>" girmeyerek bos birak
    And Password alanina tikla
    And User Name alani altinda Required mesajini gor
    And User Name alanina valid bir "<User Name>" gir
    And User Name alani altinda hata mesaji goruntulenmemeli

    Examples: Admin_Vice_Dean_Bilgileri
      | User Name |
      |           |
      | niloz     |