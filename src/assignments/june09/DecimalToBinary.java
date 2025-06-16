package assignments.june09;

import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Decimal Number :");
        int decimal = sc.nextInt();

        String binary = Integer.toBinaryString(decimal);

        System.out.println("Binary Representation is "+binary);
    }
}
