package assignments.june9;

import java.util.Scanner;

public class TriangleArea {

    void calculateArea(double base, double height) {
        double area = (base * height) / 2;
        System.out.println("Area of the triangle: " + area);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base of the triangle: ");
        double base = sc.nextDouble();

        System.out.print("Enter height of the triangle: ");
        double height = sc.nextDouble();

        TriangleArea obj = new TriangleArea();
        obj.calculateArea(base, height);

    }

}
