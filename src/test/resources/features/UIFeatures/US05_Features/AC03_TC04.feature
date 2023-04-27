@US05_AC03_TC04 @team11
Feature:Dean ekleyebilme

  Scenario Outline: TC01_Dean_guncelleme
    Given Ali "https://www.managementonschools.com" sayfasina gider
    And Ali bır sanıye bekler
    And Ali Login butonuna tiklar
    And Ali bır sanıye bekler
    And Ali Admin olarak Username "<Username>" girer
    And Ali bır sanıye bekler
    And Ali Admin olarak Password "<Password>" girer
    And Ali bır sanıye bekler
    And Ali Login sayfasinda Login butona tiklar.
    And Ali bır sanıye bekler
    And Ali Menu butonuna tiklar
    And Ali bır sanıye bekler
    And Ali Main Menu listinin acildigini gorur
    And Ali bır sanıye bekler
    And Ali Main Menu Listinden Dean Management text`ine tiklar
    And Ali bır sanıye bekler
    And Ali Dean List alanindaki Edit butonuna tiklar
    And Ali Edit Dean bolumunun acildigini gorur
    And Ali Name alanina space girer.
    And Ali bır sanıye bekler
    And Ali password "<password>" alanina gecerli sifre girer.
    And Ali bır sanıye bekler
    And Ali Edit Dean alanindaki Submit butonuna tiklar
    Then Ali dean Saved uyari mesajini gorur.




    Examples: dean_bilgileri
      | Username   | Password   |   password |
      | karakartal | 987654321  |   57916929 |

