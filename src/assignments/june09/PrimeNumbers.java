package assignments.june09;

public class PrimeNumbers {

    boolean isPrime(int num) {
        if (num <= 1) return false;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
        }

        return true;
    }

    // Method to display prime numbers from 1 to 20
    void displayPrimes() {
        System.out.println("Prime numbers between 1 and 20:");
        for (int i = 1; i <= 20; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // for line break
    }

    public static void main(String[] args) {
        PrimeNumbers obj = new PrimeNumbers();
        obj.displayPrimes();
    }
}
