@US23_TC07 @team11
Feature: Admin Vice Dean hesabi olusturabilmelidir

  Background:Managementon_Schools_sayfasina_git
    Given "https://www.managementonschools.com/" url'ine git
    Given Home sayfasindaki Login buttonuna tikla
    Given Admin olarak User Name'i gir
    Given Admin olarak Password'u gir
    Given Login buttonuna tikla
    Given Vice Dean Management sayfasinda oldugunu dogrula

  Scenario Outline:US23_TC07_Phone_alaninin_testi_alaninin_testi
    When Phone alanina "<Phone>" girmeyerek bos birak
    And Ssn alanina tikla
    And Phone alani altinda Required mesajini gor
    And Phone alanina valid bir "<Phone>" gir
    And Phone alani altinda hata mesaji goruntulenmemeli

    Examples: Admin_Vice_Dean_Bilgileri
      | Phone        |
      |              |
      | 552-919-2222 |