@goksel @team11 @smoke
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
    And   Goksel Date Of Birt "<Date Of Birt>" girer
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
    Then  Goksel Register isleminin basarili oldugunu gösteren popupı goruntuler
    Examples:
      | Name      | Surname | Birth Place | Phone        | Date Of Birt | Ssn         | User Name       | Password |
      | Admin1111 | Celik11 | Ordu        | 452-481-2166 | 01.01.2000   | 905-58-1275 | Goksel Celik111 | 12345678 |
      | Admin2222 | 12345   | Ordu        | 452-481-2166 | 01.01.2001   | 949-78-0250 | Goksel Celik222 | 12345678 |
      | Admin3333 | Celik33 | Ordu        | 452481002166 | 01.01.2002   | 323-78-1003 | Goksel Celik333 | 12345678 |
      | Admin4444 | Celik44 | Ordu        | 452-481-2166 | 06.04.2023   | 419-78-1204 | Goksel Celik444 | 12345678 |
      | Admin5555 | Celik55 | Ordu        | 452-481-2166 | 01.01.2004   | 76567884459 | Goksel Celik555 | abcdefgh |





