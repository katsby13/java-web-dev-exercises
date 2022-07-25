package org.launchcode.java.demos.lsn3classes1;

public class Course {
    private String subject;
    private String teacher;
    private Student studentsInClass;

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
}
