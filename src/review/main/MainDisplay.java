package review.main;

import review.service.ExperienceList;
import review.service.FresherList;
import review.service.InternList;

import java.util.Scanner;

public class MainDisplay {
    private static ExperienceList experienceList = new ExperienceList();
    private static FresherList fresherList = new FresherList();
    private static InternList internList = new InternList();
    public static void displayCandidatechoice(){
        System.out.println("1.add new Experience");
        System.out.println("2.add new Fresher");
        System.out.println("3.add new Internship");
        System.out.println("4. Searching");
        System.out.println("0. Exit");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        Scanner scanner = new Scanner(System.in);

        switch (choice){
            case 1:
                experienceList.addNew();
                experienceList.display();
                displayChoice();
                int choiceIn1 = scanner.nextInt();
                if (choiceIn1 == 1){
                    experienceList.addNew();
                    experienceList.display();
                } else if(choiceIn1 == 2){
                    displayCandidatechoice();
                } else {
                    System.out.println("nhap sai ");
                }
                break;
            case 2:
                fresherList.addNew();
                fresherList.display();
                displayChoice();
                int choiceIn2 = scanner.nextInt();
                if (choiceIn2 == 1){
                    fresherList.addNew();
                    fresherList.display();
                } else if(choiceIn2 == 2){
                    displayCandidatechoice();
                } else {
                    System.out.println("nhap sai ");
                }
                break;
            case 3:
                internList.addNew();
                internList.display();
                displayChoice();
                int choiceIn3 = scanner.nextInt();
                if (choiceIn3 == 1){
                    internList.addNew();
                    internList.display();
                } else if(choiceIn3 == 2){
                    displayCandidatechoice();
                } else {
                    System.out.println("nhap sai ");
                }
                break;
            case 4:
                System.out.println("please enter candidate list you want to search");
                System.out.println("1.Experience");
                System.out.println("2.Fresher");
                System.out.println("3.Internship");
                System.out.println("4. Return to main");
                int choiceIn4 = scanner.nextInt();
                switch (choiceIn4){
                    case 1:
                        experienceList.search();
                        displayCandidatechoice();
                        break;
                    case 2:
                        fresherList.search();
                        displayCandidatechoice();
                        break;
                    case 3:
                        internList.search();
                        displayCandidatechoice();
                        break;
                    case 4:
                        displayCandidatechoice();
                    default:
                        System.out.println("nhap sai");
                        break;
                }

                break;
            case 0:
                System.exit(0);
        }
    }

    public static void displayChoice(){
        System.out.println("do you want to continous or return main display");
        System.out.println("1. continous");
        System.out.println("2. return to main display");
    }
}
