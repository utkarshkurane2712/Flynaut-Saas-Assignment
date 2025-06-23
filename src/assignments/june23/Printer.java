package assignments.june23;

public class Printer {

    public void print(int value) {
        System.out.println("Integer: " + value);
    }

    public void print(String value) {
        System.out.println("String: " + value);
    }

    public void print(float value) {
        System.out.println("Float: " + value);
    }


    public static void main(String[] args) {
        Printer printer = new Printer();

        // Call print methods with different argument types
        printer.print(100);           // Integer
        printer.print("Hello World"); // String
        printer.print(45.67f);        // Float
    }
}
