@US05_AC02_TC01 @team11
Feature:Dean ekleyebilme

  Scenario Outline: TC01_Dean_olustur
    Given Kullanici "https://www.managementonschools.com" gider
    And Kullanıcı bır sanıye bekler
    When Kullanici Login butonuna tiklar
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
    And Kullanici Dean List alaninin goruldugunu dogrular
    Then Kullanıcı Delete butonunun olmadıgını dogrular

#
    Examples: dean_bilgileri
      | Username   | Password     | Name  | Surname  | Birth Place | Date Of Birth | Phone         | Ssn          | User Name | password |
      | karakartal | 987654321   | hasan |          | Van         | 29-03-2001    | 090-505-8189  | 505-91-6328  |Team11     | 57916929 |