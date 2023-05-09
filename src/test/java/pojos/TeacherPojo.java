package pojos;

public class TeacherPojo {
    private TeacherObjectPojo object;
    private String message;
    private String httpStatus;

    public TeacherPojo() {
    }

    public TeacherPojo(TeacherObjectPojo object, String message, String httpStatus) {
        this.object = object;
        this.message = message;
        this.httpStatus = httpStatus;
    }

    public TeacherObjectPojo getObject() {
        return object;
    }

    public void setObject(TeacherObjectPojo object) {
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
        return "TeacherPojo{" +
                "object=" + object +
                ", message='" + message + '\'' +
                ", httpStatus='" + httpStatus + '\'' +
                '}';
    }
}
