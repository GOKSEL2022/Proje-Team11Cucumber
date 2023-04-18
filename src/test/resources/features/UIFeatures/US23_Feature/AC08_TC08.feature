@US23_TC07 @team11
Feature: Admin Vice Dean hesabi olusturabilmelidir

  Background:Managementon_Schools_sayfasina_git
    Given "https://www.managementonschools.com/" url'ine git
    Given Home sayfasindaki Login buttonuna tikla
    Given Admin olarak User Name'i gir
    Given Admin olarak Password'u gir
    Given Login buttonuna tikla
    Given Vice Dean Management sayfasinda oldugunu dogrula

  Scenario Outline:US23_TC08_Ssn_alaninin_testi_alaninin_testi
    When Ssn alanina "<Ssn>" girmeyerek bos birak
    And User Name alanina tikla
    And Ssn alani altinda Required mesajini gor
    And Ssn alanina valid bir "<Ssn>" gir
    And Ssn alani altinda hata mesaji goruntulenmemeli

    Examples: Admin_Vice_Dean_Bilgileri
      | Ssn         |
      |             |
      | 103-13-1031 |