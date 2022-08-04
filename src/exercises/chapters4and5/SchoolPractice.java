package exercises.chapters4and5;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student me = new Student("Katlyn", 1313);
        Student j = new Student("Jon", 1337);
        Student me2 = new Student("K", 1313);

        System.out.println(me.getName());
        System.out.println(me.getStudentId());
        System.out.println(me.getNumberOfCredits());
        System.out.println(me.getGpa());
        System.out.println(me.getGradeLevel());
        System.out.println(me.studentInfo());

        me.addGrade(4,2);

        System.out.println(me.getNumberOfCredits());
        System.out.println(me.getGpa());

        me.addGrade(2,4);

        System.out.println(me.getNumberOfCredits());
        System.out.println(me.getGpa());

        System.out.println(me.toString());

        System.out.println(me.equals(j));
        System.out.println(me.equals(me2));


        Teacher sarkees = new Teacher();

        sarkees.setFirstName("Gavin");
        sarkees.setLastName("Sarkees");
        sarkees.setSubject("History");
        sarkees.setYearsTeaching(13.0);

//        System.out.println(sarkees.getFirstName());
//        System.out.println(sarkees.getLastName());
//        System.out.println(sarkees.getSubject());


        Course americanHistory = new Course("American History", "History", "Gavin Sarkees");
        Course chemistry = new Course("Chemistry", "Science", "John Ackley");
        Course americanHistory2 = new Course("American History", "History", "Gavin Sarkees");

        americanHistory.setStudentsInClass(me);

        System.out.println(americanHistory.toString());
        System.out.println(americanHistory.equals(chemistry));
        System.out.println((americanHistory2.equals(americanHistory)));

//        System.out.println(americanHistory.getStudentInClass());

    }
}
