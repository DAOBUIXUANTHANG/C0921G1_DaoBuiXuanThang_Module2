package review.service;

public interface CandidateSevic {
    void addNew();
    void edit();
    void search();
    void display();
    boolean check(String lastName);

}
