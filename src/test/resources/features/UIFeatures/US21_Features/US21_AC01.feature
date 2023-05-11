@US21  @team11 @team11Regression @team11Smoke

Feature:OgrenciChooseLessonlistesindeTeacherDayStartTimeVeStopTimebilgilerinigorebilmeli

  Background:
    Given Emin anasayfaya "http://139.59.159.36:3000/" gider
    When Emin loginn butonuna tiklar
    And Emin User Namee alanina teacher bilgileri "team11" ile girer
    And Emin Passwordd alanina sifresini "12345678" girer
    And Emin loginn_login butonuna tiklar

    @US21_AC01_TC01

    Scenario:OgrenciChooseLessonlistesindeTeacherDayStartTimeVeStopTimebilgilerinigorebilmeli
      Then Emin Choose Lesson sayfasindan Lesson,Teacheri dogrular
      Then close the application

      @US21_AC01_TC02

      Scenario:İstedigi_ders_veya_dersleri_secebilmeli
        And Emin Choose Lesson yazisinin altindaki ders kutucuklarini tiklar
        Then Emin tiklandigini dogrular
        Then close the application

      @US21_AC01_TC03

      Scenario:Aynı gun ve saate denk gelen dersleri secememeli

        And Emin choose Lesson listesindeki ayni gun ve saatlerin kutucuklarini tiklar
        And Emin submittt butonuna tiklar
        Then Emin giris yapamadigini dogrular
        Then close the application

      @US21_AC01_TC04

      Scenario:Sectigi dersleri Lesson Program List’te gorebilmeli
        And Emin Choose Lesson yazisinin altindaki  ders kutucuklarini tiklar
        And Emin submitte butonuna tiklar
        Then Emin Program listi dogrular
        Then close the application

      @US21_AC01_TC05

      Scenario:Ogrenci sınav notlarını gorebilmeli

        And Emin mennu butonuna tiklar
        And Emin Grades and Announcements yazisina tiklar
        Then Emin ders notlarini dogrular
        Then close the application

      @US21_AC01_TC06

      Scenario:Ogrenci, danismanin kendisi için oluşturdugu toplantilari gorebilmeli

        And Emin menuuu butonuna tiklar
        And Emin Gradess and Announcements yazisina tiklar
        Then Emin danismanin olusturdugu dersi dogrular
        Then close the application