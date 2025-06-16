package assignments.june16;

public class Dog extends Mammal{

    public void sound(){
        System.out.println("Barks");
    }

    public void showInfo(){
        sound();
        System.out.println("Has fur: "+hasFur());
    }
}
