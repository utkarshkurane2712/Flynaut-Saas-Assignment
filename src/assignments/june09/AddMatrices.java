package assignments.june09;

public class AddMatrices {

    public static void main(String[] args) {
        // Define two 2x3 matrices
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] matrix2 = {
                {6, 5, 4},
                {3, 2, 1}
        };

        // Create a matrix to store the result
        int[][] sum = new int[2][3];

        // Add the matrices
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Print the result
        System.out.println("Sum of the two matrices:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
