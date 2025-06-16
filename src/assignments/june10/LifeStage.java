package assignments.june10;

import java.util.Scanner;

public class LifeStage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();

        if(age < 13){
            System.out.println("You are Child.");
        }
        else if (age <= 19) {
            System.out.println("You age Teenager.");
        }
        else if (age <= 59) {
            System.out.println("You are Adult.");
        }
        else if (age >= 60) {
            System.out.println("You are Senior Citizen.");
        }
    }
}