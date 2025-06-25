package assignments.june09;

public class SecondLowest {

    public static void main(String[] args) {
        int[] numbers = {12, 45, 7, 23, 89, 5, 90, 5};

        int lowest = Integer.MAX_VALUE;
        int secondLowest = Integer.MAX_VALUE;

        for (int num : numbers) {
            if (num < lowest) {
                secondLowest = lowest;
                lowest = num;
            } else if (num < secondLowest && num != lowest) {
                secondLowest = num;
            }
        }

        if (secondLowest == Integer.MAX_VALUE) {
            System.out.println("There is no distinct second lowest number.");
        } else {
            System.out.println("The second lowest number is: " + secondLowest);
        }
    }
}
