package pojos;

public class AddAdminAcPojo {

    private AddAdminExPojo object;
    private String message ;
    private String httpStatus ;

    public AddAdminAcPojo() {
    }

    public AddAdminAcPojo(AddAdminExPojo object, String message, String httpStatus) {
        this.object = object;
        this.message = message;
        this.httpStatus = httpStatus;
    }

    public AddAdminExPojo getObject() {
        return object;
    }

    public void setObject(AddAdminExPojo object) {
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
        return "AddAdminPojo{" +
                "object=" + object +
                ", message='" + message + '\'' +
                ", httpStatus='" + httpStatus + '\'' +
                '}';
    }
}
