package review.service;

import review.models.Experience;
import review.models.Fresher;

import java.util.ArrayList;
import java.util.List;

public class FresherList implements CandidateSevic{
    static List<Fresher> fresherList = new ArrayList<>();
    static {
        fresherList.add(new Fresher("Barbosa De", "Souza", "1990", "Sao paulo", "940394", "Souza@asante.com", "2018", "A", "hawai"));
        fresherList.add(new Fresher("Cabrera", "Cornide", "1990", "Sao paulo", "940394", "Souza@asante.com", "2018", "A", "hawai"));
        fresherList.add(new Fresher("Calderon", "Cuevas", "1990", "Sao paulo", "940394", "Souza@asante.com", "2018", "A", "hawai"));
        fresherList.add(new Fresher("Casulari", "Motta", "1990", "Sao paulo", "940394", "Souza@asante.com", "2018", "A", "hawai"));
    }

    @Override
    public void addNew() {
        
    }

    @Override
    public void edit() {

    }

    @Override
    public void search() {

    }

    @Override
    public void display() {

    }

    @Override
    public boolean check(String lastName) {
        return false;
    }
}
