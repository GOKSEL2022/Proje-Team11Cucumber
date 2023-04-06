package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static Properties properties;
    // METHODU DEVREYE SOKABİLMEK İÇİN FİLEINPUTSTREAM İLE DOSYA YOLUNU BELİRTMEM GEREKİYOR
// METHODDAN ÖNCE ÇALIŞMASI İÇİN STATIC BLOK İÇERİSİNDE FİLEINPUTSTREAM'I OLUSTURMAM GEREKİYOR
    static { // herşeyden önce çalışması için
        String dosyaYolu = "configuration.properties";
        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);
            //dosya yolunu tanimladigimiz dosyayi okudu
            properties = new Properties(); // objeyi oluşturup değer atarız
            properties.load(fis);//fis'in okudugu bilgileri properties'e yukledi
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String getProperty(String key){
        /*
            test method'undan yolladigimiz string key degerini alip
        Properties class'indan getProperty() method'unu kullanarak
        bu key'e ait value'u bize getirdi
         */
        return properties.getProperty(key);
    }
}