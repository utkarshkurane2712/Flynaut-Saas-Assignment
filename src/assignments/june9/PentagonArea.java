package assignments.june9;

import java.util.Scanner;

public class PentagonArea {

    void calculateArea(double side) {
        double area = (5 * side * side) / (4 * Math.tan(Math.PI / 5));
        System.out.println("Area of the pentagon: " + area);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of a side: ");
        double side = sc.nextDouble();

        PentagonArea obj = new PentagonArea();
        obj.calculateArea(side);

    }
}
