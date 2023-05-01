package pojos;

public class Guest_User_Pojo {
    private Guest_User_Object_Pojo object;
    private String message;
    private String httpStatus;

    public Guest_User_Pojo() {
    }

    public Guest_User_Pojo(Guest_User_Object_Pojo object, String message, String httpStatus) {
        this.object = object;
        this.message = message;
        this.httpStatus = httpStatus;
    }

    public Guest_User_Object_Pojo getObject() {
        return object;
    }

    public void setObject(Guest_User_Object_Pojo object) {
        this.object = object;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(String httpStatus) {
        this.httpStatus = httpStatus;
    }

    @Override
    public String toString() {
        return "Guest_User_Pojo{" +
                "object=" + object +
                ", message='" + message + '\'' +
                ", httpStatus='" + httpStatus + '\'' +
                '}';
    }
}
