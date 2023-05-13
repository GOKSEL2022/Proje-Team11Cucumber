@Nilufer @team11Regression @sunum

Feature: US06

  Scenario Outline: US06

    Given Nilufer "http://139.59.159.36:3000/" url'ine gider
    When Nilufer Home sayfasindaki Login buttonuna tiklar
    And Nilufer Dean olarak User Name'i girer
    And Nilufer Dean olarak Password'u girer
    And Nilufer Login buttonuna tiklar
    And Nilufer Vice Dean Management sayfasinda oldugunu dogrular
    And Nilufer Date Of Birth alanina Date Of Birth girmeyerek bos birakir
    And Nilufer Phone alanina tiklar
    And Nilufer Date Of Birth alani altinda Required mesajini gorur
    And Nilufer Date Of Birth alanina valid bir "<Date Of Birth>" girer
    And Nilufer Date Of Birth alani altinda hata mesaji goruntulenmemelidir
    Then close the application

    Examples: Dean_Vice_Dean_Bilgileri
      | Date Of Birth |
      | 06.08.1965    |

