@US05_AC03_TC03 @team11
Feature:Dean ekleyebilme

  Scenario Outline: TC01_Dean_guncelleme
    Given Alı "https://www.managementonschools.com" gider
    And Alı bır sanıye bekler
    And Alı Login butonuna tiklar
    And Alı bır sanıye bekler
    And Alı Admin olarak Username "<Username>" girer
    And Alı bır sanıye bekler
    And Alı Admin olarak Password "<Password>" girer
    And Alı bır sanıye bekler
    And Alı Login sayfasinda Login butona tiklar.
    And Alı bır sanıye bekler
    And Alı Menu butonuna tiklar
    And Alı bır sanıye bekler
    And Alı Main Menu listinin acildigini gorur
    And Alı bır sanıye bekler
    And Alı Main Menu Listinden Dean Management text`ine tiklar
    And Alı bır sanıye bekler
    And Alı Dean List alanindaki Edit butonuna tiklar
    And Alı Edit Dean bolumunun acildigini gorur
    And Alı Name "<Name>" alanina rakam girer.
    And Alı bır sanıye bekler
    And Alı password "<password>" alanina gecerli sifre girer.
    And Alı bır sanıye bekler
    And Alı Edit Dean alanindaki Submit butonuna tiklar
    And Alı bır sanıye bekler
    Then Alı Edit Dean alaninda name textboxinin altinda Required uyari mesajini gorur kaydi gorulur

    Examples: dean_bilgileri
      | Username   | Password   | Name  |  password |
      | karakartal | 987654321  | 1234  |  57916929 |
