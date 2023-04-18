@US23_TC04 @team11
Feature: Admin Vice Dean hesabi olusturabilmelidir

  Background:Managementon_Schools_sayfasina_git
    Given "https://www.managementonschools.com/" url'ine git
    Given Home sayfasindaki Login buttonuna tikla
    Given Admin olarak User Name'i gir
    Given Admin olarak Password'u gir
    Given Login buttonuna tikla
    Given Vice Dean Management sayfasinda oldugunu dogrula

  Scenario Outline:US23_TC04_Birth_Place_alaninin_testi
    When Birth Place alanina "<Birth Place>" girmeyerek bos birak
    And Gender alanina tikla
    And Birth Place alani altinda Required mesajini gor
    And Birth Place alanina valid bir "<Birth Place>" gir
    And Birth Place alani altinda hata mesaji goruntulenmemeli

    Examples: Admin_Vice_Dean_Bilgileri
      | Birth Place |
      |             |
      | Izmir       |