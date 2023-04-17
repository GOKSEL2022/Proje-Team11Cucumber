@US21  @team11

Feature:OgrenciChooseLessonlistesindeTeacherDayStartTimeVeStopTimebilgilerinigorebilmeli

  Background:
    Given kullanici anasayfaya "https://www.managementonschools.com/" gider
    When kullanici loginn butonuna tiklar
    And kullanici User Namee alanina teacher bilgileri "m.emin" ile girer
    And kullanici Passwordd alanina sifresini "12345678" girer
    And kullanici loginn_login butonuna tiklar

    @US21_AC01_TC01

    Scenario:OgrenciChooseLessonlistesindeTeacherDayStartTimeVeStopTimebilgilerinigorebilmeli
      Then kullanici Choose Lesson sayfasindan Lesson,Teacheri dogrular

      @US21_AC01_TC02

      Scenario:İstedigi_ders_veya_dersleri_secebilmeli
        And kullanici Choose Lesson yazisinin altindaki ders kutucuklarini tiklar
        Then kullanici tiklandigini dogrular

      @US21_AC01_TC03

      Scenario:Aynı gun ve saate denk gelen dersleri secememeli

        And kullanici choose Lesson listesindeki ayni gun ve saatlerin kutucuklarini tiklar
        And kullanici submittt butonuna tiklar
        Then kullanici giris yapamadigini dogrular

      @US21_AC01_TC04

      Scenario:Sectigi dersleri Lesson Program List’te gorebilmeli
        And kullanici Choose Lesson yazisinin altindaki  ders kutucuklarini tiklar
        And kullanici submitte butonuna tiklar
        Then kullanici Program listi dogrular

      @US21_AC01_TC05

      Scenario:Ogrenci sınav notlarını gorebilmeli

        And kullanici mennu butonuna tiklar
        And kullanici Grades and Announcements yazisina tiklar
        Then kullanici ders notlarini dogrular

      @US21_AC01_TC06

      Scenario:Ogrenci, danismanin kendisi için oluşturdugu toplantilari gorebilmeli

        And kullanici menuuu butonuna tiklar
        And kullanici Gradess and Announcements yazisina tiklar
        Then kullanici danismanin olusturdugu dersi dogrular