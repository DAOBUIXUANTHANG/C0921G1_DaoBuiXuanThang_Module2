package review.models;

public class Experience extends Candidate{
    private int yearOfExp;
    private String proSkill;

    public Experience() {
    }

    public Experience(String fistName, String lastName, String birthdate, String address, String phone, String email, int yearOfExp, String proSkill) {
        super(fistName, lastName, birthdate, address, phone, email);
        this.yearOfExp = yearOfExp;
        this.proSkill = proSkill;
    }

    public int getYearOfExp() {
        return yearOfExp;
    }

    public void setYearOfExp(int yearOfExp) {
        this.yearOfExp = yearOfExp;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return "Experience{" +
                "yearOfExp=" + yearOfExp +
                ", proSkill='" + proSkill + '\'' +
                "} " + super.toString();
    }
}
