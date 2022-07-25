package exercises.chapter4;

import org.launchcode.java.demos.lsn3classes1.Course;
import org.launchcode.java.demos.lsn3classes1.Student;
import org.launchcode.java.demos.lsn3classes1.Teacher;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student me = new Student();

        me.setName("Katlyn");
        me.setStudentId(1313);
        me.setNumberOfCredits(1);
        me.setGpa(4.0);

//        System.out.println(me.getName());
//        System.out.println(me.getStudentId());

        Teacher sarkees = new Teacher();

        sarkees.setFirstName("Gavin");
        sarkees.setLastName("Sarkees");
        sarkees.setSubject("History");
        sarkees.setYearsTeaching(13.0);

//        System.out.println(sarkees.getFirstName());
//        System.out.println(sarkees.getLastName());
//        System.out.println(sarkees.getSubject());


//        cannot get course class to work as expected; not even sure exactly how it is expected to work...
        org.launchcode.java.demos.lsn3classes1.Course americanHistory = new Course();

        americanHistory.setSubject("History");
        americanHistory.setTeacher(sarkees.getLastName());
        americanHistory.setStudentsInClass(me);

        System.out.println(americanHistory.getStudentInClass());

    }
}
