package exercises.chapters4and5;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = 0;
        this.gpa = 0;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }


    public String getGradeLevel() {
        if (numberOfCredits >= 90) {
            return "Senior";
        }
        if (numberOfCredits >= 60) {
            return "Junior";
        }
        if (numberOfCredits >= 30) {
            return "Sophomore";
        }
        else return "Freshman";
    }

    public double addGrade(int courseCredits, double grade) {
        double totalQualityScore = (this.gpa * this.numberOfCredits);
        double newTQS = (courseCredits * grade) + totalQualityScore;
        this.numberOfCredits += courseCredits;
        double newGPA = newTQS / this.numberOfCredits;
        this.gpa = newGPA;
        return this.gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        this.name = aName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int aStudentId) {
        this.studentId = aStudentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(int aNumberOfCredits) {
        this.numberOfCredits = aNumberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double aGpa) {
        this.gpa = aGpa;
    }

    public String toString() {
        String studentInfo = String.format("%s is a %s with ID number %d. %s has %d credits and a GPA of %f", this.name, this.getGradeLevel(), this.getStudentId(), this.name, this.getNumberOfCredits(), this.getGpa());
        return studentInfo;
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
        Student newStudent = (Student) toBeCompared;
        return newStudent.getStudentId() == getStudentId();
    }

}