@Student
Feature:student management gidilir

    Scenario: TC02_menu
    Given Kullanici anasayfaya belirtilen URL'ye gider
    When Kullanici anasayfanın acildigini goruntuler
    And Kullanici Login butonuna tiklar
    And Kullanici Login menusunun altinda doldurulacak alanlari goruntuler
    And Kullanici User Name bilgisini girer
    And Kullanici en az sekiz karakterli bir Password bilgisini girer
    And Kullanici Login butonuna tiklar
    And Kullanici login isleminin basarili oldugunu dogrular
    And Kullanici sag kosede Menu butonuna tiklar
    And Kullanici Menu butonunun altinda acilan alt munude student management butonunu tiklar
    And Kullanici student management sayfasinin acildigini dogrular