package review.models;

public class Intern extends Candidate{
    private String majors;
    private String semester;
    private String university;

    public Intern() {
    }

    public Intern(String fistName, String lastName, String birthdate, String address, String phone, String email, String majors, String semester, String university) {
        super(fistName, lastName, birthdate, address, phone, email);
        this.majors = majors;
        this.semester = semester;
        this.university = university;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
}
