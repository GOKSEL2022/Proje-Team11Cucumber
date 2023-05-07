package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AddAdminExPojo {

        private String username ;
        private String name ;
        private String surname ;
        private String birthDay ;
        private String ssn ;
        private Object birthPlace ;
        private String phoneNumber ;

        private String password;
        private String gender ;

    public AddAdminExPojo() {
    }

    public AddAdminExPojo(String username, String name, String surname, String birthDay, String ssn, Object birthPlace, String phoneNumber, String password, String gender) {
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.birthDay = birthDay;
        this.ssn = ssn;
        this.birthPlace = birthPlace;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.gender = gender;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public Object getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(Object birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "AddAdminExPojo{" +
                "username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", ssn='" + ssn + '\'' +
                ", birthPlace=" + birthPlace +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}

