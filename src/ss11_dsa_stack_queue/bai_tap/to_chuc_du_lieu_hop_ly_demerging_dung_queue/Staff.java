package ss11_dsa_stack_queue.bai_tap.to_chuc_du_lieu_hop_ly_demerging_dung_queue;

public class Staff {
    private String name ;
    private String gender;
    private String dateBirth;

    public Staff() {
    }

    public Staff(String name, String gender, String dateBirth) {
        this.name = name;
        this.gender = gender;
        this.dateBirth = dateBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", dateBirth='" + dateBirth + '\'' +
                '}';
    }
}
