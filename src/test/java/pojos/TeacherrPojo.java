package pojos;

public class TeacherrPojo {
    private Teacher_Object_Pojo object;
    private String message;
    private String httpStatus;

    public TeacherrPojo() {
    }

    public TeacherrPojo(Teacher_Object_Pojo object, String message, String httpStatus) {
        this.object = object;
        this.message = message;
        this.httpStatus = httpStatus;
    }

    public Teacher_Object_Pojo getObject() {
        return object;
    }

    public void setObject(Teacher_Object_Pojo object) {
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
        return "TeacherrPojo{" +
                "object=" + object +
                ", message='" + message + '\'' +
                ", httpStatus='" + httpStatus + '\'' +
                '}';
    }
}
