@team11
Feature:US02_TC01
  Scenario:US02_TC01

 Given Kullanici "https://www.managementonschools.com/" gider
 When Kullanici anasayfanın acildigini goruntuler
 And Kullanici Login butonunun sayfada yer aldigini goruntuler
 And Kullanici Login butonuna tiklar
 And Kullanici Login menusunde doldurulacak alanlar  icin required yazisini goruntuler
 And Kullanici User Name e "karakartal" girer
 And Kullanici Password "987654321" girer
 When Kullanici Login butonuna tiklar
 Then Kullanici login isleminin basarili oldugunu dogrular

