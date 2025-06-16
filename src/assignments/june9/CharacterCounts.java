package assignments.june9;

import java.util.Scanner;

public class CharacterCounts {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String :");
        String s = sc.nextLine();

        int latters = 0;
        int numbers = 0;
        int spaces = 0;
        int others = 0;

        for (int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if (Character.isLetter(ch)){
                latters++;
            } else if (Character.isDigit(ch)) {
                numbers++;
            } else if (Character.isSpace(ch)) {
                spaces++;
            }
            else {
                others++;
            }
        }

        System.out.println("Letters: "+latters);
        System.out.println("Numbers: "+numbers);
        System.out.println("Spaces: "+spaces);
        System.out.println("Other Characters: "+others);
    }
}
