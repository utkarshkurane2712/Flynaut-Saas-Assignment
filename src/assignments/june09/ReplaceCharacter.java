package assignments.june09;

import java.util.Scanner;

public class ReplaceCharacter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Replace 'd' with 'f'
        String replaced = input.replace('d', 'f');

        // Output result
        System.out.println("Modified string: " + replaced);

        sc.close();
    }
}
