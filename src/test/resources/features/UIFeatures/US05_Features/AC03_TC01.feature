@US05_AC03_TC01 @team11
Feature:Dean guncelleme

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
    And Ali Name alanini siler.
    And Ali bır sanıye bekler
    And Ali Edit Dean alaninda name textboxinin altinda Required uyari mesajini gorur kaydi gorulur
    And Genderalanindan female checkboxina tiklar.
    And Ali password "<password>" alanina gecerli sifre girer
    And Ali bır sanıye bekler
    Then Ali Edit Dean alanindaki Submit butonuna tiklar
    And Ali bır sanıye bekler

#
    Examples: dean_bilgileri
      | Username  | Password   | Name  | Surname  | Birth Place | Date Of Birth | Phone         | Ssn          | User Name | password |
      | Admin      | 485424698  |       | tarik    | Van         | 29-03-2001    | 090-505-7311  | 505-41-6338  |Team11     | 57916929 |