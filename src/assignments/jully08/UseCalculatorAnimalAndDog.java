package assignments.jully08;

public class UseCalculatorAnimalAndDog {

    public static void main(String[] args) {

        // Method Overloading
        System.out.println("🔢 Method Overloading Example:");
        Calculator calc = new Calculator();
        System.out.println("Addition of 2 and 3 is " + calc.add(2, 3));
        System.out.println("Addition of 2, 3 and 4 is" + calc.add(2, 3, 4));

        // Method Overriding
        System.out.println("\n🐾 Method Overriding Example:");
        Animal myAnimal = new Animal();
        myAnimal.makeSound(); // Calls base class method

        Animal myDog = new Dog();
        myDog.makeSound(); // Calls overridden method in Dog
    }
}
