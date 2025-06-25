package assignments.june09;

public class SecondLargest {

    public static void main(String[] args) {
        int[] numbers = {12, 45, 67, 23, 89, 45, 90, 89};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no distinct second largest number.");
        } else {
            System.out.println("The second largest number is: " + secondLargest);
        }
    }
}
