package review.service;

import review.models.Candidate;
import review.models.Experience;
import review.models.Fresher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        Scanner sc = new Scanner(System.in);
        Fresher newExp = new Fresher();

        System.out.println("enter fist name ");
        newExp.setFistName(sc.nextLine());

        System.out.println("enter last name ");
        newExp.setLastName(sc.nextLine());

        System.out.println("enter birthday ");
        newExp.setBirthdate(sc.nextLine());

        System.out.println("enter address name ");
        newExp.setAddress(sc.nextLine());

        System.out.println("enter phone ");
        newExp.setPhone(sc.nextLine());

        System.out.println("enter email ");
        newExp.setEmail(sc.nextLine());

        System.out.println("enter graduated time ");
        newExp.setGraduatedTime(sc.nextLine());

        System.out.println("enter rank of graduation ");
        newExp.setRankOfGraduated(sc.nextLine());

        System.out.println("enter university where student graduated");
        newExp.setUniversity(sc.nextLine());
    }

    @Override
    public void search() {
        System.out.println("enter last name ");
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        boolean check = this.check(input);
        if (check){
            for (Fresher e :
                    fresherList) {
                if (input.equals(e.getLastName())) {
                    System.out.println(e.toString());
                }
            }
        } else {
            System.out.println("cant find result");
        }

    }

    @Override
    public void display() {
        for (Fresher e :
                fresherList) {
            System.out.println(e);
        }
    }

    @Override
    public boolean check(String lastName) {
        for (Fresher e :
                fresherList) {
            if (lastName.equals(e.getLastName())) {
                return true;
            }
        }
        return false;
    }

}
