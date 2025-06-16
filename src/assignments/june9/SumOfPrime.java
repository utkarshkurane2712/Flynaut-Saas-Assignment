package assignments.june9;

public class SumOfPrime {

    public static void main(String[] args) {
        int sum = 0;
        int count = 0;

        for (int number = 2; count<100; number++){
            boolean isPrime = true;

            for (int i=2; i<number; i++){
                if (number % i == 0){
                    isPrime = false;
                    break;
                }
            }

            if (isPrime){
                sum += number;
                count++;
            }
        }

        System.out.println("Sum of first 100 prime numbers: "+sum);
    }
}
