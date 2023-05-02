package pojos;

public class Admin_Pojo {
    private Admin_Object_Pojo object;
    private String message;
    private String httpStatus;

    public Admin_Pojo() {
    }

    public Admin_Pojo(Admin_Object_Pojo object, String message, String httpStatus) {
        this.object = object;
        this.message = message;
        this.httpStatus = httpStatus;
    }

    public Admin_Object_Pojo getObject() {
        return object;
    }

    public void setObject(Admin_Object_Pojo object) {
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
        return "Admin_Pojo{" +
                "object=" + object +
                ", message='" + message + '\'' +
                ", httpStatus='" + httpStatus + '\'' +
                '}';
    }
}

