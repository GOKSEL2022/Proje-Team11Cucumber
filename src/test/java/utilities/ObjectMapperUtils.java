package utilities;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

public class ObjectMapperUtils {

    //<T> T ==> Herhangi bir data tipi
    //ObjectMapper().readValue(json, cls) methodu birinci parametrede aldığı String formatındaki Json datyı ikinci parametrede belirtilen Java objesine çevirir.
    public static <T> T convertJsonToJava(String json, Class<T> cls) {//Generic Method

        try {
            return new ObjectMapper().readValue(json, cls);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
