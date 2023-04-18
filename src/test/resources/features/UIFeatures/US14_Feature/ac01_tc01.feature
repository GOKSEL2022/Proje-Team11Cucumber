@team11
         Feature:
           Scenario:
             Given Kuullanici "https://www.managementonschools.com/" giider
           When Kullanici Teacher Management sayfasının acildigini goruntuler
           And Kullanıcı Oluşturulan kullanıcılardan birine giriş yapar
           And Kullanıcı Teacher listten seçilen öğretmenin Edit butonuna tıklar
           Then Oluşturulann revetment Name, Phone Number, SSN,User Name bilgileri görülebilmeli
