package review.models;

public class Candidate {
    private String fistName;
    private String lastName;
    private String birthdate;
    private String address;
    private String phone;
    private String email;

    public Candidate() {
    }

    public Candidate(String fistName, String lastName, String birthdate, String address, String phone, String email) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.birthdate = birthdate;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "fistName='" + fistName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                '}';
    }
}
