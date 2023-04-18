@US06_TC06 @team11 @smoke
Feature: Dean Vice Dean hesabi olusturabilmelidir

  Background:Managementon_Schools_sayfasina_git
    Given Nilufer "https://www.managementonschools.com/" url'ine gider
    Given Nilufer Home sayfasindaki Login buttonuna tiklar
    Given Nilufer Dean olarak User Name'i girer
    Given Nilufer Dean olarak Password'u girer
    Given Nilufer Login buttonuna tiklar
    Given Nilufer "Vice Dean Management" sayfasinda oldugunu dogrular

  Scenario Outline:US06_TC06_Date_Of_Birth_alaninin_testi
    When Nilufer Kullanici Date Of Birth alanina "<Date Of Birth>" girmeyerek bos birakir
    And Nilufer Kullanici Phone alanina tiklar
    And Nilufer Kullanici Date Of Birth alani altinda Required mesajini gorur
    And Nilufer Kullanici Date Of Birth alanina valid bir "<Date Of Birth>" girer
    And Nilufer Kullanici Date Of Birth alani altinda hata mesaji goruntulenmemelidir
    Then Nilufer Menu buttonuna tiklar
    Then Nilufer Logout yapar

    Examples: Dean_Vice_Dean_Bilgileri
      | Date Of Birth |
      |               |
      | 06.08.1965    |

