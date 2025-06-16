package assignments.june9;

import java.util.Scanner;

public class PatternSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number (n): ");
        int n = sc.nextInt();

        String nStr = String.valueOf(n);
        int nn = Integer.parseInt(nStr + nStr);
        int nnn = Integer.parseInt(nStr + nStr + nStr);

        int sum = n + nn + nnn;

        System.out.println("The Result of n + nn +nnn: "+n+" "+nn+" "+nnn+"= "+sum);
    }
}
