package JTable;

public class Student extends Person{

    private String studentId;
    private String course;

    public Student(String name, String studentId) {
        super(name);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
