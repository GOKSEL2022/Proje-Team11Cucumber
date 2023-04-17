@US19 @team11

Feature:"Choose_Students"_öğrenci_seçilebilmeli

  Background:
    Given kullanici anasayfaya "https://www.managementonschools.com/" gider
    When kullanici login butonuna tiklar
    And kullanici User Name alanina teacher bilgileri "emin" ile girer
    And kullanici Password alanina sifresini "12345678" girer
    And kullanici login_login butonuna tiklar
    And kullanici menuu butonuna tiklar
    And kullanici Meet Management butonuna tiklar


  @US19_AC01_TC01

  Scenario:"Choose Students" öğrenci seçilebilmeli
    And kullanici choose student alanindan ogrenci secer
    Then kullanici secilen ogrenciyi dogrular


  @US19_AC01_TC02

    Scenario:Geçmiştarih_girilmemmeli.
      And kullanici choose student alanindan ogrenci secer
      And kullanici Date Of Meet alanina gecmis bir tarih "12.04.2023" girer
      And kullanici Start Time alanina valid bir deger "10.00" girer
      And kullanici Stop Time alanina valid bir deger "13:00"girer
      And kullanici Description alanina valid bir deger "veli" girer
      And kullanici submit butonuna tiklar
      Then kullanici hata mesaji gorur ve toplanti olusturamaz

  @US19_AC01_TC03

    Scenario:Start Time ve Stop Time" başlangıç ve bitiş saatleri girilmeli
      And kullanici choose student alanindan ogrenci secer
      And kullanici Date Of Meet alanina  bir tarih "15.05.2023" girer
      And kullanici Start Time alanina validd bir deger "09:00" girer
      And kullanici Stop Time alanina valid bir deger "11:00" girer
      Then kullanici Star time Stop time alanlarini dogrular

  @US19_AC01_TC04

    Scenario:Description girilebilmeli
        And kullanici choose student alanindan ogrenci secer
        And kullanici Date Of Meet alanina  bir tarih "15.05.2023" girer
        And kullanici Start Time alanina validd bir deger "09:00" girer
        And kullanici Stop Time alanina valid bir deger "11:00" girer
        And kullanici Description alanina validd bir deger "meet" girer
        Then kullanici Description alanini dogrular

  @US20_AC01_TC01
  Scenario:ToplantılarınDateStartTimeStopTimeveDescriptiongörülmeli
    And kullanici edit butonununa tiklar
    Then kullanici olusturmus oldugu Date, Start Time ve Descriptionu dogrular

  @US20_AC01_TC02

  Scenario:
    And kullanici olusturmus oldugu meet listesindeki edit butonunu tiklar
    And kullanici acilan sayfada  yeni duzenlemeler "05.06.2023" yapar
    And kullanici submitt butonuna tiklar
    Then kullanici meet update successfull yazisini gormelidir

    @US20_AC01_TC03

    Scenario:ToplantilariSilebilmeli

      And kullanici olusturmus oldugu meet listesindeki silme butonunu tiklar
      Then kullanici meet update successfulll yazisini gormelidir
















