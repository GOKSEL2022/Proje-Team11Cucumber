@US04_AC03_TC03 @team11Regression @team11 @admin
Feature:Dean ekleyebilme

  Scenario Outline: TC01_Dean_olustur
    Given Ali "http://139.59.159.36:3000/" sayfasina gider
    And Ali bır sanıye bekler
    When Ali Login butonuna tiklar
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
    And Ali Dean Management alaninin goruldugunu dogrular
    And Ali bır sanıye bekler
    And Ali Dean Management`in altinda Add Dean alaninin goruldugunu dogrular
    And Ali bır sanıye bekler
    And Ali Name "<Name>" alanina veri girer
    And Ali bır sanıye bekler
    And Ali Surname "<Surname>" alanina veri girer
    And Ali bır sanıye bekler
    And Ali Bırth Place "<Birth Place>" alanina rakam girer
    And Ali bır sanıye bekler
    And Ali Gender alaninda gerekli checkbox`a tiklar
    And Ali bır sanıye bekler
    And Ali Date Of Bırth "<Date Of Birth>" alanina tarih girer
    And Ali bır sanıye bekler
    And Ali Phone alanina istenilen formatta veri girer
    And Ali bır sanıye bekler
    And Ali Ssn alanina istenilen formatta veri girer
    And Ali bır sanıye bekler
    And Ali User Name alanina veri girer
    And Ali bır sanıye bekler
    And Ali password alanina gecerli sifre girer
    And Ali bır sanıye bekler
    When Ali Submit butonuna tiklar
    And Ali bır sanıye bekler
    Then Ali Dean Save kayit mesaji Alinir
#
    Examples: dean_bilgileri
      | Username  | Password   | Name  | Surname  | Birth Place | Date Of Birth | Phone         | Ssn          | User Name | password |
      | Admin      | 485424698 | hasan | tarik    | 12345       | 29-03-2001    | 090-505-8195  | 505-41-6328  |Team11     | 57916929 |