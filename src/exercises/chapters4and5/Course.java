package exercises.chapters4and5;

public class Course {

    private String courseName;
    private String subject;
    private String teacher;
    private Student studentsInClass;

    public Course(String courseName, String subject, String teacher, Student studentsInClass) {
        this.courseName = courseName;
        this.subject = subject;
        this.teacher = teacher;
        this.studentsInClass = studentsInClass;
    }

    public Course(String courseName, String subject, String teacher) {
        this.courseName = courseName;
        this.subject = subject;
        this.teacher = teacher;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getSubject() {
        return subject;
    }
    public void setSubject(String aSubject) {
        this.subject = aSubject;
    }

    public String getTeacher() {
        return teacher;
    }
    public void setTeacher(String aTeacher) {
        this.teacher = aTeacher;
    }

    public Student getStudentInClass() {
        return studentsInClass;
    }

//    cannot get setStudentsInClass to work as expected...
    public void setStudentsInClass(Student list) {
        this.studentsInClass = list;
    }

    public String toString() {
        String courseInfo = String.format("%s is a %s course taught by %s", this.getCourseName(), this.getSubject(), this.getTeacher());
        return courseInfo;
    }

    public boolean equals(Object toBeCompared) {
        if (toBeCompared == this) {
            return true;
        }
        if (toBeCompared == null) {
            return false;
        }
        if (toBeCompared.getClass() != getClass()) {
            return false;
        }
        Course newCourse = (Course) toBeCompared;
        return newCourse.getTeacher() == getTeacher();
    }
}
