@US06_TC09 @team11
Feature: Dean Vice Dean hesabi olusturabilmelidir

  Background:Managementon_Schools_sayfasina_git
    Given Kullanici "https://www.managementonschools.com/" url'ine gider
    Given Kullanici Home sayfasindaki Login buttonuna tiklar
    Given Kullanici Dean olarak User Name'i girer
    Given Kullanici Dean olarak Password'u girer
    Given Kullanici Login buttonuna tiklar
    Given Kullanici "Vice Dean Management" sayfasinda oldugunu dogrular

  Scenario Outline:US06_TC09_User_Name_alaninin_testi_alaninin_testi
    When Kullanici User Name alanina "<User Name>" girmeyerek bos birakir
    And Kullanici Password alanina tiklar
    And Kullanici User Name alani altinda Required mesajini gorur
    And Kullanici User Name alanina valid bir "<User Name>" girer
    And Kullanici User Name alani altinda hata mesaji goruntulenmemelidir

    Examples: Dean_Vice_Dean_Bilgileri
      | User Name |
      |           |
      | niloz     |