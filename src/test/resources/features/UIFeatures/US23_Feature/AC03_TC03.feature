@US23_TC03 @team11
Feature: Admin Vice Dean hesabi olusturabilmelidir

  Background:Managementon_Schools_sayfasina_git
    Given Kullanici "https://www.managementonschools.com/" url'ine gider
    Given Kullanici Home sayfasindaki Login buttonuna tiklar
    Given Kullanici Admin olarak User Name'i girer
    Given Kullanici Admin olarak Password'u girer
    Given Kullanici Login buttonuna tiklar
    Given Kullanici "Vice Dean Management" sayfasinda oldugunu dogrular

  Scenario Outline:US23_TC03_Surname_alaninin_testi
    When Kullanici Surname alanina "<Surname>" girmeyerek bos birakir
    And Kullanici Birth Place alanina tiklar
    And Kullanici Surname alani altinda Required mesajini gorur
    And Kullanici Surname alanina valid bir "<Surname>" girer
    And Kullanici Surname alani altinda hata mesaji goruntulenmemelidir

    Examples: Admin_Vice_Dean_Bilgileri
      | Surname |
      |         |
      | Ozkul   |