package assignments.june09;

import java.util.Scanner;

public class TimeConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total Seconds: ");
        int totalSeconds = sc.nextInt();

        int hours = totalSeconds/3600;
        int minutes = (totalSeconds % 3600) / 60;
        int secoonds = totalSeconds % 60;

        System.out.println("Time: "+hours+" Hours "+minutes+" Minutes "+secoonds+" Seconds.");
    }
}
