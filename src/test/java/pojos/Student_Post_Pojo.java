package pojos;

public class Student_Post_Pojo {

    public Student_Post_Object_Pojo object;
    public String message;


    public Student_Post_Pojo() {
    }

    public Student_Post_Pojo(Student_Post_Object_Pojo object, String message) {
        this.object = object;
        this.message = message;
    }

    public Student_Post_Object_Pojo getObject() {
        return object;
    }

    public void setObject(Student_Post_Object_Pojo object) {
        this.object = object;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Student_Post_Pojo{" +
                "object=" + object +
                ", message='" + message + '\'' +
                '}';
    }
}
