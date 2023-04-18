@US23_TC06 @team11
Feature: Admin Vice Dean hesabi olusturabilmelidir
  Background:Managementon_Schools_sayfasina_git
    Given "https://www.managementonschools.com/" url'ine git
    Given Home sayfasindaki Login buttonuna tikla
    Given Admin olarak User Name'i gir
    Given Admin olarak Password'u gir
    Given Login buttonuna tikla
    Given Vice Dean Management sayfasinda oldugunu dogrula

  Scenario Outline:US23_TC06_Date_Of_Birth_alaninin_testi
    When Date Of Birth alanina "<Date Of Birth>" girmeyerek bos birak
    And Phone alanina tikla
    And Date Of Birth alani altinda Required mesajini gor
    And Date Of Birth alanina valid bir "<Date Of Birth>" gir
    And Date Of Birth alani altinda hata mesaji goruntulenmemeli

    Examples: Admin_Vice_Dean_Bilgileri
      | Date Of Birth |
      |               |
      | 06.08.1965    |