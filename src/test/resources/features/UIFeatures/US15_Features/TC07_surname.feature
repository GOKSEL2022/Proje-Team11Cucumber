@admin @team11Regression
Feature: surname kismina gecerli bir surname yazilir
  Scenario: TC07_surname
    Given Fatih anasayfaya belirtilen URL'ye gider
    When Fatih anasayfanın acildigini goruntuler
    And Fatih Login butonuna tiklar
    And Fatih Login menusunun altinda doldurulacak alanlari goruntuler
    And Fatih User Name bilgisini girer
    And Fatih en az sekiz karakterli bir Password bilgisini girer
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
    And  Fatih required yazisinin kayboldugunu dogrular
    Then close the application
