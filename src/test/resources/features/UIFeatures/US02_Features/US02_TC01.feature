@team111
Feature:US02_TC01
  Scenario:US02_TC01

 Given Goksel "https://www.managementonschools.com/" gider
 When Goksel anasayfanın acildigini goruntuler
 And Goksel Login butonunun sayfada yer aldigini goruntuler
 And Goksel Login butonuna tiklar
 And Goksel Login menusunde doldurulacak alanlar  icin required yazisini goruntuler
 And Goksel User Name e "karakartal" girer
 And Goksel Password "987654321" girer
 When Goksel Login butonuna tiklar
 Then Goksel login isleminin basarili oldugunu dogrular

