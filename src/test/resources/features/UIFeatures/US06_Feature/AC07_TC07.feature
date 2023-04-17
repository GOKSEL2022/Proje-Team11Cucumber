@US06_TC07 @team11
Feature: Dean Vice Dean hesabi olusturabilmelidir

  Background:Managementon_Schools_sayfasina_git
    Given Kullanici "https://www.managementonschools.com/" url'ine gider
    Given Kullanici Home sayfasindaki Login buttonuna tiklar
    Given Kullanici Dean olarak User Name'i girer
    Given Kullanici Dean olarak Password'u girer
    Given Kullanici Login buttonuna tiklar
    Given Kullanici "Vice Dean Management" sayfasinda oldugunu dogrular

  Scenario Outline:US06_TC07_Phone_alaninin_testi_alaninin_testi
    When Kullanici Phone alanina "<Phone>" girmeyerek bos birakir
    And Kullanici Ssn alanina tiklar
    And Kullanici Phone alani altinda Required mesajini gorur
    And Kullanici Phone alanina valid bir "<Phone>" girer
    And Kullanici Phone alani altinda hata mesaji goruntulenmemelidir

    Examples: Dean_Vice_Dean_Bilgileri
      | Phone        |
      |              |
      | 552-919-2222 |