package assignments.june09;

import java.util.Scanner;

public class StringToInteger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        String strNum = sc.nextLine();

        int num = Integer.parseInt(strNum);

        System.out.println("Converted Integer "+num );
    }
}
