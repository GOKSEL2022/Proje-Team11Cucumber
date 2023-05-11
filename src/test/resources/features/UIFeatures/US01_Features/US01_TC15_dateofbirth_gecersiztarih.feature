@admin @team11 @team11Regression
Feature:US01
  Scenario Outline:US01

    Given Goksel "https://www.managementonschools.com/" gider
    Then  Goksel anasayfanın acildigini goruntuler
    And   Goksel bir sn bekler
    And   Goksel Register butonunun sayfada yer aldigini goruntuler
    And   Goksel bir sn bekler
    And   Goksel Register butonuna tiklar
    And   Goksel bir sn bekler
    And   Goksel Register menusunun altinda doldurulacak alanlari goruntuler
    And   Goksel bir sn bekler
    And   Goksel zorunlu alanlarin altinda Required yazisini  goruntuler
    And   Goksel Name "<Name>" girer
    And   Goksel bir sn bekler
    And   Goksel Name textboxinin altindaki Required yazisinin kalktigini  goruntuler
    And   Goksel Surname "<Surname>"  girer
    And   Goksel bir sn bekler
    And   Goksel Surname textboxinin altindaki required yazisinin kalktigini  goruntuler
    And   Goksel Birth Place "<Birth Place>" girer
    And   Goksel bir sn bekler
    And   Goksel Birth Place textboxinin altindaki required yazisinin kalktigini  goruntuler
    And   Goksel Phone "<Phone>" girer
    And   Goksel bir sn bekler
    And   Goksel Phone textboxinin altindaki required yazisinin kalktigini  goruntuler
    And   Goksel Gender alanindan Male chexboxini tiklar
    And   Goksel bir sn bekler
    And   Goksel Date Of Birt "<Date Of Birt>" girer.
    And   Goksel bir sn bekler
    And   Goksel Date Of Birt textboxinin altindaki required yazisinin kalktigini  goruntuler
    And   Goksel Ssn "<Ssn>" girer
    And   Goksel bir sn bekler
    And   Goksel Ssn textboxinin altindaki required yazisinin kalktigini  goruntuler
    And   Goksel User Name "<User Name>" girer
    And   Goksel bir sn bekler
    And   Goksel User Name textboxinin altindaki required yazisinin kalktigini  goruntuler
    And   Goksel Password "<Password>" girer ve Register_Register butonunu tiklar
    And   Goksel bir sn bekler
    Then  Goksel Register olmaz
    Then close the application
    Examples:
      | Name    | Surname | Birth Place | Phone        | Date Of Birt | Ssn         | User Name    | Password |
      | Admin   | Celik   | Ordu        | 452-481-2166 | 01.01.1900   | 563-78-1118 | Goksel Celik | 12345678 |






