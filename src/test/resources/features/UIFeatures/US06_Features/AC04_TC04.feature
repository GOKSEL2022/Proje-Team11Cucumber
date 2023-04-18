@US06_TC04 @team11
Feature: Dean Vice Dean hesabi olusturabilmelidir

  Background:Managementon_Schools_sayfasina_git
    Given Kullanici "https://www.managementonschools.com/" url'ine gider
    Given Kullanici Home sayfasindaki Login buttonuna tiklar
    Given Kullanici Dean olarak User Name'i girer
    Given Kullanici Dean olarak Password'u girer
    Given Kullanici Login buttonuna tiklar
    Given Kullanici "Vice Dean Management" sayfasinda oldugunu dogrular

  Scenario Outline:US06_TC04_Birth_Place_alaninin_testi
    When Kullanici Birth Place alanina "<Birth Place>" girmeyerek bos birakir
    And Kullanici Gender alanina tiklar
    And Kullanici Birth Place alani altinda Required mesajini gorur
    And Kullanici Birth Place alanina valid bir "<Birth Place>" girer
    And Kullanici Birth Place alani altinda hata mesaji goruntulenmemelidir

    Examples: Dean_Vice_Dean_Bilgileri
      | Birth Place |
      |             |
      | Izmir       |