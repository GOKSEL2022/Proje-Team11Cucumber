@admin @team11Regression
Feature:student management gidilir

    Scenario: TC02_menu
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
        Then close the application