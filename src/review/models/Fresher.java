package review.models;

public class Fresher extends Candidate{
    private String graduatedTime;
    private String rankOfGraduated;
    private String university;

    public Fresher() {
    }

    public String getGraduatedTime() {
        return graduatedTime;
    }

    public void setGraduatedTime(String graduatedTime) {
        this.graduatedTime = graduatedTime;
    }

    public String getRankOfGraduated() {
        return rankOfGraduated;
    }

    public void setRankOfGraduated(String rankOfGraduated) {
        this.rankOfGraduated = rankOfGraduated;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public Fresher(String fistName, String lastName, String birthdate, String address, String phone, String email, String graduatedTime, String rankOfGraduated, String university) {
        super(fistName, lastName, birthdate, address, phone, email);
        this.graduatedTime = graduatedTime;
        this.rankOfGraduated = rankOfGraduated;
        this.university = university;
    }

    @Override
    public String toString() {
        return "Fresher{" +
                "graduatedTime='" + graduatedTime + '\'' +
                ", rankOfGraduated='" + rankOfGraduated + '\'' +
                ", university='" + university + '\'' +
                "} " + super.toString();
    }
}
