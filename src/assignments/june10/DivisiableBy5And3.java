package assignments.june10;

import java.util.Scanner;

public class DivisiableBy5And3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        if(num % 5 == 0 && num % 3 ==0){
            System.out.println("Number is Divisible by Both 5 & 3.");
        }
        else {
            System.out.println("Number is Not Divisible by Both 5 & 3.");
        }
    }
}
