package pojos;

public class Admin_GetAll_Pojo {

        private int id;
        private String username;
        private String ssn;
        private String name;
        private String surname;
        private String birthDay;
        private String birthPlace;
        private String phoneNumber;
        private String gender;
        private boolean built_in;

    public Admin_GetAll_Pojo() {
    }

    public Admin_GetAll_Pojo(int id, String username, String ssn, String name, String surname, String birthDay, String birthPlace, String phoneNumber, String gender, boolean built_in) {
        this.id = id;
        this.username = username;
        this.ssn = ssn;
        this.name = name;
        this.surname = surname;
        this.birthDay = birthDay;
        this.birthPlace = birthPlace;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.built_in = built_in;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
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

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isBuilt_in() {
        return built_in;
    }

    public void setBuilt_in(boolean built_in) {
        this.built_in = built_in;
    }

    @Override
    public String toString() {
        return "Admin_GetAll_Pojo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", ssn='" + ssn + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", birthPlace='" + birthPlace + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", gender='" + gender + '\'' +
                ", built_in=" + built_in +
                '}';
    }
}

