package test_data;

import java.util.HashMap;
import java.util.Map;

public class ManagementonSchoolsTestData {
    public Map<String, String> managementonSchoolsMapMethod(String message, String httpStatus){
        Map<String , String> managementonSchoolsMap = new HashMap<>();
        managementonSchoolsMap.put("message",message);
        managementonSchoolsMap.put("httpStatus",httpStatus);
        return managementonSchoolsMap;
    }
    public Map<String, Object> expectedDataMethod(Map<String , String> managementonSchoolsMap,Integer userId, String birthDay,String birthPlace,String gender,String name,
                                                  String password,String phoneNumber,String ssn,String surname,String username,



                                                   String email ){
        Map<String, Object> expectedData = new HashMap<>();
        if(managementonSchoolsMap != null){
            expectedData.put("managementonSchoolsMap",managementonSchoolsMap);
        }
        if(userId != null){
            expectedData.put("userId",userId);
        }
        if(birthDay != null){
            expectedData.put("birthDay",birthDay);
        }

        if(birthPlace != null){
            expectedData.put("birthPlace",birthPlace);
        }

        if(gender != null){
            expectedData.put("gender",gender);
        }
        if(name != null){
            expectedData.put("name",name);
        }
        if(password != null){
            expectedData.put("password",password);
        }

        if(phoneNumber != null){
            expectedData.put("phoneNumber",phoneNumber);
        }

        if(ssn != null){
            expectedData.put("ssn",ssn);
        }
        if(surname != null){
            expectedData.put("surname",surname);
        }

        if(username != null){
            expectedData.put("username",username);
        }

        if(email != null){
            expectedData.put("email",email);
        }

        return expectedData;
    }
}
