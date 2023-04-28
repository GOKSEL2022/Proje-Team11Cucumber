package pojos;

public class StudentInfoPojo {
    private int absentee;
    private int educationTermId;
    private double finalExam;
    private String infoNote;
    private int lessonId;
    private double midtermExam;
    private int studentId;

    public StudentInfoPojo() {
    }

    public StudentInfoPojo(int absentee, int educationTermId, double finalExam, String infoNote, int lessonId, double midtermExam, int studentId) {
        this.absentee = absentee;
        this.educationTermId = educationTermId;
        this.finalExam = finalExam;
        this.infoNote = infoNote;
        this.lessonId = lessonId;
        this.midtermExam = midtermExam;
        this.studentId = studentId;
    }

    public int getAbsentee() {
        return absentee;
    }

    public void setAbsentee(int absentee) {
        this.absentee = absentee;
    }

    public int getEducationTermId() {
        return educationTermId;
    }

    public void setEducationTermId(int educationTermId) {
        this.educationTermId = educationTermId;
    }

    public double getFinalExam() {
        return finalExam;
    }

    public void setFinalExam(double finalExam) {
        this.finalExam = finalExam;
    }

    public String getInfoNote() {
        return infoNote;
    }

    public void setInfoNote(String infoNote) {
        this.infoNote = infoNote;
    }

    public int getLessonId() {
        return lessonId;
    }

    public void setLessonId(int lessonId) {
        this.lessonId = lessonId;
    }

    public double getMidtermExam() {
        return midtermExam;
    }

    public void setMidtermExam(double midtermExam) {
        this.midtermExam = midtermExam;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "StudentInfoPojo{" +
                "absentee=" + absentee +
                ", educationTermId=" + educationTermId +
                ", finalExam=" + finalExam +
                ", infoNote='" + infoNote + '\'' +
                ", lessonId=" + lessonId +
                ", midtermExam=" + midtermExam +
                ", studentId=" + studentId +
                '}';
    }
}
