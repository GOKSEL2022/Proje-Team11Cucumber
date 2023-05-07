@US19 @team11

Feature:"Choose_Students"_öğrenci_seçilebilmeli

  Background:
    Given Emin anasayfaya "http://139.59.159.36:3000/" gider
    When Emin login butonuna tiklar
    And Emin User Name alanina teacher bilgileri "team11emin" ile girer
    And Emin Password alanina sifresini "12345678" girer
    And Emin login_login butonuna tiklar
    And Emin menuu butonuna tiklar
    And Emin Meet Management butonuna tiklar


  @US19_AC01_TC01

  Scenario:"Choose Students" öğrenci seçilebilmeli
    And Emin choose student alanindan ogrenci secer
    Then Emin secilen ogrenciyi dogrular


  @US19_AC01_TC02

    Scenario:Geçmiştarih_girilmemmeli.
      And Emin choose student alanindan ogrenci secer
      And Emin Date Of Meet alanina gecmis bir tarih "12.04.2023" girer
      And Emin Start Time alanina valid bir deger "10.00" girer
      And Emin Stop Time alanina valid bir deger "13:00"girer
      And Emin Description alanina valid bir deger "veli" girer
      And Emin submit butonuna tiklar
      Then Emin hata mesaji gorur ve toplanti olusturamaz

  @US19_AC01_TC03

    Scenario:Start Time ve Stop Time" başlangıç ve bitiş saatleri girilmeli
      And Emin choose student alanindan ogrenci secer
      And Emin Date Of Meet alanina  bir tarih "15.05.2023" girer
      And Emin Start Time alanina validd bir deger "09:00" girer
      And Emin Stop Time alanina valid bir deger "11:00" girer
      Then Emin Star time Stop time alanlarini dogrular

  @US19_AC01_TC04

    Scenario:Description girilebilmeli
        And Emin choose student alanindan ogrenci secer
        And Emin Date Of Meet alanina  bir tarih "15.05.2023" girer
        And Emin Start Time alanina validd bir deger "09:00" girer
        And Emin Stop Time alanina valid bir deger "11:00" girer
        And Emin Description alanina validd bir deger "meet" girer
        Then Emin Description alanini dogrular

  @US20_AC01_TC01
  Scenario:ToplantılarınDateStartTimeStopTimeveDescriptiongörülmeli
    And Emin edit butonununa tiklar
    Then Emin olusturmus oldugu Date, Start Time ve Descriptionu dogrular

  @US20_AC01_TC02

  Scenario:
    And Emin olusturmus oldugu meet listesindeki edit butonunu tiklar
    And Emin acilan sayfada  yeni duzenlemeler "05.06.2023" yapar
    And Emin submitt butonuna tiklar
    Then Emin meet update successfull yazisini gormelidir

    @US20_AC01_TC03

    Scenario:ToplantilariSilebilmeli

      And Emin olusturmus oldugu meet listesindeki silme butonunu tiklar
      Then Emin meet update successfulll yazisini gormelidir
















