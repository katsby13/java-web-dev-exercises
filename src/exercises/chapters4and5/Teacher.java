package exercises.chapters4and5;

public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private double yearsTeaching = 0.0;


    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String aFirstName) {
        this.firstName = aFirstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String aLastName) {
        this.lastName = aLastName;
    }

    public String getSubject() {
        return subject;
    }
    public void setSubject(String aSubject) {
        this.subject = aSubject;
    }

    private double getYearsTeaching() {
        return yearsTeaching;
    }
    public void setYearsTeaching(double aNumYearsTeaching) {
        this.yearsTeaching = aNumYearsTeaching;
    }
}