@US23_TC07 @team11
Feature: Admin Vice Dean hesabi olusturabilmelidir

  Background:Managementon_Schools_sayfasina_git
    Given Kullanici "https://www.managementonschools.com/" url'ine gider
    Given Kullanici Home sayfasindaki Login buttonuna tiklar
    Given Kullanici Admin olarak User Name'i girer
    Given Kullanici Admin olarak Password'u girer
    Given Kullanici Login buttonuna tiklar
    Given Kullanici "Vice Dean Management" sayfasinda oldugunu dogrular

  Scenario Outline:US23_TC08_Ssn_alaninin_testi_alaninin_testi
    When Kullanici Ssn alanina "<Ssn>" girmeyerek bos birakir
    And Kullanici User Name alanina tiklar
    And Kullanici Ssn alani altinda Required mesajini gorur
    And Kullanici Ssn alanina valid bir "<Ssn>" girer
    And Kullanici Ssn alani altinda hata mesaji goruntulenmemelidir

    Examples: Admin_Vice_Dean_Bilgileri
      | Ssn         |
      |             |
      | 103-13-1031 |