package review.service;

import review.models.Fresher;
import review.models.Intern;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InternList implements CandidateSevic {

    static List<Intern> internList = new ArrayList<>();
    static {
        internList.add(new Intern("Madeleine", "Maria", "1990", "Sao paulo", "940394", "Maria@asante.com","java","2022", "CodeGyms"));
        internList.add(new Intern("Csokán", "Babett", "1990", "Sao paulo", "940394", "Babett@asante.com","java","2022", "CodeGyms"));
        internList.add(new Intern("Joana", "Filipa", "1990", "Sao paulo", "940394", "Maria@asante.com","java","2022", "CodeGyms"));
    }

    @Override
    public void addNew() {
        Scanner sc = new Scanner(System.in);
        Intern newExp = new Intern();

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

        System.out.println("enter majors ");
        newExp.setMajors(sc.nextLine());

        System.out.println("enter semester ");
        newExp.setSemester(sc.nextLine());

        System.out.println("enter university ");
        newExp.setUniversity(sc.nextLine());
    }

    @Override
    public void search() {
        System.out.println("enter last name ");
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        boolean check = this.check(input);

        if (check){
            for (Intern e :
                    internList) {
                if (input.equals(e.getLastName())) {
                    System.out.println(e.toString());
                }
            }
        } else {
            System.out.println("k tim thay");
        }

    }

    @Override
    public void display() {
        for (Intern e :
                internList) {
            System.out.println(e);
        }
    }

    @Override
    public boolean check(String lastName) {
        for (Intern e :
                internList) {
            if (lastName.equals(e.getLastName())) {
                return true;
            }
        }
        return false;
    }
}
