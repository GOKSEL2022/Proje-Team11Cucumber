@admin @team11Regression @team11Smoke
Feature:submit yapilir
  Scenario: TC21_submit
    Given Fatih anasayfaya belirtilen URL'ye gider
    When Fatih anasayfanın acildigini goruntuler
    And Fatih Login butonuna tiklar
    And Fatih Login menusunun altinda doldurulacak alanlari goruntuler
    And Fatih admin User Name bilgisini girer
    And Fatih  admin en az sekiz karakterli bir Password bilgisini girer
    And Fatih Login butonuna tiklar
    And Fatih login isleminin basarili oldugunu dogrular
    And Fatih sag kosede Menu butonuna tiklar
    And Fatih Menu butonunun altinda acilan alt munude student management butonunu tiklar
    And Fatih student management sayfasinin acildigini dogrular
    And Fatih acilan sayfada choose teacher butonunu tiklar
    And Fatihn acilan drapdowndan ogrencinin danisman ogretmenini secer
    And Fatih danisman ogretmenin secildigini dogrular
    And Fatih name alanina gecerli bir isim girer
    And Fatih surname alanina gecerli bir isim girer
    And Fatih birt place alanina gecerli bir sehir ismi girer
    And Fatih email alanina gecerli bir adres girer
    And Fatih phone alanina gecerli bir phone numarasi girer
    And Fatih male butonuna tiklar
    And Fatih date of birth alanina gecerli bir tarih girer
    And Fatih ssn alanina gecerli formatta bir numara girer
    And Fatih ogrenci username girer
    And Fatih fathername alanina bir isim girer
    And Fatih mothername alanina bir isim girer
    And Fatih student icin password olusturur
    And Fatih submit butonuna tiklar
    Then close the application