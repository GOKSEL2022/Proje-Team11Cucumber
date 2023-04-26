package pojos;

public class Vice_Dean_Controller_Root_Pojo {
    private Vice_Dean_Controller_Object_Pojo object;
    private String message;
    private String httpStatus;

    public Vice_Dean_Controller_Root_Pojo() {
    }

    public Object getObject() {
        return object;
    }

    public Vice_Dean_Controller_Root_Pojo(Vice_Dean_Controller_Object_Pojo object, String message, String httpStatus) {
        this.object = object;
        this.message = message;
        this.httpStatus = httpStatus;
    }

    public void setObject(Vice_Dean_Controller_Object_Pojo object) {
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
        return "Vice_Dean_Controller_Root_Pojo{" +
                "object=" + object +
                ", message='" + message + '\'' +
                ", httpStatus='" + httpStatus + '\'' +
                '}';
    }
}
