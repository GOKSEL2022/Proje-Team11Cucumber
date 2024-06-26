@US05_AC03_TC03 @team11 @team11Regression @admin
Feature:Dean ekleyebilme

  Scenario Outline: TC01_Dean_guncelleme
    Given Ali "http://139.59.159.36:3000/" sayfasina gider
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
    And Ali Name "<Name>" alanina rakam girer.
    And Ali bır sanıye bekler
    And Ali password "<password>" alanina gecerli sifre girer.
    And Ali bır sanıye bekler
    Then Ali dean Saved uyari mesajini gorur,
    Then close the application




    Examples: dean_bilgileri
      | Username   | Password   | Name  |  password |
      | Admin      | 485424698  | 1234  |  57916929 |
