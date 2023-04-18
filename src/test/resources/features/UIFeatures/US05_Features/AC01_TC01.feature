@US05_AC01_TC01 @team11
Feature:Deanlari gorebilme ve silebilme

  Scenario Outline: TC01_Dean_List_Bilgilerini_Gorur
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
    Then Kullanici Dean List alaninin goruldugunu dogrular


#
    Examples: dean_bilgileri
      | Username   | Password    | Name  | Surname  | Birth Place | Date Of Birth | Phone         | Ssn          | User Name | password |
      | karakartal | 987654321   | hasan | tarik    | Van         | 29-03-2001    | 090-505-7310  | 505-51-6328  |Team11     | 57916929 |