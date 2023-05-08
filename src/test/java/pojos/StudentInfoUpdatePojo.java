package pojos;

public class StudentInfoUpdatePojo {
    private int absenteeUpdate;
    private int educationTermId;
    private double finalExamUpdate;
    private String infoNoteUpdate;
    private int lessonId;
    private double midtermExamUpdate;

    public StudentInfoUpdatePojo() {
    }

    public StudentInfoUpdatePojo(int absenteeUpdate, int educationTermId, double finalExamUpdate, String infoNoteUpdate, int lessonId, double midtermExamUpdate) {
        this.absenteeUpdate = absenteeUpdate;
        this.educationTermId = educationTermId;
        this.finalExamUpdate = finalExamUpdate;
        this.infoNoteUpdate = infoNoteUpdate;
        this.lessonId = lessonId;
        this.midtermExamUpdate = midtermExamUpdate;
    }

    public int getAbsenteeUpdate() {
        return absenteeUpdate;
    }

    public void setAbsenteeUpdate(int absenteeUpdate) {
        this.absenteeUpdate = absenteeUpdate;
    }

    public int getEducationTermId() {
        return educationTermId;
    }

    public void setEducationTermId(int educationTermId) {
        this.educationTermId = educationTermId;
    }

    public double getFinalExamUpdate() {
        return finalExamUpdate;
    }

    public void setFinalExamUpdate(double finalExamUpdate) {
        this.finalExamUpdate = finalExamUpdate;
    }

    public String getInfoNoteUpdate() {
        return infoNoteUpdate;
    }

    public void setInfoNoteUpdate(String infoNoteUpdate) {
        this.infoNoteUpdate = infoNoteUpdate;
    }

    public int getLessonId() {
        return lessonId;
    }

    public void setLessonId(int lessonId) {
        this.lessonId = lessonId;
    }

    public double getMidtermExamUpdate() {
        return midtermExamUpdate;
    }

    public void setMidtermExamUpdate(double midtermExamUpdate) {
        this.midtermExamUpdate = midtermExamUpdate;
    }

    @Override
    public String toString() {
        return "StudentInfoUpdatePojo{" +
                "absenteeUpdate=" + absenteeUpdate +
                ", educationTermId=" + educationTermId +
                ", finalExamUpdate=" + finalExamUpdate +
                ", infoNoteUpdate='" + infoNoteUpdate + '\'' +
                ", lessonId=" + lessonId +
                ", midtermExamUpdate=" + midtermExamUpdate +
                '}';
    }
}
