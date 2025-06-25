package assignments.june09;

public class EvenOddCounter {

    public static void main(String[] args) {
        int[] numbers = {10, 21, 4, 45, 66, 93, 1};

        int evenCount = 0;
        int oddCount = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);
    }
}
