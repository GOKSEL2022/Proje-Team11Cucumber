package pojos;

public class StudentInfoRootPojo {
    private StudentInfoObjectPojo studentInfoObjectPojo;
    private String message;
    private String httpStatus;

    public StudentInfoRootPojo() {
    }

    public StudentInfoRootPojo(StudentInfoObjectPojo studentInfoObjectPojo, String message, String httpStatus) {
        this.studentInfoObjectPojo = studentInfoObjectPojo;
        this.message = message;
        this.httpStatus = httpStatus;
    }

    public StudentInfoObjectPojo getStudentInfoObjectPojo() {
        return studentInfoObjectPojo;
    }

    public void setStudentInfoObjectPojo(StudentInfoObjectPojo studentInfoObjectPojo) {
        this.studentInfoObjectPojo = studentInfoObjectPojo;
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
        return "StudentInfoRootPojo{" +
                "studentInfoObjectPojo=" + studentInfoObjectPojo +
                ", message='" + message + '\'' +
                ", httpStatus='" + httpStatus + '\'' +
                '}';
    }
}
