package assignments.june9;

import java.util.Scanner;

public class AsciiValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Character: ");
        char ch = sc.next().charAt(0);

        int ascii = (int) ch;

        System.out.println("ASCII value of "+ch+" is -> "+ascii);
    }
}
