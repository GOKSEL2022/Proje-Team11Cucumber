@US05_AC03_TC02 @team11
Feature:Dean ekleyebilme

  Scenario Outline: TC01_Dean_guncelleme
    Given Kullanici "https://www.managementonschools.com" gider
    And Kullanıcı bır sanıye bekler
    And Kullanici Login butonuna tiklar
    And Kullanıcı bır sanıye bekler
    And Kullanici Admin olarak Username "<Username>" girer
    And Kullanıcı bır sanıye bekler
    And Kullanici Admin olarak Password "<Password>" girer
    And Kullanıcı bır sanıye bekler
    And Kullanici Login sayfasinda Login butona tiklar.
    And Kullanıcı bır sanıye bekler
    And Kullanici Menu butonuna tiklar
    And Kullanıcı bır sanıye bekler
    And Kullanici Main Menu listinin acildigini gorur
    And Kullanıcı bır sanıye bekler
    And Kullanici Main Menu Listinden Dean Management text`ine tiklar
    And Kullanıcı bır sanıye bekler
    And Kullanici Dean List alanindaki Edit butonuna tiklar
    And Kullanici Edit Dean bolumunun acildigini gorur
    And Kullanici Name "<Name>" alanina sembol girer
    And Kullanıcı bır sanıye bekler
    And Kullanici password "<password>" alanina gecerli sifre girer
    And Kullanıcı bır sanıye bekler
    And Kullanici Edit Dean alanindaki Submit butonuna tiklar
    And Kullanıcı bır sanıye bekler
    Then Kullanici Edit Dean alaninda name textboxinin altinda Required uyari mesajini gorur kaydi gorulur

    Examples: dean_bilgileri
      | Username   | Password    | Name  | Surname  | Birth Place | Date Of Birth | Phone         | Ssn          | User Name | password |
      | karakartal | 987654321   | *-*-* | tarik    | *-+/%       | 29-03-2001    | 090-505-8194  | 505-41-6328  |Team11     | 57916979 |