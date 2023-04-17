@US23_TC02 @team11
Feature: Admin Vice Dean hesabi olusturabilmelidir

  Background:Managementon_Schools_sayfasina_git
    Given Kullanici "https://www.managementonschools.com/" url'ine gider
    Given Kullanici Home sayfasindaki Login buttonuna tiklar
    Given Kullanici Admin olarak User Name'i girer
    Given Kullanici Admin olarak Password'u girer
    Given Kullanici Login buttonuna tiklar
    Given Kullanici "Vice Dean Management" sayfasinda oldugunu dogrular

  Scenario Outline:US23_TC02_Name_alaninin_testi
    When Kullanici Name alanina "<Name>" girmeyerek bos birakir
    And Kullanici Surname alanina tiklar
    And Kullanici Name alani altinda Required mesajini gorur
    And Kullanici Name alanina valid bir "<Name>" girer
    And Kullanici Name alani altinda hata mesaji goruntulenmemelidir

    Examples: Admin_Vice_Dean_Bilgileri
      | Name    |
      |         |
      | Nilufer |