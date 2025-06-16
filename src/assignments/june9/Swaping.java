package assignments.june9;

public class Swaping {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Before swaping the value of a is "+ a +" and the value of b is "+ b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swaping the value of a is "+ a +" and the value of b is "+ b);
    }
}
