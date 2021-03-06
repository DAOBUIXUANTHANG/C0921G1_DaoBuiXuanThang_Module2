package review.service;

import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;
import review.models.Experience;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExperienceList implements CandidateSevic{
    public static List<Experience> exceptionList = new ArrayList<>();
    static {
        exceptionList.add(new Experience("Aelbrecht", "Stefan", "1990" , "USA", "0001239412", "Stefan@asante.com", 5, "code"));
        exceptionList.add(new Experience("Aguirre", "Eva", "1997" , "Frank", "0342912658", "Eva@asante.com", 6, "Java"));
        exceptionList.add(new Experience("Ahlgren", "Maria", "1965" , "UK", "0001239432", "Stefan@asante.com", 5, "PHP"));
        exceptionList.add(new Experience("Antošová", "Adeleva", "1990" , "USA", "0001322394", "Stefan@asante.com", 5, "C++"));
        exceptionList.add(new Experience("Dao", "Thang", "2000" , "USA", "0420312394", "Stefan@asante.com", 5, "sleep"));
    }

    @Override
    public void addNew() {
        Scanner sc = new Scanner(System.in);
        Experience newExp = new Experience();

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

        System.out.println("enter year of experience ");
        newExp.setYearOfExp(sc.nextInt());

        System.out.println("enter professional skill ");
        newExp.setProSkill(sc.nextLine());

        display();

    }

    @Override
    public void search() {

        System.out.println("enter last name ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        boolean check = this.check(input);
        if (check){
            for (Experience e :
                    exceptionList) {
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
        for (Experience e :
                exceptionList) {
            System.out.println(e);
        }
    }

    @Override
    public boolean check(String lastName) {

        for (Experience e :
                exceptionList) {
            if (lastName.equals(e.getLastName())) {
                return true;
            }
        }
        return false;
    }

}
