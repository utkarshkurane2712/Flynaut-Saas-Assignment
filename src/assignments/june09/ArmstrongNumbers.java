package assignments.june09;

public class ArmstrongNumbers {

    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 1 and 600 are:");

        for (int num = 1; num <= 600; num++) {
            int original = num;
            int sum = 0;
            int digits = String.valueOf(num).length();

            int temp = original;
            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }

            if (sum == original) {
                System.out.println(original);
            }
        }
    }
}
