package pojos;

public class Dean_Pojo {

    private Dean_Object_Pojo object;
    private String message;
    private String httpStatus;

    public Dean_Pojo() {
    }

    public Dean_Pojo(Dean_Object_Pojo object, String message, String httpStatus) {
        this.object = object;
        this.message = message;
        this.httpStatus = httpStatus;
    }

    public Dean_Object_Pojo getObject() {
        return object;
    }

    public void setObject(Dean_Object_Pojo object) {
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
        return "Dean_Pojo{" +
                "object=" + object +
                ", message='" + message + '\'' +
                ", httpStatus='" + httpStatus + '\'' +
                '}';
    }
}
