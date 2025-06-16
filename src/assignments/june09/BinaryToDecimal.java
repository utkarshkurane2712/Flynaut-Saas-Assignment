package assignments.june09;

import java.util.Scanner;

public class BinaryToDecimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter Binary Number :");
        String binaryNum = sc.nextLine();

        int decimal = Integer.parseInt(binaryNum,2);

        System.out.println("Decimal representation :"+decimal);

        sc.close();

    }
}
